package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chequeo {

	@Id
	private int idchequeo;
	@Column(name="nombrechequeo")
	private String nombre;
	
	public Chequeo() {
		super();
	}

	public Chequeo(int idchequeo, String nombre) {
		super();
		this.idchequeo = idchequeo;
		this.nombre = nombre;
	}

	public int getIdchequeo() {
		return idchequeo;
	}

	public void setIdchequeo(int idchequeo) {
		this.idchequeo = idchequeo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Chequeo [idchequeo=" + idchequeo + ", nombre=" + nombre + "]";
	}
	
	
}
