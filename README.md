# spring-cloud-learn
[![Build Status](https://travis-ci.org/cr6588/spring-cloud-learn.svg?branch=master)](https://travis-ci.org/cr6588/spring-cloud-learn)
#### 1. 创建数据库spring-cloud-learn

运行/spring-cloud-learn/spring-boot-mybatis/spring-boot-mybatis-dubbo-provider/src/main/resources/sql.sql创建表

#### 2. 配置host

    mysql.cr6588.com 数据库所在ip，使用3306端口

    zookeeper.cr6588.com zookeeper所在ip，使用2181端口，同时需要31001端口

#### 3. 安装zookeeper
#### 4. 启动spring-boot-mybatis-dubbo-provider

在/spring-cloud-learn/spring-boot-mybatis/spring-boot-mybatis-dubbo-provider/src/main/java/com/cr6588/App.java启动

#### 5. 启动spring-boot-mybatis-dubbo-consumer-web

在/spring-cloud-learn/spring-boot-mybatis/spring-boot-mybatis-dubbo-consumer-web/src/main/java/com/cr6588/App.java启动，内置tomcat会占用8080端口

#### 6. 启动vue-ele

在/spring-cloud-learn/spring-boot-mybatis/vue-ele目录

    npm install
    npm run serve

访问显示的地址，默认http://localhost:8081/
> 注：若spring-boot-mybatis-dubbo-consumer-web的tomcat更改成了其它端口，则/spring-cloud-learn/spring-boot-mybatis/vue-ele/vue.config.js中也需要进行更改。先启动vue-ele是8080端口会和spring-boot-mybatis-dubbo-consumer-web冲突，启动后有提示

#### 7. 部署

在/spring-cloud-learn/spring-boot-mybatis/vue-ele目录
npm run build将生成dist文件目录，复制该目录下所有文件到/spring-cloud-learn/spring-boot-mybatis/spring-boot-mybatis-dubbo-consumer-web/src/main/resources/static目录下，然后对spring-cloud-learn进行mvn clean install，再分别对spring-boot-mybatis-dubbo-provider与spring-boot-mybatis-dubbo-consumer-web进行java -jar即可
