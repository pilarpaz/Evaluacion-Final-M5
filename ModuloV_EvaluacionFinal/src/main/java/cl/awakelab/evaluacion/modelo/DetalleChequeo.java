package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetalleChequeo {

	@Id
	@Column(name = "visita_idvisita")
	private int idvisita;
	@Column(name = "chequeo_idchequeo")
	private int idchequeo;
	@Column(name = "estadocumplimiento")
	private int estado;
	
	public DetalleChequeo() {
		super();
	}

	public DetalleChequeo(int idvisita, int idchequeo, int estado) {
		super();
		this.idvisita = idvisita;
		this.idchequeo = idchequeo;
		this.estado = estado;
	}

	public int getIdvisita() {
		return idvisita;
	}

	public void setIdvisita(int idvisita) {
		this.idvisita = idvisita;
	}

	public int getIdchequeo() {
		return idchequeo;
	}

	public void setIdchequeo(int idchequeo) {
		this.idchequeo = idchequeo;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "DetalleChequeo [idvisita=" + idvisita + ", idchequeo=" + idchequeo + ", estado=" + estado + "]";
	}
	
	
}
