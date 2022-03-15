<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%Integer tNumber = Integer.parseInt(session.getAttribute("uName").toString());%>

<html>
<head>
    <title>教师菜单</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body style="background: #f6f6f6">
<div align="right">教师，<%out.print(tNumber);%>，
    <a href="${pageContext.request.contextPath}/page_loginUser.jsp"
       style="text-decoration: none; color: #000000;">退出</a></div>

<div class="container col-4 my-3" text-align="center">
    <div class="shadow p-3 mb-5 bg-white rounded-lg">
        <h5 class="text-center my-2">教师管理</h5>
        <form action="${pageContext.request.contextPath}/teacher/selectStudent">
            <input type="hidden" name="tNumber" value="<%out.print(tNumber);%>"/>
            <button type="submit" class="btn btn-outline-primary btn-block">录入成绩</button>
        </form>
    </div>
</div>
</body>
</html>
