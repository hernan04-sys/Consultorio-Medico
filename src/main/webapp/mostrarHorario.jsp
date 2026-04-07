<%-- 
    Document   : mostrarHorario
    Created on : 25 jul 2024, 17:19:05
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="Logica.Horario"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Mostrar Horario</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Listado de Horarios <small>visualización de horarios</small></h1>
    </div>
</div>
<section class="full-reset text-justify" style="padding: 0px 15px;">
    <p style="padding: 0px 32px;"></p>    

    <div class="container-fluid">
        <ul class="nav nav-tabs nav-justified" style="font-size: 17px;">
            <li role="presentation"><a href="#">Médicos</a></li>
            <li role="presentation" ><a href="#">Pacientes</a></li>
            <li role="presentation" ><a href="#">Responsable</a></li>
            <li role="presentation " ><a href="#">Asistentes</a></li>
            <li role="presentation"><a href="#">Turnos</a></li>
            <li role="presentation"class="active"><a href="#">Horarios</a></li>
            <li role="presentation"><a href="#">Usuarios</a></li>
        </ul>
    </div>
    <div class="container-fluid" style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/verhora.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección donde se encuentra el listado de Horarios, aquí también puedes actualizar o eliminar los datos del Horario.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Listado de Horarios</li>
                </ol>
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <h2 class="text-center all-tittles">listado de horarios</h2>
        <div class="div-table">
            <div class="div-table-row div-table-head">
                <div class="div-table-cell">Id</div>
                <div class="div-table-cell">Horario inicial</div>
                <div class="div-table-cell">Horario final</div>
                <div class="div-table-cell">Actualizar</div>
                <div class="div-table-cell">Eliminar</div>
            </div>
            <% 
                List<Horario> listaHorarios = (List) request.getSession().getAttribute("listaHorarios");
                
                for (Horario hora : listaHorarios) {
                    
            %>
            <div class="div-table-row">
                <div class="div-table-cell" id="id_hora<%=hora.getId_horario()%>"><%=hora.getId_horario()%></div>
                <div class="div-table-cell"><%=hora.getHorario_inicial()%></div>
                <div class="div-table-cell"><%=hora.getHorario_final()%></div>

                <div class="div-table-cell">
                    <form name="actualizar" action="SrvActHorario" method="GET">
                        <button type="submit" class="btn btn-success"><i class="zmdi zmdi-refresh"></i></button>
                        <input type="hidden" name="id" value="<%=hora.getId_horario()%>">
                    </form>
                </div>
                <div class="div-table-cell">
                    <form name="eliminar" action="SrvElimHorario" method="POST">
                        <button type="submit" class="btn btn-danger"><i class="zmdi zmdi-delete"></i></button>
                        <input type="hidden" name="id" value="<%=hora.getId_horario()%>" >
                    </form>
                </div>
            </div>
            <% } %>   
        </div>   
    </div>
</section>

<%@include file="Componentes/body2.jsp"%>






