<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Integer tNumber = Integer.parseInt(session.getAttribute("uName").toString());%>

<html>
<head>
    <title>录入成绩</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">
    <a href="${pageContext.request.contextPath}/menu_teacher.jsp"
       style="text-decoration: none; color: #000000;">教师，<%out.print(tNumber);%></a>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a>
</div>

<div class="container my-3" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h4 class="text-center my-2">学生信息</h4>
        <form action="${pageContext.request.contextPath}/teacher/addSource" method="post">
            <div class="row mx-3 my-3">
                <div class="col-auto">
                    <label class=" col-form-label">学号</label>
                </div>
                <div class="col-auto">
                    <input type="hidden" name="tNumber" value="<%out.print(tNumber);%>"/>
                    <input type="text" name="sNumber" class="form-control" placeholder="请输入学号"/>
                </div>
                <div class="col-1"></div>
                <div class="col-auto">
                    <label class=" col-form-label">成绩</label>
                </div>
                <div class="col-auto">
                    <input type="text" name="cScore" class="form-control" placeholder="请输入成绩"/>
                </div>
                <div class="col-auto">
                    <button type="submit" class="btn btn-outline-primary">录入</button>
                </div>
            </div>
            <div class="table-responsive">
                <table class="table text-center">
                    <thead class="thead-light">
                    <tr>
                        <th scope="col">班级</th>
                        <th scope="col">学号</th>
                        <th scope="col">姓名</th>
                        <th scope="col">年龄</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${students}" var="student">
                        <tr>
                            <td>${student.sclass}</td>
                            <td>${student.snumber}</td>
                            <td>${student.sname}</td>
                            <td>${student.sage}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </form>
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
