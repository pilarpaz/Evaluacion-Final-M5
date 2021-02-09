package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "administrativos")
public class Administrativo {

	@Id
	@Column(name = "runadministrativo")
	private int run_adm;
	@Column(name = "nombres")
	private String nombres_adm;
	@Column(name = "apellidos")
	private String apellidos_adm;
	@Column(name = "correo")
	private String correo_adm;
	@Column(name = "area")
	private String area_adm;
	@Column(name = "usuario_runusuario")
	private int runusuario;
	
	public Administrativo() {
		super();
	}

	public Administrativo(int run_adm, String nombres_adm, String apellidos_adm, String correo_adm, String area_adm,
			int runusuario) {
		super();
		this.run_adm = run_adm;
		this.nombres_adm = nombres_adm;
		this.apellidos_adm = apellidos_adm;
		this.correo_adm = correo_adm;
		this.area_adm = area_adm;
		this.runusuario = runusuario;
	}

	public int getRun_adm() {
		return run_adm;
	}

	public void setRun_adm(int run_adm) {
		this.run_adm = run_adm;
	}

	public String getNombres_adm() {
		return nombres_adm;
	}

	public void setNombres_adm(String nombres_adm) {
		this.nombres_adm = nombres_adm;
	}

	public String getApellidos_adm() {
		return apellidos_adm;
	}

	public void setApellidos_adm(String apellidos_adm) {
		this.apellidos_adm = apellidos_adm;
	}

	public String getCorreo_adm() {
		return correo_adm;
	}

	public void setCorreo_adm(String correo_adm) {
		this.correo_adm = correo_adm;
	}

	public String getArea_adm() {
		return area_adm;
	}

	public void setArea_adm(String area_adm) {
		this.area_adm = area_adm;
	}

	public int getRunusuario() {
		return runusuario;
	}

	public void setRunusuario(int runusuario) {
		this.runusuario = runusuario;
	}

	@Override
	public String toString() {
		return "Administrativo [run_adm=" + run_adm + ", nombres_adm=" + nombres_adm + ", apellidos_adm="
				+ apellidos_adm + ", correo_adm=" + correo_adm + ", area_adm=" + area_adm + ", runusuario="
				+ runusuario + "]";
	}
	
}
