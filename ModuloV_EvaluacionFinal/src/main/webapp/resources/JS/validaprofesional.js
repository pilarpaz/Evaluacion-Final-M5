/**
 * Funciones para validar formulario de editar profesional
 */
$(document).ready(function () {

    $("#btnvalidar").click(function () {

        $("#frmcrearid").validate({
            rules: {
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
                nombre_pro: {
                    required: "Debe ingresar sus nombres"
                },
                apellido_pro: {
                    required: "Debe ingresar sus apellidos"
                },
                telefono_pro: {
                    required: "Debe ingresar su teléfono",
                    digits: "Debe ingresar solo números"
                },
                titulo: {
                    required: "Debe ingresar su título"
                },
                proyecto: {
                    required: "Debe ingresar su proyecto"
                }

            }
        });

    });

});