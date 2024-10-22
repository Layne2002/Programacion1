// Autor: Karim Zinnatullin
package zinnatullinKarim1137;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Aplicacion {

	public static void main(String[] args) {
		Connection connection;
		Scanner input = new Scanner(System.in);

		try {
			// hace falta cambiar esto para cada usuario
			String url = "jdbc:mysql://localhost:3306/cine1137?useSSL=false";
			String user = "root";
			String pass = "k3236";
			connection = DriverManager.getConnection(url, user, pass);
			int opcion;

			do {
				System.out.println("MENU");
				System.out.println("1.- Mostrar peliculas");
				System.out.println("2.- Borrar plataformas");
				System.out.println("3.- Modificar plataforma");
				System.out.println("4.- Mostrar peliculas por plataformas");
				System.out.println("0.- Salir");
				opcion = input.nextInt();
				input.nextLine();
				switch (opcion) {
				case 1: {
					mostrarPeliculas(connection);
					break;
				}
				case 2: {

					borrarPlataforma(connection, input);
					break;
				}
				case 3: {
					modificarPlataforma(connection, input);
					break;
				}
				case 4: {
					mostrarPeliculasPorPlataformas(connection);
					break;
				}
				default: {
					System.out.println("Elige una opción válida!");
					break;
				}
				}
				System.out.println("Dale a Enter para continuar");
				input.nextLine();
			} while (opcion != 0);
			connection.close();
		} catch (SQLException ex) {
			connection = null;
			ex.printStackTrace();
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ex.getSQLState());
			System.out.println("VendorError : " + ex.getErrorCode());
		}
		input.close();
	}

	private static void mostrarPeliculas(Connection connection) {
		int id;
		String titulo, sinopsis, fecha;
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from peliculas");
			System.out.println("\n----------------Listado de Películas-----------------");
			System.out.println("| código - Título - Sinopsis - Fecha de estreno |");
			System.out.println("-------------------------------------------------------");
			while (result.next()) {
				id = result.getInt("codigo");
				titulo = result.getString("nombre");
				sinopsis = result.getString("sinopsis");
				fecha = result.getString("fecha_estreno");
				System.out.println(id + " - " + titulo + " - " + sinopsis + " - " + fecha);
			}
			System.out.println();
			result.close();
			statement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ex.getSQLState());
			System.out.println("VendorError : " + ex.getErrorCode());
		}

	}

	private static void borrarPlataforma(Connection connection, Scanner input) {
		int id;
		String nombre;
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from plataformas");
			System.out.println("\n----------------Listado de Plataformas-----------------");
			System.out.println("| Código - Nombre 									   |");
			System.out.println("-------------------------------------------------------");
			while (result.next()) {
				id = result.getInt("codigo");
				nombre = result.getString("nombre");
				System.out.println(id + " - " + nombre);
			}
			System.out.println();

			System.out.println("Introduce el código de la plataforma que quieres borrar:");
			int cod = input.nextInt();

			String sqlBorrarDisponible = "DELETE FROM Disponible_en WHERE codPlataforma = ?";
			PreparedStatement pStatementBorrarDisponible = connection.prepareStatement(sqlBorrarDisponible);
			pStatementBorrarDisponible.setInt(1, cod);
			pStatementBorrarDisponible.executeUpdate();
			String sqlBorrarPlataformas = "DELETE FROM Plataformas WHERE codigo = ?";
			PreparedStatement pStatementBorrarPlataformas = connection.prepareStatement(sqlBorrarPlataformas);
			pStatementBorrarPlataformas.setInt(1, cod);
			int rowsAffected = pStatementBorrarPlataformas.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Borrado de plataforma correcto.");
			} else {
				System.out.println("La plataforma con código " + cod + " no existe.");
			}
			result.close();
			statement.close();
			pStatementBorrarDisponible.close();
			pStatementBorrarPlataformas.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ex.getSQLState());
			System.out.println("VendorError : " + ex.getErrorCode());
		}

	}

	private static void modificarPlataforma(Connection connection, Scanner input) {
		int id;
		String nombre;
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select * from plataformas");
			System.out.println("\n----------------Listado de Plataformas-----------------");
			System.out.println("| Código - Nombre 									   |");
			System.out.println("-------------------------------------------------------");
			while (result.next()) {
				id = result.getInt("codigo");
				nombre = result.getString("nombre");
				System.out.println(id + " - " + nombre);
			}
			System.out.println();

			System.out.println("Introduce el código de la plataforma que quieres modificar:");
			int cod = input.nextInt();
			input.nextLine();
			System.out.println("Introduce el nuevo nombre de la plataforma:");
			String newNombre = input.nextLine();
			String sqlNewNombrePlataforma = "update Plataformas set nombre = '" + newNombre + "' where codigo = " + cod;
			PreparedStatement pStatementModificarPlataformas = connection.prepareStatement(sqlNewNombrePlataforma);
			int rowsAffected = pStatementModificarPlataformas.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Actualización de plataforma correcto.");
			} else {
				System.out.println("La plataforma con código " + cod + " no existe.");
			}
			result.close();
			statement.close();
			pStatementModificarPlataformas.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ex.getSQLState());
			System.out.println("VendorError : " + ex.getErrorCode());
		}

	}

	private static void mostrarPeliculasPorPlataformas(Connection connection) {
		int idPlataforma, idPelicula;
		String nombre;
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select nombre,codigo from Plataformas");
			System.out.println("\n-------------------------------------------------------");
			System.out.println("| PELICULAS POR PLATAFORMAS                            |");
			System.out.println("-------------------------------------------------------");

			String sqlDisponibleEn = "SELECT codPelicula FROM Disponible_en WHERE codPlataforma = ?";
			PreparedStatement pstDisponibleEn = connection.prepareStatement(sqlDisponibleEn);

			String sqlPelicula = "SELECT nombre FROM peliculas WHERE codigo = ?";
			PreparedStatement pstPelicula = connection.prepareStatement(sqlPelicula);

			while (result.next()) {
				nombre = result.getString("nombre");
				idPlataforma = result.getInt("codigo");
				System.out.println("Plataforma: " + nombre);
				pstDisponibleEn.setInt(1, idPlataforma);
				ResultSet result2 = pstDisponibleEn.executeQuery();

				while (result2.next()) {
					idPelicula = result2.getInt("codPelicula");

					pstPelicula.setInt(1, idPelicula);
					ResultSet result3 = pstPelicula.executeQuery();
					if (result3.next()) {
						String nombrePelicula = result3.getString("nombre");
						System.out.println(nombrePelicula);
					}
					result3.close();
				}
				System.out.println("-----------------------------------------------------------------");
				result2.close();
			}
			System.out.println();
			result.close();
			statement.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState : " + ex.getSQLState());
			System.out.println("VendorError : " + ex.getErrorCode());
		}

	}
}
