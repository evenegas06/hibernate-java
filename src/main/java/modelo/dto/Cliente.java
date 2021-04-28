package modelo.dto;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")

public class Cliente implements Serializable{
	@Id
	@Column(name = "idCliente")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCliente;

	@Column(name = "nombre")
	private String nombre;


	private static final long serialVersionUID = 1L;


	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int id){
		this.idCliente=id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	@Override
	public String toString() {
		return "Cliente[id=" + idCliente + ", nombre=" + nombre +"]";
	}

}
