<%-- 
    Document   : ingresarUsuario
    Created on : 22 jul 2024, 11:03:59
    Author     : ANGEL AMAGUAYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Ingresar Usuario</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Ingresar Usuarios <small>administración de usuarios</small></h1>
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
            <li role="presentation" ><a href="#">Turnos</a></li>
            <li role="presentation"><a href="#">Horarios</a></li>
            <li role="presentation" class="active"><a href="#">Usuarios</a></li>
        </ul>
    </div>
    <div class="container-fluid" style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/masusu.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para registrar nuevos Usuarios del sistema, debes de llenar todos los campos del siguiente formulario para registrar un Usuario.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Nuevo Usuario</li>
                    
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Registrar un nuevo Usuario</div>
        <form class="form-padding" action="SrvUsuarios" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="nombreUsuario" placeholder="Escribe el nombre del usuario" required="" maxlength="200" data-toggle="tooltip" data-placement="top" >
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Nombre del Usuario</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="password" class="material-control tooltips-general" name="contrasenia" placeholder="Escribe una contraseña segura" required="" maxlength="200" data-toggle="tooltip" data-placement="top" >
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Contraseña del Usuario</label>
                    </div>
                </div>
                <div class="col-xs-12">
                    <p class="text-center">
                        <button type="reset" class="btn btn-info" style="margin-right: 20px;"><i class="zmdi zmdi-roller"></i> &nbsp;&nbsp; Limpiar</button>
                        <button type="submit" class="btn btn-primary"><i class="zmdi zmdi-floppy"></i> &nbsp;&nbsp; Ingresar Usuario</button>
                    </p>
                </div>
            </div>
        </form>
    </div>
</section>

<%@include file="Componentes/body2.jsp"%>