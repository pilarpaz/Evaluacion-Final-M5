package cl.awakelab.evaluacion.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.evaluacion.modelo.Cliente;
import cl.awakelab.evaluacion.modelo.Pago;
import cl.awakelab.evaluacion.servicio.ClienteServicio;
import cl.awakelab.evaluacion.servicio.PagoServicio;

@Controller
public class PagoControlador {

	@Autowired
	PagoServicio ps;
	
	@Autowired 
	ClienteServicio cs;
	
	private static final Logger logger = LoggerFactory.getLogger(PagoControlador.class);
	
	@RequestMapping (value="/creapago",method = RequestMethod.GET)
	public String crearPago(Model model) {
		
		
		logger.info("Ingreso a la creación de pagos");
		
		List<Cliente> listacli = cs.listarClientes();
		model.addAttribute("lclientes",listacli);
		
		logger.info("Ya cargué listado clientes");
		
		return "frmcrearpago";
	}
	
	
	@RequestMapping (value="/procesapago",method = RequestMethod.POST)
	public String procesarPago(Model model,
			@RequestParam ("fechapago") String fecha,
			@RequestParam ("monto") int monto,
			@RequestParam ("mespago") int mes,
			@RequestParam ("anopago") int anio,
			@RequestParam ("runcli") int runcli) {
		
		logger.info("Proceso la creación del pago");
		
		Pago pago = new Pago();
		pago.setIdpago(0);
		pago.setFechapago(fecha);
		pago.setMonto(monto);
		pago.setMes(mes);
		pago.setAnio(anio);
		pago.setRuncliente(runcli);
		
		boolean result = ps.crearPago(pago);
		String msje = "";
		
		if (result) {
			msje = "El pago fue creado sin inconvenientes";
			logger.warn("Se creó el pago");
			
		}
		else {
			msje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Falló al crear el pago");
		}

		String red="inicioadmi";
		model.addAttribute("msgcrearpago", msje);
		model.addAttribute("redireccion", red);
		
		return "msgcrear";
	}
	
	@RequestMapping (value="/listapago",method = RequestMethod.GET)
	public String listarPago(Model model) {
		
		
		logger.info("Ingreso al listado de pagos");
		
		List<Pago> listapago = ps.listarPagos();
		model.addAttribute("lpago",listapago);
		
		logger.info("Ya mostré listado pagos");
		
		return "frmlistapago";
	}
	
}
