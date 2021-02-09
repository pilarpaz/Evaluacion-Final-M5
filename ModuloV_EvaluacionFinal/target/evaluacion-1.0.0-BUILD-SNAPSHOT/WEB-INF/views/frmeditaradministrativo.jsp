<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html class="no-js" lang="zxx">

<head>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>SecuryGram</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/assets/img/favicon.ico">

   <!-- CSS here -->
   		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/gijgo.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/slicknav.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/animate.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/magnific-popup.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/fontawesome-all.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/themify-icons.css">
   		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/slick.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/nice-select.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/style.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/responsive.css">

</head>

<body>
    <!-- Preloader Start -->
    <div id="preloader-active">
        <div class="preloader d-flex align-items-center justify-content-center">
            <div class="preloader-inner position-relative">
                <div class="preloader-circle"></div>
                <div class="preloader-img pere-text">
                    <img src="${pageContext.request.contextPath}/resources/assets/img/logo/loder-logo.png" alt="">
                </div>
            </div>
        </div>
    </div>
    <!-- Preloader Start -->
   <header>
        <!-- Header Start -->
      <div class="header-area header-transparent">
            <div class="main-header ">
               <div class="header-top d-none d-lg-block">
                   <div class="container-fluid">
                       <div class="col-xl-12">
                            <div class="row d-flex justify-content-between align-items-center">
                                <div class="header-info-left">
                                    <ul>     
                                       <li>+569 74523481</li>
                                        <li>Contacto_SecuryGram@gmail.com</li>
                                    </ul>
                                </div>
                                <div class="header-info-right">
                                    <ul class="header-social">    
                                        <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                                        <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                                        <li><a href="#"><i class="fab fa-linkedin-in"></i></a></li>
                                       <li> <a href="#"><i class="fab fa-google-plus-g"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                       </div>
                   </div>
                </div>
               <div class="header-bottom  header-sticky">
                    <div class="container-fluid">
                        <div class="row align-items-center">
                            <!-- Logo -->
                            <div class="col-xl-2 col-lg-2 col-md-1">
                                <div class="logo">
                                    <!-- logo-1 -->
                                    <a href="<%=request.getContextPath()%>/inicioadmi" class="big-logo"><img src="${pageContext.request.contextPath}/resources/assets/img/logo/logo.png" alt=""></a>
                                    <!-- logo-2 -->
                                    <a href="<%=request.getContextPath()%>/inicioadmi" class="small-logo"><img src="${pageContext.request.contextPath}/resources/assets/img/logo/loder-logo.png" alt=""></a>
                                </div>
                            </div>
                            <div class="col-xl-8 col-lg-8 col-md-8">
                                <!-- Main-menu -->
                                <div class="main-menu f-right d-none d-lg-block">
                                    <nav> 
                                        <ul id="navigation">
                                            <li><a href="<%=request.getContextPath()%>/inicioadmi">Inicio Administrativo</a></li>
                                            <li><a href="<%=request.getContextPath()%>/listausuarios">Listar Usuarios</a></li>                                                                                                                 
                                            <li><a href="<%=request.getContextPath()%>/creausuario">Crear Usuario</a></li>
                                            <li><a href="<%=request.getContextPath()%>/creapago">Crear Pago</a></li>
                                            <li><a href="<%=request.getContextPath()%>/listapago">Listar Pagos</a></li>
                                            <!--  <li><a href="#">Administrar Chequeos</a></li>-->
                                        </ul>
                                    </nav>
                                </div>
                            </div>             
                            <div class="col-xl-2 col-lg-2 col-md-3">
                                <div class="header-right-btn f-right d-none d-lg-block">
                                    <a href="<%=request.getContextPath()%>/logout" class="btn">Cerrar Sesión</a>
                                </div>
                            </div>
                            <!-- Mobile Menu -->
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>
               </div>
            </div>
       </div>
        <!-- Header End -->
    </header>
    <!-- slider Area Start-->
    <div class="slider-area ">
        <div class="single-slider hero-overly slider-height2 d-flex align-items-center" data-background="${pageContext.request.contextPath}/resources/assets/img/hero/about.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <div class="hero-cap pt-100">
                            <h2>Administrativo</h2>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- slider Area End-->
    <!-- ================ Inicio Formulario ================= -->
    <section class="contact-section">
            <div class="container">    
                
                    <div class="col-12">
                        <h2 class="contact-title">Edición Usuario tipo Administrativo</h2>
                    </div>
                    <div class="border p-3 form">
                         <form name="frmeditadmi" id="frmeditadmi" class="form-contact contact_form" action='<c:out value="${pageContext.request.contextPath}"/>/procesareditaradm' method="post"  >
        						<div class='col-12'>
                                    <div class='form-group'>
                                      <input class='form-control w-100' name='run_adm' id='run_adm' value= '<c:out value="${administrativo.getRun_adm()}" ></c:out>' onfocus='this.placeholder = ' onblur='this.placeholder = "ingrese el run del Administrativo"' placeholder='ingrese el run del Administrativo' readonly>
                                    </div>
              					</div>
								<div class='col-12'>
                                    <div class='form-group'>
                                      <input class='form-control w-100' name='nombres_adm' id='nombres_adm' value ='<c:out value="${administrativo.getNombres_adm()}" ></c:out>' onfocus='this.placeholder = ' onblur='this.placeholder = "ingrese los nombres del Administrativo"' placeholder='ingrese los nombres del Administrativo'>
                                    </div>
              					</div>
								<div class='col-12'>
                                    <div class='form-group'>
                                      <input class='form-control w-100' name='apellidos_adm' id='apellidos_adm' value ='<c:out value="${administrativo.getApellidos_adm()}" ></c:out>' onfocus='this.placeholder = ' onblur='this.placeholder = "ingrese los apellidos  del Administrativo"' placeholder='ingrese los apellidos del Administrativo'>
                                    </div>
              					</div>
								<div class='col-12'>
                                    <div class='form-group'>
                                      <input class='form-control w-100' name='correo_adm' id='correo_adm' value ='<c:out value="${administrativo.getCorreo_adm()}" ></c:out>' onfocus='this.placeholder = ' onblur='this.placeholder = "ingrese el correo del Administrativo"' placeholder='ingrese el correo del Administrativo'>
                                  	</div>
              					</div>
								<div class='col-12'>
                                   	<div class='form-group'>
                                      <input class='form-control w-100' name='area_adm' id='area_adm' value ='<c:out value="${administrativo.getArea_adm()}" ></c:out>' onfocus='this.placeholder = ' onblur='this.placeholder = "ingrese el area del Administrativo"' placeholder='ingrese el area del Administrativo'>
                                   	</div>
              					</div>
              					<div class='col-12'>
                                    <div class='form-group'>
                                      <input class='form-control w-100'  name='run_usuario' id='run_usuario' value= '<c:out value="${administrativo.getRunusuario()}" ></c:out>' readonly>
                                    </div>
              					</div>
                            <div class="form-group mt-3">
                                <button type="submit" name="btnvalidar" id="btnvalidar" class="button button-contactForm boxed-btn">Enviar</button>
                            </div>

                        </form>

                    </div>
                
            </div>

        </section>
    <!-- ================ contact section end ================= -->
    <footer>
        <!-- Footer Start-->
        <div class="footer-main">
             <div class="footer-area footer-padding">
                 <div class="container">
                     <div class="row  justify-content-between">
                         <div class="col-lg-4 col-md-4 col-sm-8">
                             <div class="single-footer-caption mb-30">
                                 <!-- logo -->
                                 <div class="footer-logo">
                                     <a href="<%=request.getContextPath()%>/inicioadmi"><img src="${pageContext.request.contextPath}/resources/assets/img/logo/logo2_footer.png" alt=""></a>
                                 </div>
                                 <div class="footer-tittle">
                                     <div class="footer-pera">
                                        <!--- <p class="info1">aqui se puede escribir</p>--->
                                     </div>
                                 </div>
                             </div>
                         </div>
                         <div class="col-lg-2 col-md-4 col-sm-5">
                             <div class="single-footer-caption mb-50">
                                 <div class="footer-tittle">
                                     <h4>Links</h4>
                                     <ul>
                                         <li><a href="about.html">Sobre Nosotros</a></li>
                                         <li><a href="contact.html">Contactanos</a></li>
                                     </ul>
                                 </div>
                             </div>
                         </div>
                         <div class="col-lg-3 col-md-4 col-sm-7">
                             <div class="single-footer-caption mb-50">
                                 <div class="footer-tittle">
                                     <h4>Contacto</h4>
                                     <div class="footer-pera">
                                         <p class="info1">AV. PROVIDENCIA 1208, OFICINA 1603, PROVIDENCIA.</p>
                                     </div>
                                     <ul>
                                         <li><a >Mail: Contacto_SecuryGram@gmail.com</a></li>
                                         <li><a >Celular: +569 74523481</a></li>
                                     </ul>
                                 </div>
                             </div>
                         </div>
                     <!-- Copy-Right -->
                     <div class="row align-items-center">
                         <div class="col-xl-12 ">
                             <div class="footer-copy-right">
                                <p>Copyright &copy;<script>document.write(new Date().getFullYear());</script>  Template modificado por el grupo numero 3 <i class="fa fa-heart" aria-hidden="true"></i> </p>
                             </div>
                         </div>
                     </div>
                 </div>
             </div>
       </div>
       </div>
        <!-- Footer End-->
    </footer>
    <!-- JS here -->
	
		<!-- All JS Custom Plugins Link Here here -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/vendor/modernizr-3.5.0.min.js"></script>
		<!-- Jquery, Popper, Bootstrap -->
		<script src="${pageContext.request.contextPath}/resources/assets/js/vendor/jquery-1.12.4.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/popper.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
	    <!-- Jquery Mobile Menu -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.slicknav.min.js"></script>

		<!-- Jquery Slick , Owl-Carousel Plugins -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/owl.carousel.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/slick.min.js"></script>
        <!-- Date Picker -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/gijgo.min.js"></script>
		<!-- One Page, Animated-HeadLin -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/wow.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/animated.headline.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.magnific-popup.js"></script>

		<!-- Scrollup, nice-select, sticky -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.scrollUp.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.nice-select.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.sticky.js"></script>
               
        <!-- counter , waypoint -->
        <script src="http://cdnjs.cloudflare.com/ajax/libs/waypoints/2.0.3/waypoints.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.counterup.min.js"></script>

        <!-- contact js -->
        <script src="${pageContext.request.contextPath}/resources/assets/js/contact.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.form.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.2/dist/jquery.validate.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/mail-script.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.ajaxchimp.min.js"></script>
        
		<!-- Jquery Plugins, main Jquery -->	
        <script src="${pageContext.request.contextPath}/resources/assets/js/plugins.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/main.js"></script>
        

        <!-- Jquery crear usuario-->
         <script src="${pageContext.request.contextPath}/resources/JS/validaadministrativo.js"></script>
        
    </body>
    
</html>