<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Integer sNumber = Integer.parseInt(session.getAttribute("uName").toString());%>

<html>
<head>
    <title>选择课程</title>
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
        <form action="${pageContext.request.contextPath}/student/chooseCourse" method="post">
            <div class="row mx-3 my-3">
                <div class="col-auto">
                    <label class=" col-form-label">课程编号</label>
                </div>
                <div class="col-auto">
                    <input type="hidden" name="sNumber" value="<%out.print(sNumber);%>"/>
                    <input type="text" name="cNumber" class="form-control" placeholder="请输入课程编号"/>
                </div>
                <div class="col-auto">
                    <button type="submit" class="btn btn-outline-primary">选择</button>
                </div>
            </div>
            <div class="table-responsive">
                <table class="table text-center">
                    <thead class="thead-light">
                    <tr>
                        <th scope="col" colspan="1">课程编号</th>
                        <th scope="col" colspan="1">课程名称</th>
                        <th scope="col" colspan="1">任课教师</th>
                        <th scope="col" colspan="1">上课时间（周次）</th>
                        <th scope="col" colspan="1">上课时间（节次）</th>
                        <th scope="col" colspan="1">所在教室</th>
                        <th scope="col" colspan="1">限选人数</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${courses}" var="course" varStatus="status">
                        <tr>
                            <td>${course.cnumber}</td>
                            <td>${course.cname}</td>
                            <td>${course.cteacher}</td>
                            <td>${course.cweek}</td>
                            <td>${course.cpart}</td>
                            <td>${course.cclassroom}</td>
                            <td>${course.ccount}</td>
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
