<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<body>
	<c:url value="/resources/text.txt" var="url" />
	<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl" />
	<h1>Spring Boot Application running in ${environment}</h1>
 
	<h2>Now is: ${now}</h2>
	<h3>Repository 1 response: ${repository1}</h3>
	<h3>Repository 2 response: ${repository2}</h3>
	This is test of JSP taglibs in Spring Boot (it's not working very well with Jetty)
	<br>
	JSTL URL: ${url}
	<br>
	Spring URL: ${springUrl}
 
</body>
</html>