<%--
  Created by IntelliJ IDEA.
  User: Kotori
  Date: 2020/4/25
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First Demo</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/first.action">测试直接返回ModelAndView字符串的方式转发</a> <br>
<a href="${pageContext.request.contextPath}/second.action">测试直接返回Action字符串的方式转发</a> <br>
<a href="${pageContext.request.contextPath}/third.action">测试重定向</a> <br>

</body>
</html>
