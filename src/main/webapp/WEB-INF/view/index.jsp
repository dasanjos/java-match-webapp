<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html lang="en">
	<head>
		<meta charset="utf-8">
		<title>Matches</title>
		<meta name="description" content="Microsoft - SDE Technical Exercise">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">	
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.ico">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>		
	</head>
	<body>
		<header>
		<c:if test="${!empty earlier}">
		    <div class="left"><a href="${earlier}"><spring:message code="earlier"/></a></div>
    	</c:if>	
		<c:if test="${!empty later}">		    
		    <div class="right"><a href="${later}"><spring:message code="later"/></a></div>    
	    </c:if>
		<c:if test="${!empty date}">		    
		    <div class="center"><c:out value="${date}" /></a></div>
	    </c:if>	    
		</header>
	    <c:if test="${empty matches}">  
    	<p class="center"><spring:message code="emptyMatches"/> <br/> <a href="${today}"><spring:message code="todayMatches"/></a></p>
	    </c:if>	
	    <c:if test="${!empty matches}">
		<table>
			<tr>
				<th><spring:message code="time"/></th>
				<th></th>
				<th><spring:message code="match"/></th>
				<th></th>
			</tr>    
	    	<c:forEach items="${matches}" var="match" varStatus="status">
	    	<tr class="${status.index % 2 == 0 ? 'even' : 'odd'}">
				<td class="time"><c:out value="${match.getTime()}" /></td>
				<td class="home"><c:out value="${match.homeTeamName}" /></td>
				<td class="score"><c:out value="${match.homeScore}" /> - <c:out value="${match.awayScore}" /></td>
				<td class="away"><c:out value="${match.awayTeamName}" /></td>
			</tr>
	    	</c:forEach>
		</table>
		<p class="center"><button type="button" onClick="$('.even').addClass('grey')"><spring:message code="highlight"/></button></p>    	
	    </c:if>
	    
		<footer>
			<div class="logo">            		
				<img alt="Microsoft" src="/img/logo.png">
			</div>
			<div class="links">            					
		        <ul>
		            <li><a href="http://www.dasanjos.com">Dasanjos</a></li>
                    <li><a href="http://support.microsoft.com/contactus/?ln=en-ie">Contact us</a></li>
                    <li><a bi:cpid="hpFooter" href="http://go.microsoft.com/fwlink/?LinkId=248681">Privacy statement</a></li>
                    <li><a href="http://www.microsoft.com/about/legal/en/us/IntellectualProperty/Copyright/Default.aspx">Terms of use</a></li>
                    <li><a href="http://www.microsoft.com/About/Legal/EN/US/IntellectualProperty/Trademarks/EN-US.aspx">Trademarks</a></li>
		            <li>© 2013 Microsoft</li>
		        </ul>
			</div>
		</footer>
	</body>
</html>