package cl.awakelab.evaluacion.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pago")
public class Pago {

	@Id
	private int idpago;
	@Column(name = "fechapago")
	private String fechapago;
	@Column(name = "montopago")
	private int monto;
	@Column(name = "mes")
	private  int mes;
	@Column(name = "año")
	private int anio;
	@Column(name = "cliente_rutcliente")
	private int runcliente;
	
	public Pago() {
		super();
	}

	public Pago(int idpago, String fechapago, int monto, int mes, int anio, int runcliente) {
		super();
		this.idpago = idpago;
		this.fechapago = fechapago;
		this.monto = monto;
		this.mes = mes;
		this.anio = anio;
		this.runcliente = runcliente;
	}

	public int getIdpago() {
		return idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	public String getFechapago() {
		return fechapago;
	}

	public void setFechapago(String fechapago) {
		this.fechapago = fechapago;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getRuncliente() {
		return runcliente;
	}

	public void setRuncliente(int runcliente) {
		this.runcliente = runcliente;
	}

	@Override
	public String toString() {
		return "Pago [idpago=" + idpago + ", fechapago=" + fechapago + ", monto=" + monto + ", mes=" + mes + ", anio="
				+ anio + ", runcliente=" + runcliente + "]";
	}
	
	
}
