<%--
  Created by IntelliJ IDEA.
  User: 17763
  Date: 2020/12/8
  Time: 20:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="account/findAll">测试</a>

        <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名:<input type="text" name="name"/><br/>
        金额:<input type="text" name="money"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>
</body>
</html>
