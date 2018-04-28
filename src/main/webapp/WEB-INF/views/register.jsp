<%@ include file="/WEB-INF/taglib.jsp" %>

<form:form action="/register" method="POST" modelAttribute="userModel">
	Login: <form:input path="login"/> <br>
	Email: <form:input path="email"/> <br>
	Passw: <form:input path="password"/> <br>
	<input type="submit" value="Register">
</form:form>