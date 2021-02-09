package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column(name = "rutusuario")
	private int rutusuario;
	private String nombre;
	@Column(name = "fechanacimiento")
	private String fecha_nacimiento;
	private int tipo;
	
	public Usuario() {
		super();
	}

	public Usuario(int rutusuario, String nombre, String fecha_nacimiento, int tipo) {
		super();
		this.rutusuario = rutusuario;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
		this.tipo = tipo;
	}

	public int getRutusuario() {
		return rutusuario;
	}

	public void setRutusuario(int rutusuario) {
		this.rutusuario = rutusuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Usuario [rutusuario=" + rutusuario + ", nombre=" + nombre + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", tipo=" + tipo + "]";
	}
	
	
}
