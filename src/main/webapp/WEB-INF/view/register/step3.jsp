<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Youn
  Date: 2021-08-20
  Time: 오후 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=utf-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <p><strong>${formData.name}님</strong>
        회원가입을 완료했습니다.</p>
    <p><a href="<c:url value='/'/>">[첫 화면 이동]</a></p>
</body>
</html>
