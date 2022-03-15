<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>用户登录</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div class="container col-4 my-5" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h4 class="text-center my-2">用户登录</h4>
        <form action="${pageContext.request.contextPath}/user/loginUser" method="post">
            <div class="form-group">
                <label>账号</label>
                <input type="text" name="uName" class="form-control" placeholder="请输入账号">
            </div>
            <div class="form-group">
                <label>密码</label>
                <input type="password" name="uPassword" class="form-control" placeholder="请输入密码">
            </div>
            <div class="form-group">
                <label>身份</label>
                <select name="uType" class="form-control">
                    <option value="学生">学生</option>
                    <option value="教师">教师</option>
                    <option value="管理员">管理员</option>
                </select>
            </div>
            <br>
            <button type="submit" class="btn btn-outline-primary btn-block">登录</button>
        </form>
        <form action="${pageContext.request.contextPath}/page_regUser.jsp">
            <button type="submit" class="btn btn-outline-primary btn-block">注册</button>
        </form>
    </div>
</div>
</body>
</html>
