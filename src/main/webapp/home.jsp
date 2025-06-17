<%@ page import="uz.app.todoappforg52.entity.UserEntity" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: bobur
  Date: 17/06/25
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>

<% UserEntity user = (UserEntity) request.getAttribute("user");%>
<% List<UserEntity> users = (List<UserEntity>) request.getAttribute("users");%>

<h1>Home Page</h1>
<h3>Welcome <%= user.getFirstName()+" "+user.getLastName()%></h3>

<c:forEach var="user" items="${users}">
    <p>${user.username}</p>
</c:forEach>



</body>
</html>
