<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@include file="/common/taglib.jsp" %><head>
    <title>Đăng Nhập</title>
</head>
<body>
<div id="formContent">
    <!-- Tabs Titles -->

    <!-- Icon -->
    <div class="fadeIn first">
        <img src="data:image/png;base64,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" id="icon" alt="User Icon" />
    </div>

    <!-- Login Form -->
    <form id="formLogin" method="post" action="c:url value" >
        <input type="text" id="login" class="fadeIn second" name="userName" id="userName" placeholder="login">
        <input type="text" id="password" class="fadeIn third" name="password" id="password" placeholder="password">
        <input type="hidden" value="login" name="action"/>
        <input type="submit" class="fadeIn fourth" value="Log In">
    </form>

    <!-- Remind Passowrd -->
    <div id="formFooter">
        <a class="underlineHover" href="#">Forgot Password?</a>
    </div>

</div>
</body>
</html>
