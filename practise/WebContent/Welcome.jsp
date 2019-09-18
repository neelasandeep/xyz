<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
 if(session.getAttribute("uname")==null){
	 response.sendRedirect("index.html");
 }else{
	 out.println("Hi  "+session.getAttribute("uname"));
 }
%>
hey now you are in welcome  page
<a href="Videos.jsp"> videos</a>
<form action="Logout" method="get">
<input type="submit" value="Logout">
</form>
</body>
</html>