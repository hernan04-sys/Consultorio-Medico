<%-- 
    Document   : mostrarTurno
    Created on : 25 jul 2024, 16:43:40
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="Logica.Turno"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Mostrar Turno</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Listado de Turnos <small>visualización de turnos</small></h1>
    </div>
</div>
<section class="full-reset text-justify" style="padding: 0px 15px;">
    <p style="padding: 0px 32px;"></p>    

    <div class="container-fluid">
        <ul class="nav nav-tabs nav-justified" style="font-size: 17px;">
            <li role="presentation"><a href="#">Médicos</a></li>
            <li role="presentation" ><a href="#">Pacientes</a></li>
            <li role="presentation"  ><a href="#">Responsable</a></li>
            <li role="presentation " ><a href="#">Asistentes</a></li>
            <li role="presentation" class="active"><a href="#">Turnos</a></li>
            <li role="presentation"><a href="#">Horarios</a></li>
            <li role="presentation"><a href="#">Usuarios</a></li>
        </ul>
    </div>
    <div class="container-fluid" style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/vertur.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección donde se encuentra el listado de Turnos, aquí también puedes actualizar o eliminar los datos del Turno.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Listado de Turnos</li>
                </ol>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <h2 class="text-center all-tittles">listado de turnos</h2>
        <div class="div-table">
            <div class="div-table-row div-table-head">
                <div class="div-table-cell">Id</div>
                <div class="div-table-cell">Fecha del turno</div>
                <div class="div-table-cell">Hora del turno</div>
            
                <div class="div-table-cell">Actualizar</div>
                <div class="div-table-cell">Eliminar</div>
            </div>
            <% 
                List<Turno> listaTurnos = (List) request.getSession().getAttribute("listaTurnos");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                for (Turno tur : listaTurnos) {
                    Date fechaTurno = tur.getFecha_turno();
                    String fechaFormateada = fechaTurno != null ? sdf.format(fechaTurno) : "N/A";
            %>
            <div class="div-table-row">
                <div class="div-table-cell" id="id_tur<%=tur.getId_turno()%>"><%=tur.getId_turno()%></div>
                <div class="div-table-cell"><%=fechaFormateada%></div>
                <div class="div-table-cell"><%=tur.getHora_turno()%></div>

                <div class="div-table-cell">
                    <form name="actualizar" action="SrvActTurno" method="GET">
                        <button type="submit" class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button>
                        <input type="hidden" name="id" value="<%=tur.getId_turno()%>">
                    </form>
                </div>
                <div class="div-table-cell">
                    <form name="eliminar" action="SrvElimTurno" method="POST">
                        <button type="submit" class="btn btn-danger"><i class="zmdi zmdi-delete"></i></button>
                        <input type="hidden" name="id" value="<%=tur.getId_turno()%>" >
                    </form>
                </div>
            </div>
            <% } %>   
        </div>   
    </div>
</section>

<%@include file="Componentes/body2.jsp"%>





