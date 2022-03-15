<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>修改教师信息</title>
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
                <h4 class="text-center my-2">教师信息</h4>
                <div class="table-responsive">
                    <table class="table text-center">
                        <thead class="thead-light">
                        <tr>
                            <th scope="col">教师编号</th>
                            <th scope="col">教师姓名</th>
                            <th scope="col">所在专业</th>
                            <th scope="col">教授课程</th>
                            <th scope="col">联系方式</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${teachers}" var="teacher">
                            <tr>
                                <td>${teacher.tnumber}</td>
                                <td>${teacher.tname}</td>
                                <td>${teacher.tmajor}</td>
                                <td>${teacher.tclass}</td>
                                <td>${teacher.tcontact}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div class="col-4">
            <div class="shadow p-3 mb-5 bg-white rounded-lg">
                <h4 class="text-center my-2">修改教师</h4>
                <form action="${pageContext.request.contextPath}/admin/changeTeacher" method="post">
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
