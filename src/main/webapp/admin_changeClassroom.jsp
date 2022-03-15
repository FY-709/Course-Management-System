<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>修改教室信息</title>
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
                <h4 class="text-center my-2">教室信息</h4>
                <div class="table-responsive">
                    <table class="table text-center">
                        <thead class="thead-light">
                        <tr>
                            <th scope="col">教室编号</th>
                            <th scope="col">容纳人数</th>
                            <th scope="col">多媒体</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${classrooms}" var="classroom">
                            <tr>
                                <td>${classroom.rnumber}</td>
                                <td>${classroom.rcount}</td>
                                <td>
                                    <c:if test="${classroom.rmultimedia == 1}">是</c:if>
                                    <c:if test="${classroom.rmultimedia == 0}">否</c:if>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div class="col-4">
            <div class="shadow p-3 mb-5 bg-white rounded-lg">
                <h4 class="text-center my-2">修改教室</h4>
                <form action="${pageContext.request.contextPath}/admin/changeClassroom" method="post">
                    <div class="form-group">
                        <label>教室编号</label>
                        <input type="text" name="rNumber" class="form-control" placeholder="请输入教室编号">
                    </div>
                    <div class="form-group">
                        <label>容纳人数</label>
                        <input type="text" name="rCount" class="form-control" placeholder="请输入容纳人数">
                    </div>
                    <div class="form-group">
                        <label>多媒体</label>
                        <select name="rMultiMedia" class="form-control">
                            <option value="1">多媒体教室</option>
                            <option value="0">非多媒体教室</option>
                        </select>
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
