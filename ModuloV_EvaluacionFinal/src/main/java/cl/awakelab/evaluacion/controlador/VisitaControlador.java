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
import cl.awakelab.evaluacion.modelo.Visita;
import cl.awakelab.evaluacion.servicio.ClienteServicio;
import cl.awakelab.evaluacion.servicio.VisitaServicio;

@Controller
public class VisitaControlador {

	@Autowired
	VisitaServicio vs;
	
	@Autowired
	ClienteServicio cs;
	
private static final Logger logger = LoggerFactory.getLogger(VisitaControlador.class);
	
	@RequestMapping (value="/creavisita",method = RequestMethod.GET)
	public String crearVisita(Model model) {
		
		
		logger.info("Ingreso a la creación de visitas");
		
		List<Cliente> listacli = cs.listarClientes();
		model.addAttribute("lclientes",listacli);
		logger.info("Ya cargué listado clientes");
		
		List<Visita> listav = vs.listarVisitas();
		model.addAttribute("lvisita", listav);
		logger.info("Ya cargué listado visitas");
		
		return "frmcrearvisita";
	}
	
	@RequestMapping (value="/procesavisita",method = RequestMethod.POST)
	public String procesarVisita(Model model,
			@RequestParam ("fechavisita") String fecha,
			@RequestParam ("horavisita") String hora,
			@RequestParam ("lugarvisita") String lugar,
			@RequestParam ("comentariovisita") String comentario,
			@RequestParam ("runcli") int runcli) {
		
		logger.info("Proceso la creación de la visita");
		
		Visita vis = new Visita();
		vis.setIdvisita(0);
		vis.setFecha_visita(fecha);
		vis.setHora_visita(hora);
		vis.setLugar_visita(lugar);
		vis.setComentario(comentario);
		vis.setRutcliente(runcli);
		
		boolean result = vs.crearVisita(vis);
		String msje = "";
		
		if (result) {
			msje = "La visita fue creada sin inconvenientes";
			logger.warn("Se creó la visita");
			
		}
		else {
			msje = "Ocurrió un error al momento de ejecutar la creación";
			logger.error("Falló al crear la visita");
		}

		String red="iniciopro";
		model.addAttribute("msgcrearvis", msje);
		model.addAttribute("redireccion", red);
		
		return "msgcrear";
	}
	
	
}
