<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Integer sNumber = Integer.parseInt(session.getAttribute("uName").toString());%>

<%%>
<html>
<head>
    <title>学生菜单</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">
    学生，<%out.print(sNumber);%>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a>
</div>

<div class="container col-4 my-3" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h5 class="text-center my-2">学生管理</h5>
        <form action="${pageContext.request.contextPath}/student/selectUnchosenCourse">
            <input type="hidden" name="sNumber" value="<%out.print(sNumber);%>"/>
            <button type="submit" class="btn btn-outline-primary btn-block">选择课程</button>
        </form>
        <form action="${pageContext.request.contextPath}/student/selectChosenCourse">
            <input type="hidden" name="sNumber" value="<%out.print(sNumber);%>"/>
            <button type="submit" class="btn btn-outline-primary btn-block">退选课程</button>
        </form>
        <form action="${pageContext.request.contextPath}/student/checkSource">
            <input type="hidden" name="sNumber" value="<%out.print(sNumber);%>"/>
            <button type="submit" class="btn btn-outline-primary btn-block">查询成绩</button>
        </form>
    </div>
</div>
</body>
</html>
