<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form:form action="/product/add" method="POST" modelAttribute="productModel" enctype="multipart/form-data">
		Title: <form:input path="title"/> <br>
		Description: <form:textarea path="description"/> <br>
		Rating: <form:input path="rating" type="number"/> <br>
		Price: <form:input path="price"/> <br>
		Image: <input type="file" name="productImage"> <br>
		<br>
		<input type="submit" value="Create Product"> <br>
	</form:form>

</body>
</html>