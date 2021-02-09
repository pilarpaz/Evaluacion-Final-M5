/**
 *funcionUusuario.js
 *Permite mostrar el formulario para crear un cliente dependiendo el tipo
 * 1.- cliente 2.- administrativo 3.- profesional  
*/

function cargartipo(){
	var tipo = document.getElementById("tipousuario");
	var a = tipo.value;
	
	if(a== 1){
		document.getElementById("contenido").innerHTML = 
			" <br><div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='run' id='run' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el run del cliente'' placeholder='ingrese el run del cliente'>"+
                                    "</div>"+
              "</div>"+
			" <div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='nombres' id='nombres' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese los nombres del cliente '' placeholder='ingrese los nombres del cliente'>"+
                                    "</div>"+
              "</div>"+
            " <div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='apellidos' id='apellidos' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese los apellidos del cliente'' placeholder='ingrese los apellidos del cliente'>"+
                                    "</div>"+
              "</div>"+
			" <div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='telefono' id='telefono' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el numero telefono cliente'' placeholder='ingrese el numero telefono cliente'>"+
                                    "</div>"+
              "</div>"+
            "<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <select class=' form-select form-control valid ' name='afps' id='afps'>"+
                                      	"<option selected>Seleccione la afp del cliente</option>"+
										"<option value='modelo'>Modelo</option><option value='provida'>Provida</option>"+
										"<option value='habitat'>Habitat</option><option value='capital'>Capital</option>"+
										"<option value='plan vital'>Plan vital</option></select>"+
									"</div>"+
									
              "</div>"+

               "<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <select class=' form-select form-control valid ' name='salud' id='salud'>"+
                                     	"<option selected>Seleccione el sistema de salud del cliente</option>"+
                                      	"<option value='1'>Fonasa</option>"+
                                      	"<option value='2'>Isapre</option>"+
                                      	"</select>"+
									"</div>"+
									
              "</div>"+

			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='direccion' id='direccion' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese la direccion del cliente'' placeholder='ingrese la direccion del cliente'>"+
                                    "</div>"+
              "</div>"+
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='comuna' id='comuna' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese la comuna del cliente'' placeholder='ingrese la comuna del cliente'>"+
                                    "</div>"+
              "</div>"+
           "<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='edad' id='edad' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese la edad del cliente'' placeholder='ingrese la edad del cliente'>"+
                                    "</div>"+
              "</div>";

	}else if(a== 2){
		document.getElementById("contenido").innerHTML =
			"<br><div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='run_adm' id='run_adm' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el run del Administrativo'' placeholder='ingrese el run del Administrativo'>"+
                                    "</div>"+
              "</div>" +
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='nombres_adm' id='nombres_adm' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese los nombres del Administrativo'' placeholder='ingrese los nombres del Administrativo'>"+
                                    "</div>"+
              "</div>" +
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='apellidos_adm' id='apellidos_adm' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese los apellidos  del Administrativo'' placeholder='ingrese los apellidos del Administrativo'>"+
                                    "</div>"+
              "</div>" +
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='correo_adm' id='correo_adm onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el correo del Administrativo'' placeholder='ingrese el correo del Administrativo'>"+
                                    "</div>"+
              "</div>" +
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='area_adm' id='area_adm'onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el area del Administrativo'' placeholder='ingrese el area del Administrativo'>"+
                                    "</div>"+
              "</div>";
	}else if(a== 3){
		document.getElementById("contenido").innerHTML = 
		    "<br><div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='run_pro' id='run_pro'onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el run del profesional'' placeholder='ingrese el run del profesional'>"+
                                    "</div>"+
              "</div>"+
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='nombre_pro' id='nombre_pro' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el nombre del profesional'' placeholder='ingrese el nombre del profesional'>"+
                                    "</div>"+
              "</div>"+
            "<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='apellido_pro' id='apellido_pro' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el apellido del profesional'' placeholder='ingrese el apellido del profesional'>"+
                                    "</div>"+
              "</div>"+
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='telefono_pro' id='telefono_pro' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el telefono del profesional'' placeholder='ingrese el telefono del profesional'>"+
                                    "</div>"+
              "</div>"+
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100' name='titulo' id='titulo' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el titulo del profesional'' placeholder='ingrese el titulo del profesional'>"+
                                    "</div>"+
              "</div>"+	
			"<div class='col-12'>"+
                                    "<div class='form-group'>"+
                                      " <input class='form-control w-100'  name='proyecto' id='proyecto' onfocus='this.placeholder = ''' onblur='this.placeholder = 'ingrese el proyecto del profesional'' placeholder='ingrese el proyecto del profesional'>"+
                                    "</div>"+
              "</div>";
	}
}