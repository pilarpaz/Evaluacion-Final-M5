package cl.awakelab.evaluacion.modelo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface AdministrativoRepositorio extends CrudRepository<Administrativo, Integer>{

	List<Administrativo> findAllByRunusuario(int runusuario);
}
