# Console-Based E-Commerce Application

## 简介

这是一个基于 Java 控制台的轻量级电子商务管理系统，旨在提供一个简单、易用的商品和用户管理平台。系统通过文本文件存储数据，支持基本的电子商务操作。

## 功能特性

### 用户功能
- 用户注册与登录
- 浏览商品列表
- 购物车管理
- 商品购买

### 管理员功能
- 商品管理
- 用户信息管理
- 系统监控

## 技术亮点

- 面向对象设计
- 模块化架构
- 文件 I/O 操作
- 输入数据验证
- 控制台交互界面

## 环境要求

- JDK 8 或更高版本
- Maven（可选，用于依赖管理）

## 安装与运行

### 克隆项目

```bash  
git clone https://github.com/LAJENUNESSE/Console-Based_E-Commerce-_Javase.git  
cd Console-Based-E-Commerce
```
## 编译项目
使用 Maven 构建项目：

```bash 
mvn install  
```


或直接使用 javac 编译：
```bash 
javac Main.java  
```
## 运行应用程序
```bash 
# 使用 Maven  
mvn exec:java  

# 直接使用 Java  
java Main  
```
## 项目结构
```bash
Console-Based_E-Commerce_Javase /
├── .idea
├── out
├── src /
│   ├── main /
│   │   └── com /
│   │       ├── model 
│   │       │   ├── AdminService
│   │       │   ├── GoodService
│   │       │   └── UserService
│   │       ├── service /
│   │       │   ├── AdminService
│   │       │   ├── GoodService
│   │       │   └── UserService
│   │       └── util /
│   │       │   ├── AdminUtil
│   │       │   ├── TxtUtil
│   │       │   └── UserUtil
│   │       └── Main 
│   └── resources 
│       ├── Admin.txt 
│       ├── goods.txt 
│       ├── purchases.txt 
│       └── users.txt
└── test
    └── com
        └── service 
            └── GoodServiceTest
```

## 使用说明  
启动应用程序后，用户可以：  
- 注册新账户  
- 登录现有账户  
- 浏览商品列表  
- 将商品添加到购物车  
- 管理购物车  
- 完成购买  

## 代码示例

### 代码示例  

```java
public static void loadUsers(ArrayList<User> users, InputStream inputStream) throws IOException {  
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));  
    String line;  
    while ((line = reader.readLine()) != null) {  
        String[] userInfo = line.split(",");  
        User user = new User(userInfo[0], userInfo[1], userInfo[2], userInfo[3]);  
        user.setShoppingCart(new ArrayList<>());  
        users.add(user);  
    }  
}  
```

## 常见问题与解决方案  
#### 用户ID丢失：  
确保输入数据格式正确，包含所有必要字段
#### 购物车为空：  
检查添加商品到购物车的方法是否正确调用
#### 文件读写错误：  
验证文件路径和权限  

## 未来改进方向

1. 引入数据库存储
2. 实现密码加密
3. 添加日志记录
4. 完善权限管理
5. 开发图形界面
