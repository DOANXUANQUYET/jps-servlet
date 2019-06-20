<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!--  dec title . khi nhung trang khong khai bao title thi se lay title default -->
<title><dec:title default="Trang chủ" /></title>

<!-- css -->
<!-- <c : url (dinh nghia, khai bao duong dan default) k dinh nghia bang jsp thi co the k  load duoc -->
<link href="<c:url value='/template/web/bootstrap/css/bootstrap.min.css' />" rel="stylesheet" type="text/css" media="all" />
<!-- import file css rieng, css tung trang -->
<link href="<c:url value='/template/web/css/style.css' />" rel="stylesheet" type="text/css" media="all" />

</head>
<body>
	<!-- header ( import nhung phan chung, khong thay doi trong cac trang -->
	<%@ include file="/common/web/header.jsp"%>
	<!-- header -->
	<!-- taglib cua sitemesh ( tao bien body de load tung trang rieng)
	khi cac trang con load thi chi can load body cua rieng no -->
	<div class="container">
		<dec:body />
	</div>

	<!-- footer -->
	<%@ include file="/common/web/footer.jsp"%>
	<!-- footer -->

	<script type="text/javascript"
		src="<c:url value='/template/web/jquery/jquery.min.js' />"></script>
	<script type="text/javascript"
		src="<c:url value='/template/web/bootstrap/js/bootstrap.bundle.min.js' />"></script>

</body>
</html>