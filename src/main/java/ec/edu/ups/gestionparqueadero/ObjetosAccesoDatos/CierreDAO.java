package ec.edu.ups.gestionparqueadero.ObjetosAccesoDatos;

import java.util.List;
//import java.sql.Date;
import java.util.Date;
import ec.edu.ups.gestionparqueadero.Entidades.CierreDiaHora;
public class CierreDAO {
	 List<CierrediaHora> cierredia(Date fecha){
	     String dml = "SELECT * FROM CierreDiaHora WHERE  fecha = date";
	     List<CierrediaHora> cierrelist = new List<Cierrediahora>(); 
	try{
	          PreparementStament ps = con.getStament();
	         ps.setQuery(dml);
	         ps.executeQuery();
	       for(Cierredia cie: ps){
	         CierreDIa  cierredia = new CierreDiaHora();

	        cierredia.setfecha( cie.getParameter(1));
	          cierredia.sethora(cie.getParameter(2));
	          cierredia.settotal(cie.getParameter(3));
	          cierredia.setnumerovehiculo(cie.getParameter(4));
	         cierrelist.add(cierredia);
	        }
	         return cierrelist;
	     }catch(Exception e){
	         System.out.println(e.printStrackTrace());
	         cierrelist = null;
	         return cierrelist;
	     }

	}
	
	public boolean contabilizar(Date fecha) {
		return true;
	}
}
