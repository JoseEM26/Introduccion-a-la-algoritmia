<%@page import="com.Trabajador.model.Trabajador"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Trabajadores</title>
</head>
<body>
    <h1>Lista de Trabajadores</h1>

    <table border="1">
        <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Apellido</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${lista}" var="x">
                <tr>
                    <td>${x.id}</td>
                    <td>${x.nombre}</td>
                    <td>${x.apellido}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
