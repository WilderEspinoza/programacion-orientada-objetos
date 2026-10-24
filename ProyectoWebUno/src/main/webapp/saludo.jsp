<!DOCTYPE html>
<html>
<head>
    <title>Bienvenida</title>
</head>
<body>
<%
    String nombre = request.getParameter("nombre");
    if (nombre == null || nombre.trim().equals("")) {
        nombre = "invitado";
    }
%>
    <h2>Hola, <%= nombre %>! Bienvenido a tu primera app JSP.</h2>
    <a href="index.jsp">Volver</a>
</body>
</html>
