# XR-Live全景互动直播后端 
Powered By renren-fast

### 项目说明：
- 本项目是全景互动直播后端项目，为全景控制编辑端、观看端等提供接口支持
<br>

### 相关技术选型： 
- 核心框架：Spring Boot 2.1
- 安全框架：Apache Shiro 1.4
- 视图框架：Spring MVC 5.0
- 持久层框架：MyBatis 3.3
- 定时器：Quartz 2.3
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
<br> 

### 项目结构： 
- 注：部分模块暂时用不到，保留在项目中，后期按需移除。
```
xr-live
├─db  项目SQL语句
│
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─app API接口模块(APP调用)
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─XRLiveApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  └─static 静态资源

```

<br> 

### 如何开始：
#### 1.下载代码
```
git clone  
```
#### 2. IDEA导入项目
IDEA打开项目，并安装插件lombok插件，不然会提示找不到entity的get set方法
#### 3. 修改数据库配置 
1. 修改application-dev.yml 中数据库相关配置，注意相关敏感信息勿提交到代码中
2. 如果没有可用的数据库，需要自行部署mysql，并执行db目录中的mysql.sql语句创建相关数据表
#### 4. 启动
执行XRLiveApplicaion.java，启动项目

### 相关资源与路径
- 
- Swagger文档路径：http://localhost:8080/renren-fast/swagger/index.html
- Swagger注解路径：http://localhost:8080/renren-fast/swagger-ui.html
