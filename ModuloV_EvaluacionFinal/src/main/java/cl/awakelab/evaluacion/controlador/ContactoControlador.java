package cl.awakelab.evaluacion.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ContactoControlador {

private static final Logger logger = LoggerFactory.getLogger(ContactoControlador.class);
	
	@RequestMapping (value="/creacontacto",method = RequestMethod.GET)
	public String crearContacto() {
		
		logger.info("Ingreso a la creación de contacto");
		return "frmcontacto";
	}
	
	@RequestMapping (value="/procesacontacto",method = RequestMethod.POST)
	public String procesarCrearCap(Model model,
			@RequestParam ("nombre") String nombre,
			@RequestParam ("correo") String correo,
			@RequestParam ("telefono") String telefono,
			@RequestParam ("mensaje") String mensaje) {
		
		logger.info("Proceso la creación de contacto");
		
		//Contacto contacto = new Contacto(nombre, correo, telefono, mensaje);
	
		logger.info("Nombre: "+nombre+" Correo: "+correo+" Teléfono: "+telefono+" Mensaje: "+mensaje);
		return "msgcrear";
	}
	
	@RequestMapping (value="/creacontactopublico",method = RequestMethod.GET)
	public String crearContactoPublico() {
		
		logger.info("Ingreso a la creación de contacto publico");
		return "frmcontactopublico";
	}
}
