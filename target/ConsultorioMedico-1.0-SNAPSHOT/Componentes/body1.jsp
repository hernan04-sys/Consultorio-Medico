<%-- 
    Document   : body1
    Created on : 22 jul 2024, 11:01:17
    Author     : ANGEL AMAGUAYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<body>
    <div class="navbar-lateral full-reset">
        <div class="visible-xs font-movile-menu mobile-menu-button"></div>
        <div class="full-reset container-menu-movile nav-lateral-scroll">
            <div class="logo full-reset all-tittles">
                <i class="visible-xs zmdi zmdi-close pull-left mobile-menu-button" style="line-height: 55px; cursor: pointer; padding: 0 10px; margin-left: 7px;"></i> 
                Consultorio Médico
            </div>
            <div class="nav-lateral-divider full-reset"></div>
            <div class="full-reset" style="padding: 10px 0; color:#fff;">
                <figure>
                    <img src="assets/img/logo2.png" alt="Biblioteca" class="img-responsive center-box" style="width:55%;">
                </figure>
                <p class="text-center" style="padding-top: 15px;">Web Medic</p>
            </div>
            <div class="nav-lateral-divider full-reset"></div>
            <div class="full-reset nav-lateral-list-menu">
                <ul class="list-unstyled">
                    <li><a href="index.jsp"><i class="fas fa-solid fa-home"></i>&nbsp;&nbsp; Inicio</a></li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-user-md"></i>&nbsp;&nbsp; Médicos <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarMedico.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Médicos</a></li>
                            <li><a href="SvrDoctores"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Médicos</a></li>
                          
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-solid fa-users"></i>&nbsp;&nbsp; Pacientes <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarPaciente.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Pacientes</a></li>
                            <li><a href="SvrPacientes"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Pacientes</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-solid fa-user-tie"></i>&nbsp;&nbsp; Responsables <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarResponsable.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Responsables</a></li>
                            <li><a href="SvrResponsables"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Responsables</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-user-friends"></i>&nbsp;&nbsp; Asistentes <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarAsistente.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Asistentes</a></li>
                            <li><a href="SvrAsistentes"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Asistentes</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-fw fa-folder"></i>&nbsp;&nbsp; Turnos <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarTurno.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Turnos</a></li>
                            <li><a href="SrvTurnos"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Turnos</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-regular fa-calendar-day"></i>&nbsp;&nbsp; Horarios <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarHorario.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Horarios</a></li>
                            <li><a href="SrvHorarios"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Horarios</a></li>
                            
                        </ul>
                    </li>
                    <li>
                        <div class="dropdown-menu-button"><i class="fas fa-solid fa-user"></i>&nbsp;&nbsp; Usuarios <i class="zmdi zmdi-chevron-down pull-right zmdi-hc-fw icon-sub-menu"></i></div>
                        <ul class="list-unstyled">
                            <li><a href="ingresarUsuario.jsp"><i class="fas fa-solid fa-plus-circle"></i>&nbsp;&nbsp; Ingresar Usuarios</a></li>
                            <li><a href="SrvUsuarios"><i class="fas fa-solid fa-eye"></i>&nbsp;&nbsp; Mostrar Usuarios</a></li>
                            
                        </ul>
                    </li>

                </ul>
            </div>
        </div>
    </div>
    <div class="content-page-container full-reset custom-scroll-containers">
        <nav class="navbar-user-top full-reset">
            <ul class="list-unstyled full-reset">
                <figure>
                   <img src="assets/img/user01.png" alt="user-picture" class="img-responsive img-circle center-box">
                </figure>
                <li style="color:#fff; cursor:default;">
                    <span class="all-tittles"><%=request.getSession().getAttribute("usuario")%></span>
                </li>
                <li  class="tooltips-general exit-system-button" data-href="login.jsp" data-placement="bottom" title="Salir del sistema">
                    <i class="zmdi zmdi-power"></i>
                </li>

                <li class="mobile-menu-button visible-xs" style="float: left !important;">
                    <i class="zmdi zmdi-menu"></i>
                </li>
                <li class="desktop-menu-button hidden-xs" style="float: left !important;">
                    <i class="zmdi zmdi-swap"></i>
                </li>
            </ul>
        </nav>

