<%@ page import="uz.app.todoappforg52.entity.UserEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: bobur
  Date: 17/06/25
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

<% UserEntity user = (UserEntity) request.getAttribute("user");%>

<h1>Home Page</h1>
<h3>Welcome <%= user.getFirstName()+" "+user.getLastName()%></h3>

</body>
</html>
