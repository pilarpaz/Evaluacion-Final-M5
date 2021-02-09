package cl.awakelab.evaluacion.modelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer>{

	List<Cliente> findAllByRunusuario(int runusuario); 
}
