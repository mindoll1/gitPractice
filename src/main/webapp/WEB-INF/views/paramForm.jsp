<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paramForm.jsp</title>
</head>
<body>

<h1>파람폼JSP</h1>

<%-- 아이디: ${memberVO.id}</br>
나이:${memberVO.age}</br>
이름:${memberVO.name}</br>
 --%>
 
 ${sessionScope.login}님은 접속중
 
</body>
</html>