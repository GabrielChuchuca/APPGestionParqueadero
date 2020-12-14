package ec.ups.edu.parqueadero.parqueadero.dao;

//import java.sql.Date;
import ec.ups.edu.parqueadero.parqueadero.modelos.Factura;
import ec.ups.edu.parqueadero.parqueadero.modelos.Ticket;

public class FacturaDAO {

private boolean insert(Factura factura){
     String dml = "INSERT INTO Ticket(codigo, placa_vehiculo, fecha_ingreso VALUES (?, ?, ?)";

     try{
    	 String dml1 = "INSERT INTO Ticket(codigo, placa_vehiculo, fecha_ingreso VALUES (?, ?, ?)";
     
//         PreparementStament ps = con.getStament();
//         ps.setQuery(dml);
//         ps.setParameter(1, ticket.getCodigo());
//         ps.setParameter(2, ticket.getVehiculo().getPlaca();
//         ps.setParameter(3, new Date());
//
//         ps.executeUpdate();
        return true;
     }catch(

	Exception e)
	{
//         System.out.println(e.printStrackTrace());
		System.out.println("HOa");
		return false;
	}

}

//private Ticket read(String ticket){
//     String dml = "SELECT * FROM Ticket WHERE  codigo = ticket";
//     try{
//          PreparementStament ps = con.getStament();
//         ps.setQuery(dml);
//         ps.executeQuery();
//         Ticket  ticket = new Ticket();
//
//        ticket.setcodigo( ps.getParameter(1));
//          ticket.setfechaingreso(ps.getParameter(2));
//          ticket.setfechasalida(ps.getParameter(3));
//        ticket.settiempo( ps.getParameter(4));
//          ticket.setvalor(ps.getParameter(5));
//          ticket.setvehiculo(ps.getParameter(6));
//         return ticket;
//     }catch(Exception e){
//         System.out.println(e.printStrackTrace());
//         ticket = null;
//         return ticket;
//     }

	public boolean update(Factura factura) {
		return true;
	}

	public Factura read(int codigo) {
		Factura factura = new Factura();
		return factura;
	}

	public boolean delete(int codigo) {

		return true;
	}
}
