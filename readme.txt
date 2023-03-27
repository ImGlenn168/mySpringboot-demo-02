src.main.java.com.java.myspringbootdemo02.Api
config：放配置类
controller：对外提供接口
src.main.java.com.java.myspringbootdemo02.App
service: 放业务逻辑类
utils：放工具类
src.main.java.com.java.myspringbootdemo02.Common
ar: 聚合
dto：返回给页面的对象
entity：实体类
enums：枚举类
po：对应数据库表，接收数据库数据
vo：实体类，可以在所有层进行传输
src.main.java.com.java.myspringbootdemo02.Domain
external：处理外部接口获取的数据，对内提供接口
persistence：处理数据库数据，对内提供数据接口
src.main.java.com.java.myspringbootdemo02.External
restTemplate.randomwords：获取外部接口的随机情话
src.main.java.com.java.myspringbootdemo02.Persistence
mapper：对应mapper.xml，对接数据库数据

Springboot项目，简单DDD架构
使用前请对领域层进行单元测试！