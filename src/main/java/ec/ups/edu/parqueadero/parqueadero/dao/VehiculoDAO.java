package ec.ups.edu.parqueadero.parqueadero.dao;
import ec.ups.edu.parqueadero.parqueadero.dao.VehiculoDAO;
import ec.ups.edu.parqueadero.parqueadero.modelos.Vehiculo;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.management.Query;

import ec.ups.edu.parqueadero.parqueadero.modelos.Ticket;
//import java.sql.Date;
import ec.ups.edu.parqueadero.parqueadero.modelos.Vehiculo;
public class VehiculoDAO {

	public Vehiculo read(String placa) {
//		String dml = "SELECT * FROM Vehiculo WHERE  placa = placa";
//		try {
//			Query ps = con.createQuery(dml,Vehiculo.class);
//			ps.setQuery(dml);
//			ps.executeQuery();
			Vehiculo vehiculo = new Vehiculo();
//
//			vehiculo.setplaca(ps.getParameter(1));
//			vehiculo.setmarca(ps.getParameter(2));
//			vehiculo.setcolor(ps.getParameter(3));
//			return vehiculo;
//		} catch (Exception e) {
//			System.out.println(e.printStrackTrace());
//			Vehiculo  ve= null;
			return vehiculo;
//		}

	}


public boolean insertar(Vehiculo vehiculo){
     String dml = "INSERT INTO Ticket(codigo, placa_vehiculo, fecha_ingreso VALUES (?, ?, ?)";

//     try{
//         PreparementStament ps = con.getStament();
//         ps.setQuery(dml);
//         ps.setParameter(1, ticket.getCodigo());
//         ps.setParameter(2, ticket.getVehiculo().getPlaca());
//         ps.setParameter(3, new Date());
//         ps.executeUpdate();
//         return true;
//     }catch(Exception e){
//         System.out.println(e.printStrackTrace());
         return false;
//     }

}


	public boolean update(Vehiculo vehiculo) {
		return true;
	}

	public boolean delete(String placa) {

		return true;
	}
}
