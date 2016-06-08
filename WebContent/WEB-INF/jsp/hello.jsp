<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h2>${message}</h2>
	<form:form method="GET" action="/HelloWeb/redirect">
		<table>
			<tr>
				<td><input type="submit" value="Öğrenci İşleri" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>