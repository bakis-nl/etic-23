<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Etic - ${title}</title>

<script>
	window.menu = $
	{
		title
	}
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Bootstrap theme CSS 
<link href="${css}/bootstrap-theme-quartz.css" rel="stylesheet">
-->

<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!--  for footer alignment -->
	<div class="wrapper">

		<!-- Navigation -->
		<%@include file="./shared/navigate.jsp"%>

		<!--  for footer alignment -->
		<div class="content">

			<c:if test="${userClickedHome == true}">
				<!-- Content -->
				<%@include file="./home.jsp"%>
			</c:if>

			<c:if test="${userClickedAbout == true}">
				<!-- Content -->
				<%@include file="./about.jsp"%>
			</c:if>

			<c:if test="${userClickedContact == true}">
				<!-- Content -->
				<%@include file="./contact.jsp"%>
			</c:if>

			<c:if test="${userClickedServices == true}">
				<!-- Content -->
				<%@include file="./services.jsp"%>
			</c:if>
		</div>
		<!-- footer -->
		<%@include file="./shared/footer.jsp"%>
		<!-- /.container -->

		<!-- JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.js"></script>

		<!-- application scripts -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
