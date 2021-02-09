package cl.awakelab.evaluacion.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Login {

	private static final Logger logger = LoggerFactory.getLogger(Login.class);
	
	@RequestMapping("/error")
    public String error(ModelMap model)
    {
        model.addAttribute("error", "true");
        return "login";
    }

    @RequestMapping("/login")
    public String login()
    {
    	logger.info("Inicio sesión");
        //System.out.println("Dentro del login");
        return "login";
    }
    
    @RequestMapping("/logout")
    public String logout()
    {
    	logger.info("Cierro sesión");
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){    
        	SecurityContextHolder.getContext().setAuthentication(null);
        }
        return "redirect:/acceder?logout"; 
    }
}
