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
@Table(name = "Preventa")

public class Preventa implements Serializable {
	@Id
	@Column(name = "idPreventa")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idPreventa;

	@ManyToOne
	@JoinColumn(name = "idVideojuego", nullable = false)
	private Videojuego idVideojuego;

	@Column(name = "anticipo")
	private double anticipo;

	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false)
	private Cliente idCliente;

	private static final long serialVersionUID = 1L;

	public int getIdPreventa() {
		return idPreventa;
	}

	public void setIdPreventa(int id) {
		this.idPreventa = id;
	}

	public Videojuego getIdVideojuego() {
		return idVideojuego;
	}

	public void setIdVideojuego(Videojuego idVideojuego) {
		this.idVideojuego = idVideojuego;
	}

	public double getAnticipo() {
		return anticipo;
	}

	public void setAnticipo(double anticipo) {
		this.anticipo = anticipo;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente=idCliente;
	}


	@Override
	public String toString() {
		return "Preventa[id=" + idPreventa + ", idVideojuego=" + idVideojuego + ", anticipo=" + anticipo + "]";
	}

}