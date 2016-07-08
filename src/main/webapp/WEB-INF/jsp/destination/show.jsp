<jsp:directive.include file="/WEB-INF/jsp/includes.jsp"/>
<jsp:directive.include file="/WEB-INF/jsp/header.jsp"/>
<div>
	<c:if test="${not empty result}">
		<div id="destination_name">
			<label for="_name">Name:</label>
			<div class="box" id="_name">${result.name}</div>
		</div>
		<br/>
		<div id="destination_state_">
			<label for="_state_">State_:</label>
			<div class="box" id="_state_">${result.state_}</div>
		</div>
		<br/>
		<div id="destination_permission">
			<label for="_permission">Permission:</label>
			<div class="box" id="_permission">${result.permission}</div>
		</div>
		<br/>
	</c:if>
	<c:if test="${empty result}">No Destination found with this id.</c:if>
</div>
<jsp:directive.include file="/WEB-INF/jsp/footer.jsp"/>
