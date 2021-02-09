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

import cl.awakelab.evaluacion.modelo.Capacitacion;
//import cl.awakelab.evaluacion.modelo.Cliente;
import cl.awakelab.evaluacion.servicio.CapacitacionServicio;
import cl.awakelab.evaluacion.servicio.ClienteServicio;


@Controller
public class CapacitacionControlador {

	@Autowired
	CapacitacionServicio cs;
	
	@Autowired
	ClienteServicio clis;
	
	private static final Logger logger = LoggerFactory.getLogger(CapacitacionControlador.class);
	
	@RequestMapping(value="/listacapacitaciones", method = RequestMethod.GET)
	public String listarCapacitaciones(Model model) {
		logger.info("Ingreso al listado de capacitaciones");
		
		List<Capacitacion> listacap = cs.listarCapacitaciones();
		model.addAttribute("lcapacitaciones",listacap);
		
		logger.info("Ya mostr� listado");
		return "frmlistacapacitacion";
	}
	
	@RequestMapping (value="/creacapacitacion",method = RequestMethod.GET)
	public String crearCapacitacion(Model model) {
		
		logger.info("Ingreso a la creaci�n de capacitaciones");
		/*List<Cliente> listcli = clis.listarClientes();
		logger.info("Cargu� lista de clientes");
		model.addAttribute("lclientes", listcli);*/
		
		return "frmcrearcapacitacion";
	}
	
	@RequestMapping (value="/procesacrear",method = RequestMethod.POST)
	public String procesarCrearCap(Model model,
			@RequestParam ("fecha") String fecha,
			@RequestParam ("hora") String hora,
			@RequestParam ("lugar") String lugar,
			@RequestParam ("duracion") int duracion,
			@RequestParam ("rut") int rut) {
		
		logger.info("Proceso la creaci�n de capacitaciones");
		
		Capacitacion capacitacion = new Capacitacion();
		capacitacion.setIdcapacitacion(0);
		capacitacion.setCapfecha(fecha);
		capacitacion.setCaphora(hora);
		capacitacion.setCaplugar(lugar);
		capacitacion.setCapduracion(duracion);
		capacitacion.setCliente_rutCliente(rut);
		
		boolean result = cs.crearCapacitacion(capacitacion);
		String msje = "";
		
		if (result) {
			msje = "La capacitaci�n fue creada sin inconvenientes";
			logger.warn("Se cre� la capacitaci�n");
			
		}
		else {
			msje = "Ocurri� un error al momento de ejecutar la creaci�n";
			logger.error("Fall� al crear la capacitaci�n");
		}
		
		String red="iniciocli";
		model.addAttribute("msgcrearcap", msje);
		model.addAttribute("redireccion", red);
		
		return "msgcrear";
	}
}
