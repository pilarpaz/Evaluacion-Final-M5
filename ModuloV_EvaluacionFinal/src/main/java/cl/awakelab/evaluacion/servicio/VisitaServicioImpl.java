package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Visita;
import cl.awakelab.evaluacion.modelo.VisitaRepositorio;

@Service
public class VisitaServicioImpl implements VisitaServicio{

	@Autowired
	VisitaRepositorio vr;
	
	@Override
	public List<Visita> listarVisitas() {
		
		return (List<Visita>) vr.findAll();
	}

	@Override
	public boolean crearVisita(Visita visita) {
		
		vr.save(visita);
		return true;
	}

}
