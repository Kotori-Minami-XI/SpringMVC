<%--
  Created by IntelliJ IDEA.
  User: Kotori
  Date: 2020/4/25
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Receive Demo</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/getParamsByHttp.action?id=666&name=Kotori">传统方式接受参数</a> <br>
<hr>

<a href="${pageContext.request.contextPath}/autoGetParams.action?id=666&name=Kotori">自动类型转换，需要函数传参名保持一致</a> <br>
<hr>

<form action="${pageContext.request.contextPath}/getBean.action" method="post">
    user name: <input name="username" type="text"> <br>
    user age: <input name="age" type="text"> <br>
    user hobby:
    <input name="hobby" type="checkbox" value="computer">computer
    <input name="hobby" type="checkbox" value="basketball">basketball
    <input name="hobby" type="checkbox" value="football">football <br>

    ----Pet-------<br>
    pet name: <input name="dog.name" type="text"> <br>
    pet color: <input name="dog.color" type="text"> <br>

    ----Pet0-------<br>
    pet name: <input name="dogs[0].name" type="text"> <br>
    pet color: <input name="dogs[0].color" type="text"> <br>

    ----Pet1-------<br>
    pet name: <input name="dogs[1].name" type="text"> <br>
    pet color: <input name="dogs[1].color" type="text"> <br>

    <input type="submit" value="submit"> <br>
</form>
<hr>

<form action="${pageContext.request.contextPath}/getDateByConverter.action" method="post">
    user date: <input name="date" type="text"> <br>
    <input type="submit" value="submit"> <br>
</form>
<hr>





</body>
</html>
