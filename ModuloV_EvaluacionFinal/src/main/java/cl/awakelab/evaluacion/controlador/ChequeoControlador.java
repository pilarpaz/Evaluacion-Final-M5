package cl.awakelab.evaluacion.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cl.awakelab.evaluacion.modelo.Chequeo;
import cl.awakelab.evaluacion.modelo.DetalleChequeo;
import cl.awakelab.evaluacion.servicio.ChequeoServicio;
import cl.awakelab.evaluacion.servicio.DetalleChequeoServicio;

@Controller
public class ChequeoControlador {

	@Autowired
	ChequeoServicio cs;
	
	@Autowired
	DetalleChequeoServicio ds;
	
	private static final Logger logger = LoggerFactory.getLogger(ChequeoControlador.class);
	
	@RequestMapping(value="/agregarchequeo/{idvisita}", method = RequestMethod.GET)
	public String editarUsuario(Model model, @PathVariable int idvisita) {
		
		logger.info("Entro a agregar chequeos");
				
		List<Chequeo> listcheq = cs.listarChequeos();
		logger.info("Mostré lista de chequeos");
		model.addAttribute("lchequeos", listcheq);
		model.addAttribute("idvi",idvisita);
		return "frmagregarchequeo";
		
	}
	
	@RequestMapping(value="/responderchecklist/{idvi}/bar/{idcheck}", method = RequestMethod.GET)
	public String editarUsuario(Model model, @PathVariable int idvi, @PathVariable int idcheck) {
		
		logger.info("Entro a guardar checklist");
		model.addAttribute("idcheck", idcheck);
		model.addAttribute("idvi",idvi);
		
		return "frmresponderchecklist";
	}
	
	@RequestMapping(value="/procesacheck", method = RequestMethod.POST)
	public String procesarChequeo(Model model, 
			@RequestParam ("idvisita") int idvisita,
			@RequestParam ("idchequeo") int idchequeo,
			@RequestParam ("estado") int estado) {
		
		logger.info("Proceso el checklist");
		DetalleChequeo detallecheck = new DetalleChequeo(idvisita, idchequeo, estado);
		
		boolean result = ds.crearDetalle(detallecheck);
		String mensaje = "";
		
		if (result) {
			mensaje = "El detalle chequeo fue insertado sin inconvenientes";
			logger.info("Se insertó el checklist");
		}
		else {
			mensaje = "Ocurrió un error al momento de ejecutar la petición";
			logger.error("Fallo al insertar checklist");
		}

		String red="creavisita";
		model.addAttribute("msgecrearcheck", mensaje);
		model.addAttribute("redireccion", red);
		return "msgcrear";
	}
}
