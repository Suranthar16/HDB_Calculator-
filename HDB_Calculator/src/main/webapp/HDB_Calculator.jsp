<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="HDB_Cal.css">
<title>HDB</title>
</head>
<body>
	<h2>Enter Your Values</h2>
	<div>
<form id="calculation" name="calculation" >
		<p>Number-1</p>
		<input type="number" id="number1" name="number1" value=""
			placeholder="xxx.." required>
		<p>Number-2</p>
		<input type="number" id="number2" name="number2" value=""
			placeholder="xxx.." required><br> <br> 
		<input type="button" id="Addition" name="Addition" value="Addition" onclick="Additionfunction()">
		<input type="button" id="Multiply" name="Multiply" value="Multiply" onclick="Multiplyfunction()">
		<input type="button" id="subtract" name="subtract" value="subtract" onclick="subtractfunction()">
		<input type="button" id="divide" name="divide" value="divide" onclick="dividefunction()"><br>

		<input type="reset" id="clear" name="clear" value="Reset">
		</form>

	</div>
	<div>
		<p>Result</p>
		<input type="text" id="result" name="result" value="" placeholder="00"
			required><br> <br>
	</div>

</body>
<script type="text/javascript">
	function Additionfunction() {
		var number1 = document.getElementById("number1").value;
		var number2 = document.getElementById("number2").value;
		var result = 0;

		if (number1 === "") {
			alert("Please Enter the Number1!");
			return false;
		}
		if (number2 === "") {
			alert("Please Enter the Number2!");
			return false;
		}

		result =parseInt(number1) + parseInt(number2);

		document.getElementById("result").value = result;

	}
</script>
<script type="text/javascript">
	function Multiplyfunction() {
		var number1 = document.getElementById("number1").value;
		var number2 = document.getElementById("number2").value;
		var result = 0;

		if (number1 === "") {
			alert("Please Enter the Number1!");
			return false;
		}
		if (number2 === "") {
			alert("Please Enter the Number2!");
			return false;
		}

		result =parseInt(number1) * parseInt(number2);

		document.getElementById("result").value = result;

	}
</script>
<script type="text/javascript">
	function subtractfunction() {
		var number1 = document.getElementById("number1").value;
		var number2 = document.getElementById("number2").value;
		var result = 0;

		if (number1 === "") {
			alert("Please Enter the Number1!");
			return false;
		}
		if (number2 === "") {
			alert("Please Enter the Number2!");
			return false;
		}

		result =parseInt(number1) - parseInt(number2);

		document.getElementById("result").value = result;

	}
</script>
<script type="text/javascript">
	function dividefunction() {
		var number1 = document.getElementById("number1").value;
		var number2 = document.getElementById("number2").value;
		var result = 0;

		if (number1 === "") {
			alert("Please Enter the Number1!");
			return false;
		}
		if (number2 === "") {
			alert("Please Enter the Number2!");
			return false;
		}else if(number2 === '0'){
			alert(" Number2 can not be 0!");
			return false;
		}

		result =parseInt(number1) / parseInt(number2);

		document.getElementById("result").value = result;
	}
</script>
</html>