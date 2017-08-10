 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<html>
<head>
	<title>Secret Code</title>
</head>
 <body>
 	<p>${errors}</p>
 	<h2>What is the code?</h2>
 	<form action= "/code" method = "POST">
 		<input type = "text" name = "box">
 	</form>
 	
</body>
</html>