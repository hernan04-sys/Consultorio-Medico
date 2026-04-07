<%-- 
    Document   : actualizarResponsable
    Created on : 25 jul 2024, 22:24:00
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Responsable"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Actualizar Responsable</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Actualizar Responsables <small>editar datos del responsable</small></h1>
    </div>
</div>
<section class="full-reset text-justify" style="padding: 0px 15px;">
    <p style="padding: 0px 32px;"></p>
    <div class="container-fluid">
        <ul class="nav nav-tabs nav-justified" style="font-size: 17px;">
            <li role="presentation"><a href="#">Médicos</a></li>
            <li role="presentation" ><a href="#">Pacientes</a></li>
            <li role="presentation" class="active" ><a href="#">Responsable</a></li>
            <li role="presentation " ><a href="#">Asistentes</a></li>
            <li role="presentation"><a href="#">Turnos</a></li>
            <li role="presentation"><a href="#">Horarios</a></li>
            <li role="presentation"><a href="#">Usuarios</a></li>
        </ul>
    </div>
    <div class="container-fluid" style="margin: 50px 0;">
        <div class="row">
            <div class="col-xs-12 col-sm-4 col-md-3">
                <img src="assets/img/actresp.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para actualizar Responsables, debes de llenar todos los campos del siguiente formulario para actualizar un Responsable.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Editar Responsable</li>
                    
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Actualizar Responsable Existente</div>
        <% 
            Responsable resp = (Responsable) request.getSession().getAttribute("respEditar");
        %>
        <form class="form-padding" action="SrvActResponsable" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="nombreResp" placeholder="" value="<%=resp.getNombres()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los nombres del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Nombres</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="apellidoResp" placeholder="" value="<%=resp.getApellidos()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los apellidos del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Apellidos</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="cedulaResp" placeholder="" value="<%=resp.getCciudadania()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de cédula del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Cédula de ciudadanía</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="direccionResp" placeholder="" value="<%=resp.getDireccion()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Dirección</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="telefonoResp" placeholder="" value="<%=resp.getTelefono()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de teléfono del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Teléfono</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="correoResp" placeholder="" value="<%=resp.getCorreo_electronico()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección email del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Correo electrónico</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="date" class="material-control tooltips-general" name="fecNacResp" placeholder="" value="<%=resp.getFecha_nacimiento()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la fecha de nacimiento del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Fecha de nacimiento</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="tipoResp" placeholder="" value="<%=resp.getTipo_responsabilidad()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el tipo de responsabilidad">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Tipo de responsabilidad</label>
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


