package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Usuario;
import cl.awakelab.evaluacion.modelo.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

	@Autowired
	UsuarioRepositorio ur;
	
	@Override
	public List<Usuario> listarUsuarios() {
		
		return (List<Usuario>) ur.findAll();
	}

	@Override
	public boolean crearUsuario(Usuario usuario) {
		
		ur.save(usuario);
		return true;
	}


	@Override
	public boolean editarUsuario(Usuario usuario) {
		
		ur.save(usuario);
		return true;
	}


	@Override
	public Usuario obtenerUsuarioPorId(int rut_user) {
		
		return ur.findOne(rut_user);
	}

}
