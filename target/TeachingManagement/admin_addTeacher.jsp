<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>添加教师信息</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">
    <a href="${pageContext.request.contextPath}/menu_admin.jsp"
       style="text-decoration: none; color: #000000;">管理员，<%out.print(uName);%></a>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a>
</div>

<div class="container col-4 my-3" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h4 class="text-center my-2">添加教师</h4>
        <form action="${pageContext.request.contextPath}/admin/addTeacher" method="post">
            <div class="form-group">
                <label>教师编号</label>
                <input type="text" name="tNumber" class="form-control" placeholder="请输入教师编号">
            </div>
            <div class="form-group">
                <label>教师姓名</label>
                <input type="text" name="tName" class="form-control" placeholder="请输入教师姓名">
            </div>
            <div class="form-group">
                <label>所在专业</label>
                <input type="text" name="tMajor" class="form-control" placeholder="请输入所在专业">
            </div>
            <div class="form-group">
                <label>教授课程</label>
                <input type="text" name="tClass" class="form-control" placeholder="请输入教授课程">
            </div>
            <div class="form-group">
                <label>联系方式</label>
                <input type="text" name="tContact" class="form-control" placeholder="请输入联系方式">
            </div>
            <br>
            <button type="submit" class="btn btn-outline-primary btn-block">添加</button>
        </form>
    </div>
</div>
</body>
</html>
