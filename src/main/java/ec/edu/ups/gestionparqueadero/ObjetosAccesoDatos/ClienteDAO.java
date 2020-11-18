package ec.edu.ups.gestionparqueadero.ObjetosAccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

//import java.sql.Date;
import ec.edu.ups.gestionparqueadero.Entidades.Cliente;
import ec.edu.ups.gestionparqueadero.utils.Resources;

@Stateless
public class ClienteDAO {

	@Inject
	private Connection con;

	public boolean insert(Cliente entity) throws SQLException {
		String sql = "INSERT INTO Cliente(dni, email, nombre, tipoDoc)" + "VALUES(?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, entity.getDni());
		ps.setString(2, entity.getEmail());
		ps.setString(3, entity.getNombre());
		ps.setInt(4, entity.getTipoDocumento());
		return true;

	}

	public boolean update(Cliente cliente) {
		return true;
	}

	public Cliente read(int codigo) {
		String sql = "SELECT * FROM CLIENTES WHERE codigo = " + codigo;
		PreparedStatement ps = con.prepareStatement(sql);

		return;
	}

	public boolean delete(int codigo) {

		return true;
	}

}
