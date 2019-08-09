<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
Sum of two numbers is :<%= session.getAttribute("total") %>
<%session.invalidate(); %>
</body>
</html>