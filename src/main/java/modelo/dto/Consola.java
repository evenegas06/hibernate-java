package modelo.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Consola")

public class Consola implements Serializable{
	@Id
	@Column(name = "idconsola")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idConsola;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "costo")
	private double costo;
	

	private static final long serialVersionUID = 1L;


	public int getIdConsola() {
		return idConsola;
	}
	
	public void setIdConsola(int id){
		this.idConsola=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo=costo;
	}
	
	
	@Override
	public String toString() {
		return "Consola[id=" + idConsola + ", nombre=" + nombre + ", costo=" + costo + "]";
	}

}
