<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="getstockdtls">

<font color="green">${msg}</font>
 <table>
 
      <tr>
           <td>Company Name:::</td>
           <td><input type="text" name="companyname" /></td>
      </tr>
      
      <tr>
           <td>Quantity :::</td>
           <td><input type="text" name="quantity" /></td>
      </tr>
      
      <tr>
           <td><input type="submit" value="getPrice" /></td>
           
      </tr>
 
 
 </table>





</form>

</body>
</html>