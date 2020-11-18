package ec.edu.ups.gestionparqueadero.ObjetosAccesoDatos;
//import java.sql.Date;
import ec.edu.ups.gestionparqueadero.Entidades.Vehiculo;

public class VehiculoDAO {
	
	public Vehiculo read(String placa){
	     String dml = "SELECT * FROM Vehiculo WHERE  placa = placa";
	     try{
	          PreparementStament ps = con.getStament();
	         ps.setQuery(dml);
	         ps.executeQuery();
	         Vehiculo  vehiculo = new Vehiculo();

	        vehiculo.setplaca( ps.getParameter(1));
	          vehiculo.setmarca(ps.getParameter(2));
	          vehiculo.setcolor(ps.getParameter(3));
	         return vehiculo;
	     }catch(Exception e){
	         System.out.println(e.printStrackTrace());
	         vehiculo = null;
	         return vehiculo;
	     }

	}

	public boolean insert (Vehiculo vehiculo) {
		return true;
		
	}
	public boolean update (Vehiculo vehiculo) {
		return true;
	}
	
	public Vehiculo read(String placa) {
		
		return ;
	}
	public boolean delete (String placa) {
		
		return true;
	}
}
