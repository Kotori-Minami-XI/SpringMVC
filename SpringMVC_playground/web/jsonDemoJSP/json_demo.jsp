<%--
  Created by IntelliJ IDEA.
  User: 码蚁小强
  Date: 19/2/3
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>$Title$</title>

</head>
<body>




<input type="button" id="getJson_btn" value="请求JSON">
<input type="button" id="submitJson_btn" value="发送JSON">

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">

    $("#getJson_btn").click(function () {
        //发送Ajax请求
        $.post("${pageContext.request.contextPath}/getJson.action", function (data) {
            console.log(data);
        });
    });

    $("#submitJson_btn").click(function () {

        $.ajax({
            type: "post",
            url : "${pageContext.request.contextPath}/submitJson.action",
            data : {username : 12},
            contentType : "application/json",
            success : function (data) {
                console.log(data);
            }});

    });


</script>

</body>
</html>
