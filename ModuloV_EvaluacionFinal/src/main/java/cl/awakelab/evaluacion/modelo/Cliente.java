package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cliente")
public class Cliente {

	@Id
	@Column(name = "rutcliente")
	private int run_cliente;
	@Column(name = "clinombre")
	private String nombres;
	@Column(name = "cliapellidos")
	private String apellidos;
	@Column(name = "clitelefono")
	private String telefono;
	@Column(name = "cliafp")
	private String afp;
	@Column(name = "clisistemasalud")
	private int sistema_salud;
	@Column(name = "clidireccion")
	private String direccion;
	@Column(name = "clicomuna")
	private String comuna;
	@Column(name = "cliedad")
	private int edad;
	@Column(name = "usuario_runusuario")
	private int runusuario;
	
	public Cliente() {
		super();
	}

	public Cliente(int run_cliente, String nombres, String apellidos, String telefono, String afp, int sistema_salud,
			String direccion, String comuna, int edad, int runusuario) {
		super();
		this.run_cliente = run_cliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistema_salud = sistema_salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
		this.runusuario = runusuario;
	}

	public int getRun_cliente() {
		return run_cliente;
	}

	public void setRun_cliente(int run_cliente) {
		this.run_cliente = run_cliente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public int getSistema_salud() {
		return sistema_salud;
	}

	public void setSistema_salud(int sistema_salud) {
		this.sistema_salud = sistema_salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getRunusuario() {
		return runusuario;
	}

	public void setRunusuario(int runusuario) {
		this.runusuario = runusuario;
	}

	@Override
	public String toString() {
		return "Cliente [run_cliente=" + run_cliente + ", nombres=" + nombres + ", apellidos=" + apellidos
				+ ", telefono=" + telefono + ", afp=" + afp + ", sistema_salud=" + sistema_salud + ", direccion="
				+ direccion + ", comuna=" + comuna + ", edad=" + edad + ", runusuario=" + runusuario + "]";
	}
	
	
}
