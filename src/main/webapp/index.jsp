<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- <%@ page import="inventario.controlador.*" %> --%>
<html>
<head>
<meta charset="UTF-8">
<title>Branfer ACC | Reg. Inventario</title>
<link rel="stylesheet" href="index.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
  </head>
</head>
<body>
	<nav class="navbar navbar-expand-lg bg-body-tertiary">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="index.jsp">BRANFER ACC</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    <div class="collapse navbar-collapse" id="navbarText">
	      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
	        <li class="nav-item">
	          <a class="nav-link active" aria-current="page" href="verInventario.jsp">Ver inventario</a>
	        </li>
	      </ul>
	    </div>
	  </div>
	</nav>
	
    <div class="container">
        <h1>Registro de Inventario</h1>
        <form action="generarExcel.jsp" method="post">
        	<input type="text" id="txtId" name="txtid" placeholder="No. Orden" required>
            <input type="text" id="txtNombreProduc" name="txtNombreProduc" placeholder="Nombre Producto" required>
            <input type="number" id="txtCantidad" name="txtCantidad" placeholder="Cantidad de Productos" required>
            <input type="text" id="txtNombreProvee" name="txtNombreProvee" placeholder="Nombre del Proveedor/Empresa" required>
            <input type="text" id="txtDestino" name="txtDdestino" placeholder="Destino/Lugar del Inventario" required>
            <input type="submit" name="btnRegistrar" value="Registrar">
        </form>
    </div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>