/**
 * Funciones para validar formulario de crear visita
 */
$(document).ready(function () {

    $("#btnvalidar").click(function () {

        $("#frmcrearid").validate({
            rules: {
                fechavisita: {
                    required: true
                },
                horavisita: {
                    required: true
                },
                lugarvisita: {
                    required: true
                },
                comentariovisita: {
                    required: true
                }
            },
            messages: {
                fechavisita: {
                    required: "Debe ingresar la fecha de la visita"
                },
                horavisita: {
                    required: "Debe ingresar la hora de la visita"
                },
                lugarvisita: {
                    required: "Debe ingresar el lugar de la visita"
                },
                comentariovisita: {
                    required: "Debe ingresar los comentarios"
                }

            }
        });

    });

});