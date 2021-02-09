/**
 * Funciones para validar formulario de editar cliente
 */
$(document).ready(function () {

    $("#btnvalidar").click(function () {

        $("#frmcrearid").validate({
            rules: {
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
                nombres: {
                    required: "Debe ingresar sus nombres"
                },
                apellidos: {
                    required: "Debe ingresar sus apellidos"
                },
                telefono: {
                    required: "Debe ingresar su teléfono"
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
                    digits: "Debe ingresar un número"
                }

            }
        });

    });

});