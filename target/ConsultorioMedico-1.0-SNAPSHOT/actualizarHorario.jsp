<%-- 
    Document   : actualizarHorario
    Created on : 26 jul 2024, 0:23:11
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Horario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Actualizar Horario</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Actualizar Horarios <small>editar datos del horario</small></h1>
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
                <img src="assets/img/acthora.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para actualizar Horarios, debes de llenar todos los campos del siguiente formulario para actualizar un Horario.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Editar Horario</li>
                    
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Actualizar Horario Existente</div>
        <% 
            Horario hora = (Horario) request.getSession().getAttribute("horaEditar");
        %>
        <form class="form-padding" action="SrvActHorario" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="horaIni" placeholder="" value="<%=hora.getHorario_inicial()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la hora inicial del horario">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Horario inicial</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="horaFin" placeholder="" value="<%=hora.getHorario_final()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la hora final del horario">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Horario final</label>
                    </div>
                </div>
                <div class="col-xs-12">
                    <p class="text-center">
                        <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                        <button type="submit" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Guardar Cambios</button>
                    </p>
                </div>
            </div>
        </form>
    </div>
</section>

<%@include file="Componentes/body2.jsp"%>





