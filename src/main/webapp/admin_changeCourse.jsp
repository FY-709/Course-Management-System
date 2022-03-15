<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>修改课程信息</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">
    <a href="${pageContext.request.contextPath}/menu_admin.jsp"
       style="text-decoration: none; color: #000000;">管理员，<%out.print(uName);%></a>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a>
</div>

<div class="container my-3">
    <div class="row">
        <div class="col-8">
            <div class="shadow p-3 mb-5 bg-white rounded-lg">
                <h4 class="text-center my-2">课程信息</h4>
                <div class="table-responsive">
                    <table class="table text-center">
                        <thead class="thead-light">
                        <tr>
                            <th scope="col">课程编号</th>
                            <th scope="col">课程名称</th>
                            <th scope="col">任课教师</th>
                            <th scope="col">上课时间（周次）</th>
                            <th scope="col">上课时间（节次）</th>
                            <th scope="col">所在教室</th>
                            <th scope="col">限选人数</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${courses}" var="course">
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
            </div>
        </div>

        <div class="col-4">
            <div class="shadow p-3 mb-5 bg-white rounded-lg">
                <h4 class="text-center my-2">修改课程</h4>
                <form action="${pageContext.request.contextPath}/admin/changeCourse" method="post">
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
                    <button type="submit" class="btn btn-outline-primary btn-block">修改</button>
                </form>
            </div>
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
