<!DOCTYPE html>
<html><head>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<form:form action="saveCyclist" modelAttribute="cyclist" method="POST">
<table>
<tbody>
<tr>
<td><label>First name:</label></td>
<td><form:input path="firstName"/></td>
</tr>

<tr>
<td><label>Last name:</label></td>
<td><form:input path="lastName"/></td>
</tr>

<tr>
<td><label>Team:</label></td>
<td><form:input path="team"/></td>
</tr>

<tr>
<td><label>Sex</label></td>
<td><form:input path="sex"/></td>
</tr>

<tr>
<td><label>Bthyear:</label></td>
<td><form:input path="bthyear"/></td>
</tr>

<tr>
<td><label>Category:</label></td>
<td><form:input path="category"/></td>
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save" class="save"/></td>
</tr>

</tbody>

</table>

<a href="${pageContext.request.contextPath}/cyclist/show">Back to List</a>


</form:form>



</head>
<body>



</body>




</html>