<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<h2>New Destination</h2>
	<c:url value="/rest/destination" var="action"/>
	<form:form action="${action}" method="POST" modelAttribute="entity">
	<div id="destination_name">
		<label for="_name">Name:</label>
		<form:input cssStyle="width:300px" id="_name" path="name"/>
		<br/>
		<form:errors cssClass="errors" id="_name" path="name"/>
	</div>
	<div id="destination_state_">
		<label for="_state_">State_:</label>
		<form:input cssStyle="width:300px" id="_state_" path="state_"/>
		<br/>
		<form:errors cssClass="errors" id="_state_" path="state_"/>
	</div>
	<div id="destination_permission">
		<label for="_permission">Permission:</label>
		<form:input cssStyle="width:300px" id="_permission" path="permission"/>
		<br/>
		<form:errors cssClass="errors" id="_permission" path="permission"/>
	</div>
	<div class="submit" id="destination_submit">
		<input id="proceed" type="submit" value="Save"/>
	</div>
	</form:form>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
