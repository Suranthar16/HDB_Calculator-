<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HDB</title>
<link rel="stylesheet" href="HDB_Login.css">
</head>
<script type="text/javascript">
 <% String error=request.getParameter("error");
 if(error!=null)
  {%>
	  alert("<%=error%>");
  <% }%>

</script>
<body>
	<h2>Login To Get Access</h2>
	<div>
		<form id="login_form" name="login_form">
			<p>Username</p>
			<input type="text" id="username" name="username" value=""
				placeholder="xxx@gmail.com" required>
			<p>Password</p>
			<input type="password" id="password" name="password" value=""
				placeholder="xxxxx" required><br> <input type="button"
				id="login" name="login" value="Login" onclick="loginfunction()">
			<input type="reset" id="reset" name="reset" value="Reset">
			</form>
	</div>
</body> 
<script type="text/javascript">
	function loginfunction() {
		var username = document.getElementById("username").value;
		var password = document.getElementById("password").value;
		var emailReg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

		if (username === "") {
			alert("Please provide your username!");
			return false;
		} else if (!emailReg.test(username)) {
			alert("Please provide valid username!")
			return false;
		} 

		if (password === "") {
			alert("Please provide your password!");
			return false;
		} else if (password.length <= 5) {
			alert("Please provide valid password!");
			return false;
		}

		else {

			document.getElementById("login_form").action = "HDB_LoginServlet";
			document.getElementById("login_form").method = "post";
			document.getElementById("login_form").submit();

		}
	}
</script>
</html>