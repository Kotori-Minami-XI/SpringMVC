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
    <title>Json Demo</title>
</head>
<body>

<h1>请求JSON</h1>
<input type="button" id="getJson_btn" value="请求JSON"> <br>
<hr>

<h1>发送JSON</h1>
<form id="myForm">
    username:<input type="text" name="username"> <br>
    age:<input type="text" name="age"> <br>
    hobby:
    <input type="checkbox" name="hobby" value="篮球"> 篮球
    <input type="checkbox" name="hobby" value="足球"> 足球
    <input type="checkbox" name="hobby" value="羽毛球">羽毛球
</form>
<input type="button" value="发送JSON" id="submitJson_btn">

<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script type="text/javascript">


    (function($){
        $.fn.serializeJson=function(){
            var serializeObj={};
            var array=this.serializeArray();
            var str=this.serialize();
            $(array).each(function(){
                if(serializeObj[this.name]){
                    if($.isArray(serializeObj[this.name])){
                        serializeObj[this.name].push(this.value);
                    }else{
                        serializeObj[this.name]=[serializeObj[this.name],this.value];
                    }
                }else{
                    serializeObj[this.name]=this.value;
                }
            });
            return serializeObj;
        };
    })(jQuery);



    $("#getJson_btn").click(function () {
        //发送Ajax请求
        $.post("${pageContext.request.contextPath}/getJson.action", function (data) {
            console.log(data);
        });
    });

    $("#submitJson_btn").click(function () {
        var serialize = $("#myForm").serializeJson();
        if (typeof serialize.hobby == "String") {
            serialize.hobby = new Array(serialize.hobby);
        }


        $.ajax({
            type: "post",
            url : "${pageContext.request.contextPath}/submitJson.action",
            data : JSON.stringify(serialize),
            contentType : "application/json",
            success : function (data) {
                console.log(data);
            }});

    });


</script>

</body>
</html>
