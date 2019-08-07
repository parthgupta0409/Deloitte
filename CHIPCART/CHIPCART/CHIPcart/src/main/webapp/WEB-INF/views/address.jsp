<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@ page import="java.util.*" %>
    <%@ page import="com.sonar.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address Page</title>
</head>
<body>
<form:form modelAttribute="address">
<h2>Address Page</h2>
Address Id:<form:input path="addressId" name="addressId"/><br/>
Delivery Address:<form:input path="DeliveryAddress" name="deliveryAddress"/><br/>
City:<form:input path="city" name="City"/><br/>
State:<form:input path="state" name="State"/><br/>
Pincode:<form:input path="pincode" name="Price"/><br/>

<input type="submit" value="save">
</form:form>
</body>
</html>