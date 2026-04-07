<%-- 
    Document   : actualizarMedico
    Created on : 25 jul 2024, 19:27:51
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Doctor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Actualizar Médico</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Actualizar Médicos <small>editar datos del médico</small></h1>
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
                <img src="assets/img/actdoc.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para actualizar Médicos, debes de llenar todos los campos del siguiente formulario para actualizar un Médico.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Editar Médico</li>
                    
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Actualizar Médico Existente</div>
        <% 
            Doctor doc = (Doctor) request.getSession().getAttribute("docEditar");
            String fechaNacimientoFormatted = "";
            if (doc.getFecha_nacimiento() != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                fechaNacimientoFormatted = sdf.format(doc.getFecha_nacimiento());
            }
        %>
        <form class="form-padding" action="SrvActMedico" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="nombreDoc" placeholder="" value="<%=doc.getNombres()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los nombres del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Nombres</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="apellidoDoc" placeholder="" value="<%=doc.getApellidos()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los apellidos del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Apellidos</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="cedulaDoc" placeholder="" value="<%=doc.getCciudadania()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de cédula del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Cédula de ciudadanía</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="direccionDoc" placeholder="" value="<%=doc.getDireccion()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Dirección</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="telefonoDoc" placeholder="" value="<%=doc.getTelefono()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de teléfono del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Teléfono</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="correoDoc" placeholder="" value="<%=doc.getCorreo_electronico()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección email del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Correo electrónico</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="date" class="material-control tooltips-general" name="fecNacDoc" placeholder="" value="<%=fechaNacimientoFormatted%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la fecha de nacimiento del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Fecha de nacimiento</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="especiDoc" placeholder="" value="<%=doc.getEspecialidad()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la especialidad del médico">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Especialidad</label>
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
