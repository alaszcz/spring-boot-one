<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<body>
	<c:url value="/resources/text.txt" var="url" />
	<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
	<h1>Spring Boot Application</h1>
 
	<h2>${msg}</h2>
	<br>
	This is test of JSP taglibs in Spring Boot (it's not working very well with Jetty)
	<br>
	JSTL URL: ${url}
	<br>
	Spring URL: ${springUrl}
 
</body>
</html>