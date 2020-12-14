package ec.ups.edu.parqueadero.parqueadero.dao;

//import java.sql.Date;
import ec.ups.edu.parqueadero.parqueadero.modelos.Ticket;

public class TicketDAO {

private boolean insert(Ticket ticket){
     String dml = "INSERT INTO Ticket(codigo, placa_vehiculo, fecha_ingreso VALUES (?, ?, ?)";

//     try{
//          PreparementStament ps = con.getStament();
//         ps.setQuery(dml);
//         ps.setParameter(1, ticket.getCodigo());
//         ps.setParameter(2, ticket.getVehiculo().getPlaca();
//         ps.setParameter(3, new Date());
//
//         ps.executeUpdate();
         return true;
//     }catch(Exception e){
//         System.out.println(e.printStrackTrace());
//         return false;
//     }

}

private Ticket read(String ticket){
     String dml = "SELECT * FROM Ticket WHERE  codigo = ticket";
//     try{
//          PreparementStament ps = con.getStament();
//         ps.setQuery(dml);
//         ps.executeQuery();
         Ticket  ticket1 = new Ticket();
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
         return ticket1;
//     }
}

	public boolean update(Ticket ticket) {
		return true;
	}

	public boolean delete(int codigo) {
		return true;
	}
}
