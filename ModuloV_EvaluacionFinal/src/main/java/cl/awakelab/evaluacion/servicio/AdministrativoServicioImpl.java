package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Administrativo;
import cl.awakelab.evaluacion.modelo.AdministrativoRepositorio;

@Service
public class AdministrativoServicioImpl implements AdministrativoServicio{

	@Autowired
	AdministrativoRepositorio ar;
	
	@Override
	public boolean crearAdministrativo(Administrativo administrativo) {
		
		ar.save(administrativo);
		return true;
	}

	@Override
	public boolean editarAdministrativo(Administrativo administrativo) {
		
		ar.save(administrativo);
		return true;
	}

	@Override
	public Administrativo obtenerAdmPorId(int usuario_runusuario) {
		
		return ar.findOne(usuario_runusuario);
	}

	@Override
	public List<Administrativo> buscarPorRunusuario(int runusuario) {
		
		List<Administrativo> adm = ar.findAllByRunusuario(runusuario);
		return adm;
	}

	
	
}
