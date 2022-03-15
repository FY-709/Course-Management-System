<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>添加课程信息</title>
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
        <h4 class="text-center my-2">添加课程</h4>
        <form action="${pageContext.request.contextPath}/admin/addCourse" method="post">
            <div class="form-group">
                <label>课程编号</label>
                <input type="text" name="cNumber" class="form-control" placeholder="请输入课程编号">
            </div>
            <div class="form-group">
                <label>课程名称</label>
                <input type="text" name="cName" class="form-control" placeholder="请输入课程名称">
            </div>
            <div class="form-group">
                <label>任课教师</label>
                <input type="text" name="cTeacher" class="form-control" placeholder="请输入任课教师">
            </div>
            <div class="form-group">
                <label>上课时间（周次）</label>
                <input type="text" name="cWeek" class="form-control" placeholder="请输入上课时间（周次）">
            </div>
            <div class="form-group">
                <label>上课时间（节次）</label>
                <input type="text" name="cPart" class="form-control" placeholder="请输入上课时间（节次）">
            </div>
            <div class="form-group">
                <label>所在教室</label>
                <input type="text" name="cClassroom" class="form-control" placeholder="请输入所在教室">
            </div>
            <div class="form-group">
                <label>限选人数</label>
                <input type="text" name="cCount" class="form-control" placeholder="请输入限选人数">
            </div>
            <br>
            <button type="submit" class="btn btn-outline-primary btn-block">添加</button>
        </form>
    </div>
</div>
</body>
</html>
