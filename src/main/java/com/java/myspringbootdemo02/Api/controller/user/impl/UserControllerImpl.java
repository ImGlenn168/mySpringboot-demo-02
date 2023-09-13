package com.java.myspringbootdemo02.Api.controller.user.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.excel.util.StringUtils;
import com.alibaba.excel.write.builder.ExcelWriterBuilder;
import com.alibaba.excel.write.builder.ExcelWriterSheetBuilder;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.java.myspringbootdemo02.Api.controller.user.UserController;
import com.java.myspringbootdemo02.Api.result.Result;
import com.java.myspringbootdemo02.App.exception.MyApplicationException;
import com.java.myspringbootdemo02.App.service.user.impl.UserServiceImpl;
import com.java.myspringbootdemo02.Common.anno.ApiOperationAnno;
import com.java.myspringbootdemo02.Common.anno.ApiOperationAnnoService;
import com.java.myspringbootdemo02.Common.convert.user.UserConvert;
import com.java.myspringbootdemo02.Common.convert.user.UserVoConvert;
import com.java.myspringbootdemo02.Common.entity.User;
import com.java.myspringbootdemo02.Common.vo.ApiOperator;
import com.java.myspringbootdemo02.Common.vo.UserQueryVo;
import com.java.myspringbootdemo02.Common.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
//@CrossOrigin("*")
public class UserControllerImpl implements UserController {

    private static final Logger log= LoggerFactory.getLogger(UserControllerImpl.class);
    @Autowired
    @Qualifier(value = "userService")
    private UserServiceImpl userService;
    @Autowired
    private ApiOperationAnnoService apiOperationAnnoService;

    public Result findByPageHelper(int currentPage,int pageSize,String userName, String startTime, String endTime){
        UserQueryVo userQueryVo = getUserQueryVo(userName, startTime, endTime);
        if (StringUtils.isEmpty(userQueryVo.getUserName()) && StringUtils.isEmpty(userQueryVo.getStartTime())
                && StringUtils.isEmpty(userQueryVo.getEndTime())){
            PageHelper.startPage(currentPage, pageSize);
            List<UserVo> userVos = userService.findAllUsers();
            PageInfo<UserVo> pageInfo = new PageInfo<>(userVos);
            pageInfo.setTotal(userService.findUserList(userQueryVo));
            if (userVos.size()==0){
                return Result.success(new PageInfo<UserVo>());
            }
            return Result.success(pageInfo);
        }else {
            PageHelper.startPage(currentPage, pageSize);
            List<UserVo> userVos = userService.findByCriteria(userQueryVo);
            PageInfo<UserVo> pageInfo = new PageInfo<>(userVos);
            pageInfo.setTotal(userService.findUserList(userQueryVo));
            if (userVos.size()==0){
                return Result.success(new PageInfo<UserVo>());
            }
            return Result.success(pageInfo);
        }
    }

    @Override
    public Result selectDeptList() {
        return Result.success(userService.selectDeptList());
    }

    @Override
    public Result selectStatusList() {
        return Result.success(userService.selectStatusList());
    }

    @Override
    public Result selectStateList() {
        return Result.success(userService.selectStateList());
    }

    @Override
    public Result getById(@PathVariable("id") int id) {
        UserVo byId = userService.getById(id);
        return Result.success(byId);
    }

