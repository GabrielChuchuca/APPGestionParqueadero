package ec.ups.edu.parqueadero.parqueadero.dao;
import ec.ups.edu.parqueadero.parqueadero.modelos.CierreDiaHora;
import java.util.List;
//import java.sql.Date;
import java.util.Date;
public class CierreDAO {
//	 List<CierrediaHora> cierredia(Date fecha){
//	     String dml = "SELECT * FROM CierreDiaHora WHERE  fecha = date";
//	     List<CierrediaHora> cierrelist = new List<Cierrediahora>(); 
//	try{
//	          PreparementStament ps = con.getStament();
//	         ps.setQuery(dml);
//	         ps.executeQuery();
//	       for(Cierredia cie: ps){
//	         CierreDIa  cierredia = new CierreDiaHora();
//
//	        cierredia.setfecha( cie.getParameter(1));
//	          cierredia.sethora(cie.getParameter(2));
//	          cierredia.settotal(cie.getParameter(3));
//	          cierredia.setnumerovehiculo(cie.getParameter(4));
//	         cierrelist.add(cierredia);
//	        }
//	         return cierrelist;
//	     }catch(Exception e){
//	         System.out.println(e.printStrackTrace());
//	         cierrelist = null;
//	         return cierrelist;
//	     }
//
//	}
	
	public boolean contabilizar(Date fecha) {
		return true;
	}
	

private boolean insert(CierreDiaHora cierre){
     String dml = "INSERT INTO Ticket(codigo, placa_vehiculo, fecha_ingreso VALUES (?, ?, ?)";

//     try{
//          PreparementStament ps = con.getStament();
//         ps.setQuery(dml);
//         ps.setParameter(1, ticket.getCodigo());
//         ps.setParameter(2, ticket.getVehiculo().getPlaca();
//         ps.setParameter(3, new Date());
//
//         ps.executeUpdate();
//         return true;
//     }catch(Exception e){
////         System.out.println(e.printStrackTrace());
         return false;
//     }

}

}
