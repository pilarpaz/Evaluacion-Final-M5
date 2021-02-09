package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Pago;

public interface PagoServicio {

	public List<Pago> listarPagos();
	
	public boolean crearPago(Pago pago);
}
