<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
<a href="<c:url value="/rest/destination/form" />">New Destination</a>
</div>
<div>
	<c:if test="${not empty result}">
	<table>
		<thead>
		<th>Id</th>
		<th>Name</th>
		<th>State_</th>
		<th>Permission</th>
		<th/>
		<th/>
		</thead>
		<c:forEach items="${result}" var="each" >
			<tr>
				<td>
					<a href="<c:url value="/rest/destination/${each.id}" />">${each.id}</a>
				</td>
				<td>
					${each.name}
				</td>
				<td>
					${each.state_}
				</td>
				<td>
					${each.permission}
				</td>
				<td>
					<a href="<c:url value="/rest/destination/${each.id}" />">Show</a>
				</td>
				<td>
					<c:url value="/rest/destination/${each.id}" var="action"/>
					<form:form action="${action}" method="DELETE">
						<input id="delete" type="submit" value="Delete"/>
					</form:form>
				</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	<c:if test="${empty result}"><p>There are no Destinations yet.</p></c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>

