
<p class="lead">Shop Name</p>
<div class="list-group">
	<c:forEach items="${categories}" var="category">
		<a href="${contextRoot}/category/${category.id}/products" id="${category.name}" class="list-group-item">${category.name}</a>
	</c:forEach>
	

</div>