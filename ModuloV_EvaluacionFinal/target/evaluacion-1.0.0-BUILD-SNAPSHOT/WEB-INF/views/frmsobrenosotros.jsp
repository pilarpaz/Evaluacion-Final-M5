<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
                                    <a href="<%=request.getContextPath()%>/" class="big-logo"><img src="${pageContext.request.contextPath}/resources/assets/img/logo/logo.png" alt=""></a>
                                    <!-- logo-2 -->
                                    <a href="<%=request.getContextPath()%>/" class="small-logo"><img src="${pageContext.request.contextPath}/resources/assets/img/logo/loder-logo.png" alt=""></a>
                                </div>
                            </div>
                            <div class="col-xl-8 col-lg-8 col-md-8">
                                <!-- Main-menu -->
                                <div class="main-menu f-right d-none d-lg-block">
                                    <nav> 
                                        <ul id="navigation">
                                            <li><a href="<%=request.getContextPath()%>/">Inicio</a></li>                                                                                                                 
                                            <li><a href="<%=request.getContextPath()%>/quiensomos">Quienes Somos</a></li>
                                            <li><a href="<%=request.getContextPath()%>/creacontactopublico">Contacto</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>             
                            <div class="col-xl-2 col-lg-2 col-md-3">
                                <div class="header-right-btn f-right d-none d-lg-block">
                                    <a href="<%=request.getContextPath()%>/acceder" class="btn">Acceder</a>
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
    <main>
        <!-- slider Area Start-->
        <div class="slider-area ">
            <div class="single-slider hero-overly slider-height2 d-flex align-items-center" data-background="${pageContext.request.contextPath}/resources/assets/img/hero/about.jpg">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-12">
                            <div class="hero-cap pt-100">
                                <h2>Sobre nosotros</h2>
                                <nav aria-label="breadcrumb ">
                                    <ol class="breadcrumb">
                                    <li class="breadcrumb-item"><a href="<%=request.getContextPath()%>/">Inicio</a></li>
                                    <li class="breadcrumb-item"><a href="<%=request.getContextPath()%>/creacontactopublico">Contacto</a></li> 
                                    </ol>
                                </nav>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- slider Area End-->
        <!-- About Area Start -->
        <section class="support-company-area fix pt-10 section-padding30">
            <div class="support-wrapper align-items-end">
                <div class="left-content">
                    <!-- section tittle -->
                    <div class="section-tittle section-tittle2 mb-55">
                        <div class="front-text">
                            <h2 class="">Quienes Somos</h2>
                        </div>
                        <span class="back-text">Sobre Nosotros</span>
                    </div>
                    <div class="support-caption">
                        <p class="pera-top">Somos una empresa de asesoria en Seguridad Laboral, que cuenta con más de 10 años de experiencia en el rubro,
                                            con el objetivo de entregar soluciones de calidad a cada uno de nuestros clientes.</p>
                        <p><strong>Nuestra Misión</strong><br>
						Entregar soluciones innovadoras en la gestión de la Prevención de Riesgos a todo tipo de empresas e industrias,
						generando sistemas exclusivos y a la medida de cada uno de nuestros clientes.
						Contamos con la mejor tecnología para que toda nuestra información se encuentre en línea y de forma segura,
						brindando asi mayor seguridad laboral y un mejor ambiente laboral con las condiciones 
						optimas para el cuidado de la salud de los trabajadores.</p>
						<p> <strong>Nuestra Visión</strong> <br>
						Ser una empresa lider en el área de consultoras en prevención de riesgos a nivel nacional, apoyando de forma 
						permanente la producción, el servicio y crecimiento de nuestros clientes sea cual sea su actividad económica.
						</p>
                        <a href="<%=request.getContextPath()%>/quiensomos" class="btn red-btn2">read more</a>
                    </div>
                </div>
                <div class="right-content">
                    <!-- img -->
                    <div class="right-img">
                        <img src="${pageContext.request.contextPath}/resources/assets/img/gallery/safe_in.png" alt="">
                    </div>
                    <div class="support-img-cap text-center">
                        <span>2010</span>
                        <p>Desde</p>
                    </div>
                </div>
            </div>
        </section>
        <!-- About Area End --> 
        <!-- Testimonial Start -->
        <!-- Testimonial End -->
        <!-- Team Start -->
         <div class="team-area section-padding30">
            <div class="container">
                <div class="row">
                    <div class="col-xl-12">
                        <!-- Section Tittle -->
                        <div class="section-tittle section-tittle5 mb-50">
                            <div class="front-text">
                                <h2 class="">Nuestro Equipo</h2>
                            </div>
                            <span class="back-text">Expertos</span>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <!-- single Tem -->
                    <div class="col-xl-3 col-lg-3 col-md-5 col-sm-">
                        <div class="single-team mb-30">
                            <div class="team-img">
                                <img src="${pageContext.request.contextPath}/resources/assets/img/team/team1.png" alt="">
                            </div>
                            <div class="team-caption">
                                <span>Algo</span>
                                <h3>Ricardo Olguin</h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 col-lg-3 col-md-5 col-sm-">
                        <div class="single-team mb-30">
                            <div class="team-img">
                                <img src="${pageContext.request.contextPath}/resources/assets/img/team/team2.png" alt="">
                            </div>
                            <div class="team-caption">
                                <span>Algo</span>
                                <h3>Cathy</h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 col-lg-3 col-md-5 col-sm-">
                        <div class="single-team mb-30">
                            <div class="team-img">
                                <img src="${pageContext.request.contextPath}/resources/assets/img/team/team2.png" alt="">
                            </div>
                            <div class="team-caption">
                                <span>Algo</span>
                                <h3>Pilar</h3>
                            </div>
                        </div>
                    </div>
                    <div class="col-xl-3 col-lg-3 col-md-5 col-sm-">
                        <div class="single-team mb-30">
                            <div class="team-img">
                                <img src="${pageContext.request.contextPath}/resources/assets/img/team/team1.png" alt="">
                            </div>
                            <div class="team-caption">
                                <span>Algo</span>
                                <h3>Marcelo</h3>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Team End -->
    </main>
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
                                     <a href="<%=request.getContextPath()%>/"><img src="${pageContext.request.contextPath}/resources/assets/img/logo/logo2_footer.png" alt=""></a>
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
                                         <li><a href="<%=request.getContextPath()%>/quiensomos">Sobre Nosotros</a></li>
                                         <li><a href="<%=request.getContextPath()%>/creacontactopublico">Contactanos</a></li>
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
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.validate.min.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/mail-script.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.ajaxchimp.min.js"></script>
        
		<!-- Jquery Plugins, main Jquery -->	
        <script src="${pageContext.request.contextPath}/resources/assets/js/plugins.js"></script>
        <script src="${pageContext.request.contextPath}/resources/assets/js/main.js"></script>
        

        <!-- Jquery crear usuario-->
         <script src="${pageContext.request.contextPath}/resources/assets/js/funcionUsuario.js"></script>
        
    </body>
</html>