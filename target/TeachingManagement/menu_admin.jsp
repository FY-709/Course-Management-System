<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>管理员菜单</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">
    管理员，<%out.print(uName);%>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a>
</div>

<div class="container col-4 my-3" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h5 class="text-center my-2">教师管理</h5>
        <form action="${pageContext.request.contextPath}/admin_addTeacher.jsp">
            <button type="submit" class="btn btn-outline-primary btn-block">添加教师</button>
        </form>
        <form action="${pageContext.request.contextPath}/admin/selectTeacher">
            <button type="submit" class="btn btn-outline-primary btn-block">修改教师</button>
        </form>
        <br>
        <h5 class="text-center my-2">课程管理</h5>
        <form action="${pageContext.request.contextPath}/admin_addCourse.jsp">
            <button type="submit" class="btn btn-outline-primary btn-block">添加课程</button>
        </form>
        <form action="${pageContext.request.contextPath}/admin/selectCourse">
            <button type="submit" class="btn btn-outline-primary btn-block">修改课程</button>
        </form>
        <br>
        <h5 class="text-center my-2">教室管理</h5>
        <form action="${pageContext.request.contextPath}/admin_addClassroom.jsp">
            <button type="submit" class="btn btn-outline-primary btn-block">添加教室</button>
        </form>
        <form action="${pageContext.request.contextPath}/admin/selectClassroom">
            <button type="submit" class="btn btn-outline-primary btn-block">修改教室</button>
        </form>
    </div>
</div>
</body>
</html>
