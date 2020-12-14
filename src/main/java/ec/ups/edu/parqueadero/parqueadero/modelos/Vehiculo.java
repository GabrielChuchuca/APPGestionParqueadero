package ec.ups.edu.parqueadero.parqueadero.modelos;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Vehiculo implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private String placa;
	private String marca;
	private String color;
	
	
	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
