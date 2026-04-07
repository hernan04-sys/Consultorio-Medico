<%-- 
    Document   : actualizarAsistente
    Created on : 25 jul 2024, 23:05:33
    Author     : ANGEL AMAGUAYA
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Asistente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Componentes/header.jsp"%>
    <title>Actualizar Asistente</title>
<%@include file="Componentes/header2.jsp"%>
<%@include file="Componentes/body1.jsp"%>

<div class="container">
    <div class="page-header">
        <h1 class="all-tittles">Actualizar Asistentes <small>editar datos del asistente</small></h1>
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
                <img src="assets/img/actasis.png" alt="user" class="img-responsive center-box" style="max-width: 110px;">
            </div>
            <div class="col-xs-12 col-sm-8 col-md-8 text-justify lead">
                Bienvenido a la sección para actualizar Asistentes, debes de llenar todos los campos del siguiente formulario para actualizar un Asistente.
            </div>
        </div>
    </div>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12 lead">
                <ol class="breadcrumb">
                    <li class="active">Editar Asistente</li>
                    
                </ol>
            </div>
        </div>
    </div>
    <div class="container-flat-form">
        <div class="title-flat-form title-flat-blue">Actualizar Asistente Existente</div>
        <% 
            Asistente asis = (Asistente) request.getSession().getAttribute("asisEditar");
        %>
        <form class="form-padding" action="SrvActAsistente" method="POST">
            <div class="row">
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="nombreAsis" placeholder="" value="<%=asis.getNombres()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los nombres del responsable">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Nombres</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="apellidoAsis" placeholder="" value="<%=asis.getApellidos()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza los apellidos del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Apellidos</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="cedulaAsis" placeholder="" value="<%=asis.getCciudadania()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de cédula del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Cédula de ciudadanía</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="direccionAsis" placeholder="" value="<%=asis.getDireccion()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Dirección</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="telefonoAsis" placeholder="" value="<%=asis.getTelefono()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el número de teléfono del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Teléfono</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="correoAsis" placeholder="" value="<%=asis.getCorreo_electronico()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la dirección email del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Correo electrónico</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="date" class="material-control tooltips-general" name="fecNacAsis" placeholder="" value="<%=asis.getFecha_nacimiento()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza la fecha de nacimiento del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Fecha de nacimiento</label>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-6">
                    <div class="group-material">
                        <input type="text" class="material-control tooltips-general" name="lugarTrab" placeholder="" value="<%=asis.getLugar_trabajo()%>" required="" maxlength="200" data-toggle="tooltip" data-placement="top" title="Actualiza el lugar de trabajo del asistente">
                        <span class="highlight"></span>
                        <span class="bar"></span>
                        <label>Lugar de trabajo</label>
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



