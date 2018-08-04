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
<input type="button" value="Add Cyclist" onclick="window.location.href='showFormForAdd';return false;"
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
</tr>

<c:forEach var="tempCyclist" items="${cyclists}"> 
<tr>
<td>${tempCyclist.firstName}</td>
<td>${tempCyclist.lastName}</td>
<td>${tempCyclist.team}</td>
<td>${tempCyclist.sex}</td>
<td>${tempCyclist.bthyear}</td>
<td>${tempCyclist.category}</td>

</tr>



</c:forEach>




</table>






</body>



</html>