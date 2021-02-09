/**
 * Funciones para validar formulario de editar administrativo
 */
$(document).ready(function () {

    $("#btnvalidar").click(function () {

        $("#frmeditadmi").validate({
            rules: {
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
                },
            messages: {
                nombres_adm: {
                    required: "Debe ingresar sus nombres"
                },
                apellidos_adm: {
                    required: "Debe ingresar sus apellidos"
                },
                correo_adm: {
                    required: "Debe ingresar su correo electrónico",
					email: "Debe ingresar un correo válido"
                },
                area_adm: {
                    required: "Debe ingresar el área en la cual trabaja"
                }
                }
            }
        });

    });

});