package probandoBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		Connection connection;
		int id;
		String nombre,apellidos;

		try {
			String url = "jdbc:mysql://localhost:3306/examen_ud6_1?useSSL=false";
			String user = "root";
			String pass = "k3236";
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection success.");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from alumnos where nombre = 'marta' and apellidos = 'martin sanchez'");
			while(result.next()) {
				id = result.getInt("id");
				nombre = result.getString("nombre");
				apellidos = result.getString("apellidos");
				String nomCompleto = nombre.concat(" ").concat(apellidos);
				System.out.println("ID= "+id+", "+nomCompleto);
			}
			result.close();
			statement.close();
			connection.close();
			System.out.println("Connection closed.");
		} catch (SQLException ex) {
			connection = null;
			ex.printStackTrace();
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ex.getSQLState());
			System.out.println("VendorError : " + ex.getErrorCode());
		}
	}

}
