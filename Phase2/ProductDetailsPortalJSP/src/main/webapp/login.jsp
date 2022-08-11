<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Displaying the Product details</h2>
<%

String pid =request.getParameter("pid");
String pname=request.getParameter("pname");
String price=request.getParameter("price");

out.print("ProductID is: "+pid);
out.print("<br><br>ProductName is: "+pname);
out.print("<br><br>ProductPrice is: "+price);

%>

</body>
</html>