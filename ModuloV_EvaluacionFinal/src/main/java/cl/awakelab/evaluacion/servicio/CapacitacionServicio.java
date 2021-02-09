package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Capacitacion;


public interface CapacitacionServicio {

	public List<Capacitacion> listarCapacitaciones();
	
	public boolean crearCapacitacion(Capacitacion capacitacion);
}
