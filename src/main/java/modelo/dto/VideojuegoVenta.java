package modelo.dto;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VideojuegoVenta")

public class VideojuegoVenta implements Serializable {
	@Id
	@Column(name = "idVideojuegoVenta")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVideojuegoVenta;
	
	@ManyToOne
	@JoinColumn(name = "idVenta", nullable = false)
	private Venta idVenta;
	
	@ManyToOne
	@JoinColumn(name = "idVideojuego", nullable = false)
	private Videojuego idVideojuego;
	
	@Column(name = "cantidad")
	private double cantidad;
	

	@Column(name = "subtotal")
	private double subtotal;

	private static final long serialVersionUID = 1L;

	public int getIdVideojuegoVenta() {
		return idVideojuegoVenta;
	}

	public void setIdVideojuegoVenta(int id) {
		this.idVideojuegoVenta = id;
	}

	public Venta getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Venta idVenta) {
		this.idVenta=idVenta;
	}

	public Videojuego getIdVideojuego() {
		return idVideojuego;
	}

	public void setIdVideojuego(Videojuego idVideojuego) {
		this.idVideojuego= idVideojuego;
	}
	
	public double getCantidad(){
		return cantidad;
	}
	
	public void setCantidad(double total){
		this.cantidad=total;
	}

	public double getSubtotal(){
		return subtotal;
	}
	
	public void setSubtotal(double total){
		this.subtotal=total;
	}

	@Override
	public String toString() {
		return "VideojuegoVenta[id=" + idVideojuegoVenta + ", idVenta=" + idVenta+ ", idVideojuego=" + idVideojuego+ "]";
	}
}