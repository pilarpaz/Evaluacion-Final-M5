package cl.awakelab.evaluacion.modelo;

public class Contacto {

	private String nombre;
	private String correo;
	private String telefono;
	private String mensaje;
	
	public Contacto() {
		super();
	}

	public Contacto(String nombre, String correo, String telefono, String mensaje) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + ", mensaje=" + mensaje
				+ "]";
	}
	
	
}
