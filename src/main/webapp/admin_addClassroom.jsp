<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String uName = session.getAttribute("uName").toString();%>

<html>
<head>
    <title>添加教室信息</title>
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
        <h4 class="text-center my-2">添加教室</h4>
        <form action="${pageContext.request.contextPath}/admin/addClassroom" method="post">
            <div class="form-group">
                <label>教室编号</label>
                <input type="text" name="rNumber" class="form-control" placeholder="请输入教室编号"/>
            </div>
            <div class="form-group">
                <label>容纳人数</label>
                <input type="text" name="rCount" class="form-control" placeholder="请输入容纳人数"/>
            </div>
            <div class="form-group">
                <label>多媒体</label>
                <select name="rMultiMedia" class="form-control">
                    <option value="1">多媒体教室</option>
                    <option value="0">非多媒体教室</option>
                </select>
            </div>
            <br>
            <button type="submit" class="btn btn-outline-primary btn-block">添加</button>
        </form>
    </div>
</div>
</body>
</html>
