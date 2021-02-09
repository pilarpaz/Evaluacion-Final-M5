/**
 *Permite validar el formulario para crear un cliente dependiendo el tipo
 * 1.- cliente 2.- administrativo 3.- profesional  
*/
function hizoClick() {
  var tipo = document.getElementById("tipousuario").value;
  
  if (tipo == 1) {
      
      $("#frmcrearid").validate({
            rules: {
                txtnombre: {
                    required: true
                },
                txtfecha: {
                    required: true
                },
                run_usuario: {
                    required: true,
                    digits: true
                },
                tipousuario: {
                    required: true
                },
                run: {
                    required: true,
                    digits: true
                },
                nombres: {
                    required: true
                },
                apellidos: {
                    required: true
                },
                telefono: {
                    required: true,
                    digits: true
                },
                afps: {
                    required: true
                },
                salud: {
                    required: true
                },
                direccion: {
                    required: true
                },
                comuna: {
                    required: true
                },
                edad: {
                    required: true,
                    digits: true
                }
            },
            messages: {
            	txtnombre: {
                    required: "Debe ingresar su nombre completo"
                },
                txtfecha: {
                    required: "Debe ingresar su fecha de nacimiento"
                },
                run_usuario: {
                    required: "Debe ingresar su rut sin puntos ni digito verificador",
                    digits: "Debe ingresar solo numeros"
                },
                tipousuario: {
                    required: "Debe seleccionar el tipo de usuario"
                },
                run: {
                    required: "Debe ingresar su rut sin puntos ni digito verificador",
                    digits: "Debe ingresar solo numeros"
                },
                nombres: {
                    required: "Debe ingresar sus nombres"
                },
                apellidos: {
                    required: "Debe ingresar sus apellidos"
                },
                telefono: {
                    required: "Debe ingresar su telefono"
                },
                afps: {
                    required: "Debe ingresar su AFP"
                },
                salud: {
                    required: "Debe ingresar su sistema de salud"
                },
                direccion: {
                    required: "Debe ingresar su dirección"
                },
                comuna: {
                    required: "Debe ingresar su comuna"
                },
                edad: {
                    required: "Debe ingresar su edad",
                    digits: "Debe ingresar un numero"
                }

            }
        }); 
  } else if(tipo == 2){
  		
  		$("#frmcrearid").validate({
            rules: {
                txtnombre: {
                    required: true
                },
                txtfecha: {
                    required: true
                },
                run_usuario: {
                    required: true,
                    digits: true
                },
                tipousuario: {
                    required: true
                },
                run_adm: {
                    required: true,
                    digits:true
                },
                nombres_adm: {
                    required: true
                },
                apellidos_adm: {
                    required: true
                },
                correo_adm: {
                    required: true,
					email: true
                },
                area_adm: {
                    required: true
                }
            },
            messages: {
            	txtnombre: {
                    required: "Debe ingresar su nombre completo"
                },
                txtfecha: {
                    required: "Debe ingresar su fecha de nacimiento"
                },
                run_usuario: {
                    required: "Debe ingresar su rut sin puntos ni digito verificador",
                    digits: "Debe ingresar solo numeros"
                },
                tipousuario: {
                    required: "Debe seleccionar el tipo de usuario"
                },
                 run_adm: {
                    required: "Debe ingresar su rut sin puntos ni digito verificador",
                    digits: "Debe ingresar solo numeros"
                },
                 nombres_adm: {
                    required: "Debe ingresar sus nombres"
                },
                apellidos_adm: {
                    required: "Debe ingresar sus apellidos"
                },
                correo_adm: {
                    required: "Debe ingresar su correo electronico",
					email: "Debe ingresar un correo valido"
                },
                area_adm: {
                    required: "Debe ingresar el area en la cual trabaja"
                }

            }
        });
  	}else if(tipo == 3){
  		
  		$("#frmcrearid").validate({
            rules: {
                txtnombre: {
                    required: true
                },
                txtfecha: {
                    required: true
                },
                run_usuario: {
                    required: true,
                    digits: true
                },
                tipousuario: {
                    required: true
                },
                run_pro: {
                    required: true,
                    digits: true
                },
                nombre_pro: {
                    required: true
                },
                apellido_pro: {
                    required: true
                },
                telefono_pro: {
                    required: true,
                    digits: true
                },
                titulo: {
                    required: true
                },
                proyecto: {
                    required: true
                }
            },
            messages: {
                txtnombre: {
                    required: "Debe ingresar su nombre completo"
                },
                txtfecha: {
                    required: "Debe ingresar su fecha de nacimiento"
                },
                run_usuario: {
                    required: "Debe ingresar su rut sin puntos ni digito verificador",
                    digits: "Debe ingresar solo numeros"
                },
                tipousuario: {
                    required: ""
                },
                run_pro: {
                    required: "Debe ingresar su rut sin puntos ni digito verificador",
                    digits: "Debe ingresar solo numeros"
                },
                nombre_pro: {
                    required: "Debe ingresar sus nombres"
                },
                apellido_pro: {
                    required: "Debe ingresar sus apellidos"
                },
                telefono_pro: {
                    required: "Debe ingresar su telefono",
                    digits: "Debe ingresar solo números"
                },
                titulo: {
                    required: "Debe ingresar su titulo"
                },
                proyecto: {
                    required: "Debe ingresar su proyecto"
                }

            }
        });
  	}
}
