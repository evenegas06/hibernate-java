package modelo.dto;


import java.io.Serializable;
import javax.persistence.Column;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")

public class Venta implements Serializable {
	@Id
	@Column(name = "idVenta")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVenta;
	
	@Column(name = "fechaVenta")
	private Date fechaVenta;

	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente idCliente;
	
	@Column(name = "total")
	private double total;

	private static final long serialVersionUID = 1L;

	public int getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(int id) {
		this.idVenta = id;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fecha) {
		this.fechaVenta = fecha;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente=idCliente;
	}
	
	public double getTotal(){
		return total;
	}
	
	public void setTotal(double total){
		this.total=total;
	}


	@Override
	public String toString() {
		return "Venta[id=" + idVenta + ", fechaVenta=" + fechaVenta+ ", idCliente=" + idCliente+ "]";
	}

}