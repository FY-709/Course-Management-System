<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生注册</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div class="container col-4 my-5" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h4 class="text-center my-2">学生注册</h4>
        <form action="${pageContext.request.contextPath}/user/regUser" method="post">
            <div class="form-group">
                <label>班级</label>
                <input type="text" name="sClass" class="form-control" placeholder="请输入班级">
            </div>
            <div class="form-group">
                <label>学号</label>
                <input type="text" name="uName" class="form-control" placeholder="请输入学号">
            </div>
            <div class="form-group">
                <label>姓名</label>
                <input type="text" name="sName" class="form-control" placeholder="请输入姓名">
            </div>
            <div class="form-group">
                <label>年龄</label>
                <input type="text" name="sAge" class="form-control" placeholder="请输入年龄">
            </div>
            <div class="form-group">
                <label>密码</label>
                <input type="text" name="uPassword" class="form-control" placeholder="请输入密码">
            </div>
            <br>
            <button type="submit" class="btn btn-outline-primary btn-block">注册</button>
        </form>
        <form action="${pageContext.request.contextPath}/page_loginUser.jsp">
            <button type="submit" class="btn btn-outline-primary btn-block">登录</button>
        </form>
    </div>
</div>
</body>
</html>
