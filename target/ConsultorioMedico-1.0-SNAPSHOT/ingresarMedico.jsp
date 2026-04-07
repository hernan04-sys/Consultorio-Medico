<%-- 
    Document   : ingresarMedico
    Created on : 22 jul 2024, 11:03:59
    Author     : ANGEL AMAGUAYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Ingresar Médico</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Ingresar Médicos <small>administración de Médicos</small></h1>
    </div>
</div>
<section class="full-reset text-justify" style="padding: 0px 15px;">
    <p style="padding: 0px 32px;"></p>
    <div class="container-fluid">
        <ul class="nav nav-tabs nav-justified" style="font-size: 17px;">
            <li role="presentation"class="active"><a href="#">Médicos</a></li>
            <li role="presentation" ><a href="#">Pacientes</a></li>
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
                <img src="assets/img/masdoc.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para registrar nuevos Médicos, debes de llenar todos los campos del siguiente formulario para registrar un Médico.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Nuevo Médico</li>
                   
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Registrar un nuevo Médico</div>
        <form class="form-padding" action="SvrDoctores" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="nombreDoc" placeholder="Escribe los nombres del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top" >
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Nombres</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="apellidoDoc" placeholder="Escribe los apellidos del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Apellidos</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="cedulaDoc" placeholder="Escribe el número de cédula del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Cédula de ciudadanía</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="direccionDoc" placeholder="Escribe la dirección domiciliaria del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Dirección</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="telefonoDoc" placeholder="Escribe el número de teléfono del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Teléfono</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="correoDoc" placeholder="Escribe la dirección email del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Correo electrónico</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="date" class="material-control tooltips-general" name="fecNacDoc" placeholder="" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Ingresa la fecha de nacimiento del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Fecha de nacimiento</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="especiDoc" placeholder="Escribe la especialidad del médico" required="" maxlength="200" data-toggle="tooltip" data-placement="top">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Especialidad</label>
                    </div>
                </div>
                <div class="col-xs-12">
                    <p class="text-center">
                        <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                        <button type="submit" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Ingresar Médico</button>
                    </p>
                </div>
            </div>
        </form>
    </div>
</section>

<%@include file="Componentes/body2.jsp"%>

