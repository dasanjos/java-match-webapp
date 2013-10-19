<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
  <body>
    <p><spring:message code="hello"/></p>
	<c:out value="${matches}" />
    <c:if test="${!empty matches}">
	<table>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Date</th>
		</tr>    
    	<c:forEach items="${matches}" var="match">
    	<tr>
			<td><c:out value="${user.username}" /></td>
			<td><c:out value="${user.password}" /></td>
		</tr>
    	</c:forEach>
	</table>    	
    </c:if>
  </body>
</html>