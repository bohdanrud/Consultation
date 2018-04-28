<%@ include file="/WEB-INF/taglib.jsp" %>

<h2>User Profile</h2>

Login: ${userProfile.login} <br>
Email: ${userProfile.email} <br>
<br>
<c:if test="${ userProfile.imageUrl != null}">
<img src="${ userProfile.imageUrl }" width="500px">
</c:if>

<br>
<a href="/user/profile/image">Upload profile image</a> <br>
