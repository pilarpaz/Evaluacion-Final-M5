package cl.awakelab.evaluacion.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.DetalleChequeo;
import cl.awakelab.evaluacion.modelo.DetalleChequeoRepositorio;

@Service
public class DetalleChequeoServicioImpl implements DetalleChequeoServicio{

	@Autowired
	DetalleChequeoRepositorio cr;
	
	@Override
	public boolean crearDetalle(DetalleChequeo detalle) {
		
		cr.save(detalle);
		return true;
	}

}
