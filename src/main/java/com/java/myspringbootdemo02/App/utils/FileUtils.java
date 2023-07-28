package com.java.myspringbootdemo02.App.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;


public class FileUtils {

    private static Logger log = LoggerFactory.getLogger(FileUtils.class);

    public void moveFiles() {
        Queue<File> queue = new ConcurrentLinkedDeque<>();
        String pathName = "";
        File file = new File(pathName);
        if (file.exists()) {
            readFile(pathName, queue);
        }
        while (!queue.isEmpty()) {
            File f = queue.poll();
            // 获取文件名
            String fileName = f.getName();
            // 获取去掉后缀的文件名
            String[] split = fileName.split(".");
            String name = split[0];
            String format = split[1];
            Date date = new Date();
            long time = date.getTime();
            String newName = name + time + "." + format;

            // 路径
            String absolutePath = f.getAbsolutePath();
            Path oldPath = Paths.get(absolutePath);
            Path newPath = Paths.get(newName);

            // 路径移动
            boolean flag = false;
            try {
                log.info("start....");
                Files.move(oldPath, newPath, StandardCopyOption.REPLACE_EXISTING);
                log.info("end....");
                flag = true;
            } catch (IOException e) {
                log.info("move failed....");
                throw new RuntimeException(e);
            }
            if (flag) {
                // TODO business logic
            }
        }
    }

    private void readFile(String pathName, Queue<File> queue) {
        File file = new File(pathName);
        if (!file.isDirectory()) {
            queue.add(file);
        } else if (file.isDirectory()) {
            for (String path : file.list()) {
                readFile(pathName + "/" + path, queue);
            }
        }
    }
}
