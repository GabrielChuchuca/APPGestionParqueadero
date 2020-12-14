package ec.ups.edu.parqueadero.parqueadero.modelos;

import java.io.Serializable;

import javax.ejb.Stateless;
//@Stateless
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String dni;
	private int tipoDocumento;
	private String nombre;
	private String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", tipoDocumento=" + tipoDocumento + ", nombre=" + nombre
				+ ", email=" + email + "]";
	}


	
	
}
