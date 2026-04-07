<%-- 
    Document   : actualizarPaciente
    Created on : 25 jul 2024, 21:07:47
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Paciente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Actualizar Paciente</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Actualizar Pacientes <small>editar datos del paciente</small></h1>
    </div>
</div>
<section class="full-reset text-justify" style="padding: 0px 15px;">
    <p style="padding: 0px 32px;"></p>
    <div class="container-fluid">
        <ul class="nav nav-tabs nav-justified" style="font-size: 17px;">
            <li role="presentation"><a href="#">Médicos</a></li>
            <li role="presentation" class="active"><a href="#">Pacientes</a></li>
            <li role="presentation" ><a href="#">Responsable</a></li>
            <li role="presentation " ><a href="#">Asistentes</a></li>
            <li role="presentation"><a href="#">Turnos</a></li>
            <li role="presentation"><a href="#">Horarios</a></li>
            <li role="presentation"><a href="#">Usuarios</a></li>
        </ul>
    </div>
    <div class="container-fluid" style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/actpacien.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para actualizar Pacientes, debes de llenar todos los campos del siguiente formulario para actualizar un Paciente.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Editar Paciente</li>
                    
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Actualizar Paciente Existente</div>
        <% 
            Paciente pacien = (Paciente) request.getSession().getAttribute("pacienEditar");
        %>
        <form class="form-padding" action="SrvActPaciente" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="nombrePacien" placeholder="" value="<%=pacien.getNombres()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los nombres del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Nombres</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="apellidoPacien" placeholder="" value="<%=pacien.getApellidos()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los apellidos del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Apellidos</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="cedulaPacien" placeholder="" value="<%=pacien.getCciudadania()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de cédula del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Cédula de ciudadanía</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="direccionPacien" placeholder="" value="<%=pacien.getDireccion()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Dirección</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="telefonoPacien" placeholder="" value="<%=pacien.getTelefono()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de teléfono del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Teléfono</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="correoPacien" placeholder="" value="<%=pacien.getCorreo_electronico()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección email del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Correo electrónico</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-12">
                    <div class="group-material">
                        <input type="date" class="material-control tooltips-general" name="fecNacPacien" placeholder="" value="<%=pacien.getFecha_nacimiento()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la fecha de nacimiento del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Fecha de nacimiento</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="seguro" placeholder="" value="<%=pacien.getTiene_seguro()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza si escribiste mal">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>¿Tiene Seguro?</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="tipsangre" placeholder="" value="<%=pacien.getTipo_sangre()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el tipo de sangre del paciente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Tipo de Sangre</label>
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

