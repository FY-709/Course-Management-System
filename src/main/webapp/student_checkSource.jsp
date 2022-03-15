<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Integer sNumber = Integer.parseInt(session.getAttribute("uName").toString());%>

<html>
<head>
    <title>查询成绩</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">
    <a href="${pageContext.request.contextPath}/menu_student.jsp"
       style="text-decoration: none; color: #000000;">学生，<%out.print(sNumber);%></a>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a>
</div>

<div class="container my-3" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h4 class="text-center my-2">课程信息</h4>
        <div class="table-responsive">
            <table class="table text-center">
                <thead class="thead-light">
                <tr>
                    <th scope="col">课程编号</th>
                    <th scope="col">课程名称</th>
                    <th scope="col">任课教师</th>
                    <th scope="col">课程成绩</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${scores}" var="score">
                    <tr>
                        <td>${score.cnumber}</td>
                        <td>${score.cname}</td>
                        <td>${score.cteacher}</td>
                        <td>${score.cscore}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>

<style>
    body {
        background-color: #f6f6f6;
    }

    .table th,
    .table td {
        vertical-align: middle !important;
    }
</style>
</html>
