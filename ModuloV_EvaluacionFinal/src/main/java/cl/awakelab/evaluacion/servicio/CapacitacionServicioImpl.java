package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Capacitacion;
import cl.awakelab.evaluacion.modelo.CapacitacionRepositorio;


@Service
public class CapacitacionServicioImpl implements CapacitacionServicio{

	@Autowired
	CapacitacionRepositorio cr;
	
	@Override
	public List<Capacitacion> listarCapacitaciones() {
		
		return (List<Capacitacion>) cr.findAll();
	}

	@Override
	public boolean crearCapacitacion(Capacitacion capacitacion) {
		
		cr.save(capacitacion);
		return true;
	}

}
