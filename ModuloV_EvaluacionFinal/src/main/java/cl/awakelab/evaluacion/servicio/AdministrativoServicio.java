package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Administrativo;

public interface AdministrativoServicio {

	public boolean crearAdministrativo(Administrativo administrativo);
	public boolean editarAdministrativo(Administrativo administrativo);
	public Administrativo obtenerAdmPorId(int usuario_runusuario);
	public List<Administrativo> buscarPorRunusuario(int runusuario); 
}
