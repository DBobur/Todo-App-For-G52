<%--
  Created by IntelliJ IDEA.
  User: bobur
  Date: 17/06/25
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>

<h1>Login Page</h1>

<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) { %>
<p style="color: red;"><%= error %></p>
<% } %>

<form action="login" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>

    <button type="submit">Login</button>
</form>

</body>
</html>
