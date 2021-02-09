package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Chequeo;
import cl.awakelab.evaluacion.modelo.ChequeoRepositorio;

@Service
public class ChequeoServicioImpl implements ChequeoServicio{

	@Autowired
	ChequeoRepositorio cr;
	
	@Override
	public List<Chequeo> listarChequeos() {
		
		return (List<Chequeo>) cr.findAll();
	}

}
