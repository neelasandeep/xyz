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
 }
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/eswudGVJbdU"   allowfullscreen></iframe>
<video controls width="560" height="315">
<source src="bathukamma.mp4" type="video/mp4"></video>

</body>
</html>