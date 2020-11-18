package ec.edu.ups.gestionparqueadero.ObjetosNegocio;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.gestionparqueadero.Entidades.Ticket;
import ec.edu.ups.gestionparqueadero.Entidades.Vehiculo;
import ec.edu.ups.gestionparqueadero.ObjetosAccesoDatos.ClienteDAO;
import ec.edu.ups.gestionparqueadero.ObjetosAccesoDatos.VehiculoDAO;

@Stateless
public class GestionTicketON {
	
	@Inject
	private ClienteDAO daoCliente;
	
	public boolean registrarIngreso (String numero, String placa, String marca, String modelo) {
		
		return true;
	}
	public Ticket salidaVehiculo (int tikcet) {
		return null;	
	}
	public double  calcularTiempo (int idTicket) {
		return 0;
	}
	public Vehiculo buscarVehiculo (String placa) {
		return null;
	}
	public boolean registrarIngreso(Ticket ticket) {
		return true;
	}
}
