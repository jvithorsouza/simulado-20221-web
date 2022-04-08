<%@page import="br.com.mariojp.condominio.dao.UsuarioDAO"%>
<%@page import="br.com.mariojp.condominio.model.Usuario"%>
<%@page import="java.util.List"%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">

</head>
<body>
	<div class="px-4 py-5 my-5 text-center">
		<h1 class="display-5 fw-bold">LISTA DE USUARIOS</h1>
		<h4>jucaaaaaaa</h4>

		<!--  SEU CODIGO AQUI -->
		<%
		UsuarioDAO dao = new UsuarioDAO();
		List<Usuario> list = dao.findAll();
		for (Usuario usuario : list) {
		%>
		<p>
			<%=usuario.getLogin()%></p>
		<%
		}
		%>

	</div>
	<div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
        <a href="index.jsp" class="btn btn-primary btn-lg px-4 gap-3">VOLTAR</a>
    </div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>

</body>
</html>