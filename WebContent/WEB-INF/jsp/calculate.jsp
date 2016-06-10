<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Toplama Yap</title>
</head>
<body>

<h2>Toplanacak Sayilari Giriniz:</h2>
<form:form method="POST" action="/HelloWeb/addNumbers">
   <table>
    <tr>
        <td><form:label path="number1">1. Sayi</form:label></td>
        <td><form:input path="number1" /></td>
    </tr>
    <tr>
        <td><form:label path="number2">2. Sayi</form:label></td>
        <td><form:input path="number2" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Topla"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>