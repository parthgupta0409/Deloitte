<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="product">
<h2>Product Form</h2>
Product Id:<form:input path="productId" name="productId"/><br/>
Product Name:<form:input path="productName" name="productName"/><br/>
Product Quantity:<form:input path="quantity" name="Quantity"/><br/>
Product Price:<form:input path="price" name="price"/><br/>

<input type="submit" value="save">
</form:form>

</body>
</html>