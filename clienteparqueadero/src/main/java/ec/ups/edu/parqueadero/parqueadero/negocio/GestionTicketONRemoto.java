package ec.ups.edu.parqueadero.parqueadero.negocio;

import ec.ups.edu.parqueadero.parqueadero.modelos.Cliente;
import ec.ups.edu.parqueadero.parqueadero.modelos.Vehiculo;

public interface GestionTicketONRemoto {
	public boolean registrarCliente(Cliente cliente) throws Exception;
	public boolean registrarVehiculo(Vehiculo vehiculo) throws Exception ;
		
}
