<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
   String nombre="Jose";
   request.setAttribute("nombre",nombre);
  %>
  <div>
  
    <h2>Hola Mundo</h2>
    <h2>Mi name is: ${nombre }</h2>
    
  </div> 

</body>
</html>