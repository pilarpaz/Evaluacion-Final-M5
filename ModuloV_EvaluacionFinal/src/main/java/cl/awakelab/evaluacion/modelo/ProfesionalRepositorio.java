package cl.awakelab.evaluacion.modelo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProfesionalRepositorio extends CrudRepository<Profesional, Integer>{

	 List<Profesional> findAllByRunusuario(int runusuario); 
}
