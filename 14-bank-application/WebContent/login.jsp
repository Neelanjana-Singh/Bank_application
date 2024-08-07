<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style>
body {
	background-image:
		url('https://creazilla-store.fra1.digitaloceanspaces.com/cliparts/9108/bank-clipart-md.png');
	background-size: contain;
	background-repeat: no-repeat;
	background-position: center;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

.login-form {
	background: white;
	padding: 10px;
	border-radius: 10px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

.login-form input {
	margin-bottom: 10px;
}

.login-form button {
	width: 100%;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-4">
				<form action="login" method="post" class="login-form">
					<h2 class="text-center">Bank Application</h2>
					<div class="mb-3">
						<label for="username" class="form-label">Username:</label> <input
							type="text" class="form-control" id="username" name="username"
							required>
					</div>
					<div class="mb-3">
						<label for="password" class="form-label">Password:</label> <input
							type="password" class="form-control" id="password"
							name="password" required>
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
					<c:if test="${param.error != null}">
						<p class="text-danger text-center mt-3">Invalid username or
							password</p>
					</c:if>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
