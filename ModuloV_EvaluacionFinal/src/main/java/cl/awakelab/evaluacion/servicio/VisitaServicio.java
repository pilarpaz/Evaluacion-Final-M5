package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Visita;

public interface VisitaServicio {

	public List<Visita> listarVisitas();
	
	public boolean crearVisita(Visita visita);
}
