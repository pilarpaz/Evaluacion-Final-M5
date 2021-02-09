package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visita {

	@Id
	private int idvisita;
	@Column(name = "visfecha")
	private String fecha_visita;
	@Column(name = "vishora")
	private String hora_visita;
	@Column(name = "vislugar")
	private String lugar_visita;
	@Column(name = "viscomentario")
	private String comentario;
	@Column(name = "cliente_rutcliente")
	private int rutcliente;
	
	public Visita() {
		super();
	}

	public Visita(int idvisita, String fecha_visita, String hora_visita, String lugar_visita, String comentario,
			int rutcliente) {
		super();
		this.idvisita = idvisita;
		this.fecha_visita = fecha_visita;
		this.hora_visita = hora_visita;
		this.lugar_visita = lugar_visita;
		this.comentario = comentario;
		this.rutcliente = rutcliente;
	}

	public int getIdvisita() {
		return idvisita;
	}

	public void setIdvisita(int idvisita) {
		this.idvisita = idvisita;
	}

	public String getFecha_visita() {
		return fecha_visita;
	}

	public void setFecha_visita(String fecha_visita) {
		this.fecha_visita = fecha_visita;
	}

	public String getHora_visita() {
		return hora_visita;
	}

	public void setHora_visita(String hora_visita) {
		this.hora_visita = hora_visita;
	}

	public String getLugar_visita() {
		return lugar_visita;
	}

	public void setLugar_visita(String lugar_visita) {
		this.lugar_visita = lugar_visita;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getRutcliente() {
		return rutcliente;
	}

	public void setRutcliente(int rutcliente) {
		this.rutcliente = rutcliente;
	}

	@Override
	public String toString() {
		return "Visita [idvisita=" + idvisita + ", fecha_visita=" + fecha_visita + ", hora_visita=" + hora_visita
				+ ", lugar_visita=" + lugar_visita + ", comentario=" + comentario + ", rutcliente=" + rutcliente + "]";
	}
	
	
}
