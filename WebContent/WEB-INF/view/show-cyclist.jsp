<!DOCTYPE html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<spring:url value="/resources/css/style.css" var="styleCss" />
<link href="${styleCss}" rel="stylesheet" />
<spring:url value="/resources/css/CyclistsStyle.css" var="styleCss2" />
<link href="${styleCss2}" rel="stylesheet" />
</head>

<body>
<h1>CYCLISTS !!!</h1><br><br><br>
<input type="button" value="Add Cyclist" onclick="window.location.href='/CyclingRaceList/cyclist/showFormForAdd';return false;"
/>

<br>

<table id="cyclists">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Team</th>
<th>Sex</th>
<th>Birthday Year</th>
<th>Category</th>
<th>Action</th>
</tr>

<c:forEach var="tempCyclist" items="${cyclists}"> 

<c:url var="updateLink" value="/cyclist/showFormForUpdate">
<c:param name="cyclistId" value="${tempCyclist.id}"/>
 </c:url>

<c:url var="deleteLink" value="/cyclist/delete">
<c:param name="cyclistId" value="${tempCyclist.id}" />
</c:url>

<tr>
<td>${tempCyclist.firstName}</td>
<td>${tempCyclist.lastName}</td>
<td>${tempCyclist.team}</td>
<td>${tempCyclist.sex}</td>
<td>${tempCyclist.bthyear}</td>
<td>${tempCyclist.category}</td>
<td><a href="${updateLink}">Update</a> | <a href="${deleteLink}" onclick="if (!(confirm('Do you want to delete this cyclist?: ${tempCyclist.firstName} ${tempCyclist.lastName}'))) return false">Delete</a>

</td>

</tr>

</c:forEach>

</table>

</body>

</html>