<%--
  Created by IntelliJ IDEA.
  User: Kotori
  Date: 2020/4/25
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Restful Demo</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/rest/888888">restful风格的请求 id=888888</a> <br>
<hr>

<p>用form表单使用put和delete时，要先配置hiddenFilter，并且要用一个hidden的标签，设置name="_method" value="put" action中method="post"</p>
<form action="${pageContext.request.contextPath}/rest2/77777" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="submit">
</form>
<hr>

<a href="${pageContext.request.contextPath}/testHeader.action">测试RequestHeader</a> <br>
<hr>

<a href="${pageContext.request.contextPath}/testCookie.action">测试Cookie</a> <br>
<hr>

</body>
</html>
