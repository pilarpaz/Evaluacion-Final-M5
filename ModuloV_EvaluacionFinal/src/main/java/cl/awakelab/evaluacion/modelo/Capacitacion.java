package cl.awakelab.evaluacion.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Capacitacion {

	@Id
	private int idcapacitacion;
	private String capfecha;
	private String caphora;
	private String caplugar;
	private int capduracion;
	private int cliente_rutCliente;
	
	public Capacitacion() {
		super();
	}

	public Capacitacion(int idcapacitacion, String capfecha, String caphora, String caplugar, int capduracion,
			int cliente_rutCliente) {
		super();
		this.idcapacitacion = idcapacitacion;
		this.capfecha = capfecha;
		this.caphora = caphora;
		this.caplugar = caplugar;
		this.capduracion = capduracion;
		this.cliente_rutCliente = cliente_rutCliente;
	}

	public int getIdcapacitacion() {
		return idcapacitacion;
	}

	public void setIdcapacitacion(int idcapacitacion) {
		this.idcapacitacion = idcapacitacion;
	}

	public String getCapfecha() {
		return capfecha;
	}

	public void setCapfecha(String capfecha) {
		this.capfecha = capfecha;
	}

	public String getCaphora() {
		return caphora;
	}

	public void setCaphora(String caphora) {
		this.caphora = caphora;
	}

	public String getCaplugar() {
		return caplugar;
	}

	public void setCaplugar(String caplugar) {
		this.caplugar = caplugar;
	}

	public int getCapduracion() {
		return capduracion;
	}

	public void setCapduracion(int capduracion) {
		this.capduracion = capduracion;
	}

	public int getCliente_rutCliente() {
		return cliente_rutCliente;
	}

	public void setCliente_rutCliente(int cliente_rutCliente) {
		this.cliente_rutCliente = cliente_rutCliente;
	}

	@Override
	public String toString() {
		return "Capacitacion [idcapacitacion=" + idcapacitacion + ", capfecha=" + capfecha + ", caphora=" + caphora
				+ ", caplugar=" + caplugar + ", capduracion=" + capduracion + ", cliente_rutCliente="
				+ cliente_rutCliente + "]";
	}
	
	
}
