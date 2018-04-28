<%@ include file="/WEB-INF/taglib.jsp" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<h1> Home page </h1>

Add: <a href="/add-user">Add user</a> <br>
Add: <a href="/user-list">User List</a> <br>

<sec:authorize access = "!isAuthenticated()">
<a href="/login">Go to Login</a> <br>
<a href="/register">Go to Register</a> <br>
</sec:authorize>


<sec:authorize access = "!isAuthenticated()">
	<sec:authorize access = "hasRole('ADMIN')">
		<a href="/admin/dashboard">Dashboard</a> <br>
	</sec:authorize>
</sec:authorize>

<a href="/user/profile">Profile</a> <br>

<sec:authorize access = "isAuthenticated()">
	<form:form action="/logout" method="POST">
	<input type="submit" value="Log Out">
	</form:form>
</sec:authorize>