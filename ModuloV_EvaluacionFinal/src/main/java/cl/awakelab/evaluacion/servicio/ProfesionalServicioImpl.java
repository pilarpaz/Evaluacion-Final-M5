package cl.awakelab.evaluacion.servicio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Profesional;
import cl.awakelab.evaluacion.modelo.ProfesionalRepositorio;


@Service
public class ProfesionalServicioImpl implements ProfesionalServicio{

	@Autowired
	ProfesionalRepositorio pr;
	
	@Override
	public boolean crearProfesional(Profesional profesional) {
		
		pr.save(profesional);
		return true;
	}

	@Override
	public boolean editarProfesional(Profesional profesional) {
		
		pr.save(profesional);
		return true;
	}

	@Override
	public Profesional obtenerProfesionalPorId(int usuario_runusuario) {
		
		return pr.findOne(usuario_runusuario);
	}

	@Override
	public List<Profesional> buscarPorRunusuario(int runusuario) {
		
		List<Profesional> pro = pr.findAllByRunusuario(runusuario);
		return pro;
	}

	
	
}
