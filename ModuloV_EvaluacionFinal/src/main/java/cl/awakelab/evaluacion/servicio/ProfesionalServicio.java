package cl.awakelab.evaluacion.servicio;


import java.util.List;

import cl.awakelab.evaluacion.modelo.Profesional;

public interface ProfesionalServicio {

	public boolean crearProfesional(Profesional profesional);
	public boolean editarProfesional(Profesional profesional);
	public Profesional obtenerProfesionalPorId(int usuario_runusuario);
	public List<Profesional> buscarPorRunusuario(int runusuario); 
}