    private UserQueryVo getUserQueryVo(String userName, String startTime, String endTime) {
        UserQueryVo userQueryVo = new UserQueryVo();
        if (!StringUtils.isEmpty(userName)) {
            userQueryVo.setUserName(userName);
        }
        if (!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)){
            userQueryVo.setStartTime(startTime.substring(0, 10));
            userQueryVo.setEndTime(endTime.substring(0, 10));
        }
        return userQueryVo;
    }

    @Override
    public Result findAllUsers() {
        return Result.success(userService.findAllUsers());
    }

    @Override
    public Result addUser(@RequestBody UserVo userVo) {
        if (ObjectUtils.isEmpty(userVo)){
            return Result.fail("用户不能为空");
        }
        if (StringUtils.isEmpty(userVo.getUserName())){
            return Result.fail("用户名不能为空");
        }
        if (StringUtils.isEmpty(userVo.getPassword())){
            return Result.fail("密码不能为空");
        }
        if (StringUtils.isEmpty(userVo.getPhone())){
            return Result.fail("电话不能为空");
        }
        int i = userService.addUser(userVo);
        return Result.getResult(i);
    }


    @Override
    public Result updateUserById(UserVo userVo) {
        int i = userService.updateUserById(userVo);
        return Result.getResult(i);
    }

    @Override
    @ApiOperationAnno(status = "admin", action = "根据id删除用户信息")
    public Result deleteUserById(UserVo user) {
        ApiOperator apiOperator = apiOperationAnnoService.buildApiOperationLog();
        if (!user.getStatus().equals(apiOperator.getStatus())){
            return Result.fail("权限不足！");
        }
        int i = userService.deleteUserById(user);
        apiOperator.setOperatorName(user.getUserName());
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-ss HH:mm:ss");
        String currentTime = format.format(date);
        apiOperator.setOperateTime(currentTime);
        return Result.getResult(i);
    }

    @Override
    public Result deleteUserByIds(List<Integer> ids) {
        return Result.getResult(userService.deleteUserByIds(ids));
    }

    @Override
    public Result findByPage(int currentPage, int pageSize, String userName, String startTime, String endTime) {
        UserQueryVo userQueryVo = getUserQueryVo(userName, startTime, endTime);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex", (currentPage - 1) * pageSize>1?(currentPage - 1) * pageSize:0);
        map.put("pageSize", pageSize);
        return Result.success(userService.findByPage(map,userQueryVo));
    }

    @Override
    public Result batchAdd(List<UserVo> list) {
        int i = userService.batchAdd(list);
        return Result.getResult(i);
    }


    public Result ExportExcel() {
        // 设置文件导出的路径
        String realPath = "E://wsfile/";
        File folder = new File(realPath);
        if (!folder.isDirectory()) {
            folder.mkdirs();
        }
        String fileName = realPath + "User" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为用户表 然后文件流会自动关闭
        try {
            ExcelWriterBuilder write = EasyExcel.write(fileName, User.class);
            ExcelWriterSheetBuilder userTable = write.sheet("用户表");
            List<User> data = getData();
            log.info("用户表导出数量："+data.size());
            System.err.println("用户表导出开始............");
            long start = System.currentTimeMillis();
            userTable.doWrite(data);
            long end = System.currentTimeMillis();
            long result=end-start;
            log.info("用户表导出所用到的时间："+result);
        } catch (Exception e) {
            throw new MyApplicationException("导出失败！");
        }
        return Result.success("下载成功，文件已存入：E:/wsfile/");
    }

    private List<User> getData() {
        // 查询用户表
        System.err.println("用户表查询开始............");
        long start = System.currentTimeMillis();
        List<UserVo> all = userService.findAllUsers();
        long end = System.currentTimeMillis();
        long result=end-start;
        log.info("用户表查询所用到的时间："+result);
        ArrayList<User> users = new ArrayList<>();
        for (UserVo userVo : all) {
            users.add(UserConvert.getUser(userVo));
        }
        return users;
    }


    public Result ImportExcel(MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) {
            return Result.fail();
        }
        // 这里需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        // 这里每次会读取3000条数据 然后返回过来 直接调用使用数据就行
        try {
            ArrayList<UserVo> userVos = new ArrayList<>();
            EasyExcel.read(multipartFile.getInputStream(), User.class, new PageReadListener<User>(dataList -> {
                for (User user : dataList) {
                    UserVo userVo = UserVoConvert.getUserVo(user);
                    userVos.add(userVo);
                }
                // 将导入的数据用mybatis添加进数据库
                userService.batchAdd(userVos);
            })).sheet().doRead();
        } catch (Exception e) {
            throw new MyApplicationException("导入失败："+e);
        }
        return Result.success();
    }
}
