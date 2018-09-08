<%--
  Created by IntelliJ IDEA.
  User: Kohath
  Date: 2018/9/7
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<div align="center">
    <form action="/springboot_04/user/login" method="post">
    用户名：<input type="text" id="username" name="username"><br>
    密码1：<input type="text" id="password" name="password"><br>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
