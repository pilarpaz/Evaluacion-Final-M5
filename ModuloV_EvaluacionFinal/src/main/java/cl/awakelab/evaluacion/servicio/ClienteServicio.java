package cl.awakelab.evaluacion.servicio;

import java.util.List;

import cl.awakelab.evaluacion.modelo.Cliente;

public interface ClienteServicio {

	public boolean crearCliente(Cliente cliente);
	public boolean editarCliente(Cliente cliente);
	public Cliente obtenerCliPorId(int usuario_runusuario);
	public List<Cliente> buscarPorRunusuario(int runusuario); 
	public List<Cliente> listarClientes();
}
