package cl.awakelab.evaluacion.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.evaluacion.modelo.Cliente;
import cl.awakelab.evaluacion.modelo.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	ClienteRepositorio cr;
	
	@Override
	public boolean crearCliente(Cliente cliente) {
		
		cr.save(cliente);
		return true;
	}

	@Override
	public boolean editarCliente(Cliente cliente) {
		
		cr.save(cliente);
		return true;
	}

	@Override
	public Cliente obtenerCliPorId(int usuario_runusuario) {
		
		return cr.findOne(usuario_runusuario);
	}

	@Override
	public List<Cliente> buscarPorRunusuario(int runusuario) {
		
		List<Cliente> cli = cr.findAllByRunusuario(runusuario);
		return cli;
	}

	@Override
	public List<Cliente> listarClientes() {
		
		return (List<Cliente>) cr.findAll();
	}

}
