package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Pago;
import cl.awakelab.evaluacion.modelo.PagoRepositorio;

@Service
public class PagoServicioImpl implements PagoServicio{

	@Autowired
	PagoRepositorio pr;
	
	@Override
	public List<Pago> listarPagos() {
		
		return (List<Pago>) pr.findAll();
	}

	@Override
	public boolean crearPago(Pago pago) {
		
		pr.save(pago);
		return true;
	}

}
