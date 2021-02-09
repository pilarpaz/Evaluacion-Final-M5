package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Usuario;


public interface UsuarioServicio {

	public List<Usuario> listarUsuarios();
	public boolean crearUsuario(Usuario usuario);
	public boolean editarUsuario(Usuario usuario);
	public Usuario obtenerUsuarioPorId(int rut_user);
}
