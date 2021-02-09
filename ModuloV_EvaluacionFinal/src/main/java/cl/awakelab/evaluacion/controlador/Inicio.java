package cl.awakelab.evaluacion.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Inicio {

	private static final Logger logger = LoggerFactory.getLogger(Inicio.class);
	
	@RequestMapping (value="/",method = RequestMethod.GET)
	public String mostrarInicio() {
		
		logger.info("P�gina de Inicio");
		return "frminicio";
	}
	
	@RequestMapping (value="/inicioadmi",method = RequestMethod.GET)
	public String mostrarInicioAdmi() {
		
		logger.info("P�gina de Inicio Administrativo");
		return "frminicioadministrativo";
	}
	
	@RequestMapping (value="/iniciopro",method = RequestMethod.GET)
	public String mostrarInicioPro() {
		
		logger.info("P�gina de Inicio Profesional");
		return "frminicioprofesional";
	}
	
	@RequestMapping (value="/iniciocli",method = RequestMethod.GET)
	public String mostrarInicioCli() {
		
		logger.info("P�gina de Inicio Cliente");
		return "frminiciocliente";
	}
	
	@RequestMapping (value="/acceder",method = RequestMethod.GET)
	public String mostrarAcceder() {
		
		logger.info("P�gina de acceso");
		return "frmacceder";
	}
	
	@RequestMapping (value="/quiensomos",method = RequestMethod.GET)
	public String mostrarSomos() {
		
		logger.info("P�gina de quienes somos");
		return "frmsobrenosotros";
	}
}
