package ec.edu.ups.gestionparqueadero.ObjetosAccesoDatos;

import java.sql.PreparedStatement;

import ec.edu.ups.gestionparqueadero.Entidades.Ticket;
//import java.sql.Date;
import ec.edu.ups.gestionparqueadero.Entidades.Vehiculo;

public class VehiculoDAO {

	public Vehiculo read(String placa) {
		String dml = "SELECT * FROM Vehiculo WHERE  placa = placa";
		try {
			PreparedStatement ps = con.getStatement();
			ps.setQuery(dml);
			ps.executeQuery();
			Vehiculo vehiculo = new Vehiculo();

			vehiculo.setplaca(ps.getParameter(1));
			vehiculo.setmarca(ps.getParameter(2));
			vehiculo.setcolor(ps.getParameter(3));
			return vehiculo;
		} catch (Exception e) {
			System.out.println(e.printStrackTrace());
			vehiculo = null;
			return vehiculo;
		}

	}


private boolean insert(Ticket ticket){
     String dml = "INSERT INTO Ticket(codigo, placa_vehiculo, fecha_ingreso VALUES (?, ?, ?)";

     try{
          PreparementStament ps = con.getStament();
         ps.setQuery(dml);
         ps.setParameter(1, ticket.getCodigo());
         ps.setParameter(2, ticket.getVehiculo().getPlaca();
         ps.setParameter(3, new Date());

         ps.executeUpdate();
         return boolean;
     }catch(Exception e){
         System.out.println(e.printStrackTrace());
         return false;
     }

}


	public boolean update(Vehiculo vehiculo) {
		return true;
	}

	public boolean delete(String placa) {

		return true;
	}
}
