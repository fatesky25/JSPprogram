<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <% // 아까 setAttributeInfo에서 저장한 키를 가져오면 됨 like MEMBERID
    	String memberid = (String)session.getAttribute("MEMBERID");
    	String name = (String)session.getAttribute("NAME");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
MemberID : <%=memberid %><br>
Name : <%=name %>
</body>
</html>