<%-- 
    Document   : mostrarAsistente
    Created on : 25 jul 2024, 16:27:01
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="Logica.Asistente"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Mostrar Asistente</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Listado de Asistentes <small>visualización de asistentes</small></h1>
    </div>
</div>
<section class="full-reset text-justify" style="padding: 0px 15px;">
    <p style="padding: 0px 32px;"></p>    

    <div class="container-fluid">
        <ul class="nav nav-tabs nav-justified" style="font-size: 17px;">
            <li role="presentation"><a href="#">Médicos</a></li>
            <li role="presentation" ><a href="#">Pacientes</a></li>
            <li role="presentation" ><a href="#">Responsable</a></li>
            <li role="presentation " class="active"><a href="#">Asistentes</a></li>
            <li role="presentation"><a href="#">Turnos</a></li>
            <li role="presentation"><a href="#">Horarios</a></li>
            <li role="presentation"><a href="#">Usuarios</a></li>
        </ul>
    </div>
    <div class="container-fluid" style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/verasis.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección donde se encuentra el listado de Asistentes, aquí también puedes actualizar o eliminar los datos del Asistente.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Listado de Asistentes</li>
                </ol>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <h2 class="text-center all-tittles">listado de asistentes</h2>
        <div class="div-table">
            <div class="div-table-row div-table-head">
                <div class="div-table-cell">Id</div>
                <div class="div-table-cell">Nombres</div>
                <div class="div-table-cell">Apellidos</div>
                <div class="div-table-cell">Cédula</div>
                <div class="div-table-cell">Dirección</div>
                <div class="div-table-cell">Teléfono</div>
                <div class="div-table-cell">Correo electrónico</div>
                <div class="div-table-cell">Fecha de nacimiento</div>
                <div class="div-table-cell">Lugar de trabajo</div>
            
                <div class="div-table-cell">Actualizar</div>
                <div class="div-table-cell">Eliminar</div>
            </div>
            <% 
                List<Asistente> listaAsistentes = (List) request.getSession().getAttribute("listaAsistentes");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                for (Asistente asis : listaAsistentes) {
                    Date fechaNacimiento = asis.getFecha_nacimiento();
                    String fechaFormateada = fechaNacimiento != null ? sdf.format(fechaNacimiento) : "N/A";
            %>
            <div class="div-table-row">
                <div class="div-table-cell" id="id_doc<%=asis.getId()%>"><%=asis.getId()%></div>
                <div class="div-table-cell"><%=asis.getNombres()%></div>
                <div class="div-table-cell"><%=asis.getApellidos()%></div>
                <div class="div-table-cell"><%=asis.getCciudadania()%></div>
                <div class="div-table-cell"><%=asis.getDireccion()%></div>
                <div class="div-table-cell"><%=asis.getTelefono()%></div>
                <div class="div-table-cell"><%=asis.getCorreo_electronico()%></div>
                <div class="div-table-cell"><%=fechaFormateada%></div>
                <div class="div-table-cell"><%=asis.getLugar_trabajo()%></div>

                <div class="div-table-cell">
                    <form name="actualizar" action="SrvActAsistente" method="GET">
                        <button type="submit" class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button>
                        <input type="hidden" name="id" value="<%=asis.getId()%>">
                    </form>
                </div>
                <div class="div-table-cell">
                    <form name="eliminar" action="SrvElimAsistente" method="POST">
                        <button type="submit" class="btn btn-danger"><i class="zmdi zmdi-delete"></i></button>
                        <input type="hidden" name="id" value="<%=asis.getId()%>" >
                    </form>
                </div>
            </div>
            <% } %>   
        </div>   
    </div>
</section>

<%@include file="Componentes/body2.jsp"%>



