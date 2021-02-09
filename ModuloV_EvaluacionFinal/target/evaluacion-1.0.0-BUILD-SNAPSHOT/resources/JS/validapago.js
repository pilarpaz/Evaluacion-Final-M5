/**
 * Funciones para validar formulario de crear pago
 */
$(document).ready(function () {

    $("#btnvalidar").click(function () {

        $("#frmcrearid").validate({
            rules: {
                fechapago: {
                    required: true
                },
                monto: {
                    required: true,
                    digits: true
                },
                mespago: {
                    required: true
                },
                anopago: {
                    required: true,
                    digits: true
                },
                runcli: {
                    required: true
                }
                
            },
            messages: {
                fechapago: {
                    required: "Debe ingresar la fecha del pago"
                },
                monto: {
                    required: "Debe ingresar el monto del pago",
                    digits: "Debe ingresar solo números"
                },
                mespago: {
                    required: "Debe ingresar el mes del pago"
                },
                anopago: {
                    required: "Debe ingresar el ano del pago",
                    digits: "Debe ingresar solo números"
                },
                runcli: {
                    required: "Debe seleccionar el rut del cliente"
                }

            }
        });

    });

});