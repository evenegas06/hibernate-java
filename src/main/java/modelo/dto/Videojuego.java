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
@Table(name = "Videojuego")

public class Videojuego implements Serializable{
	@Id
	@Column(name = "idVideojuego")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVideojuego;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "genero")
	private String genero;
	
	@Column(name = "fechaLanzamiento")
	private Date fechaLanzamiento;

	@Column(name = "costo")
	private double costo;
	
	@ManyToOne
	@JoinColumn(name = "idConsola",nullable = false)
	private Consola idConsola;
	

	private static final long serialVersionUID = 1L;


	public int getIdVideojuego() {
		return idVideojuego;
	}
	
	public void setIdVideojuego(int id){
		this.idVideojuego=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public Date getFechaLanzamiento(){
		return fechaLanzamiento;
	}
	
	public void setFechaLanzamiento(Date fecha){
		this.fechaLanzamiento=fecha;
	}
	
	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo=costo;
	}
	
	public Consola getIdConsola(){
		return idConsola;
	}
	
	public void setIdConsola(Consola idConsola){
		this.idConsola=idConsola;
	}
	
	@Override
	public String toString() {
		return "Videojuego[id=" + idVideojuego + ", nombre=" + nombre + ", costo=" + costo + "]";
	}

}
