<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	session.setAttribute("MEMBERID", "test");
	session.setAttribute("NAME", "홍길동");
	session.setMaxInactiveInterval(60); //초단위 1분 뒤에 종료
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
세션에 속성(Attribute)을 저장하기
</body>
</html>