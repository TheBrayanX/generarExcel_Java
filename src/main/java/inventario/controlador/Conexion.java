//package inventario.controlador;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Conexion {
//	
//	private static final String controlador = "com.mysql.jdbc.Driver";
//	private static final String url = "jdbc:mysql://localhost:3306/inventario";
//	private static final String usuario  = "root";
//	private static final String pass = "";
//	Connection con;
//	
//	public Connection Conectar() {
//		Connection conexion = null;
//		
//		try {
//			Class.forName(controlador);
//			
//			conexion = DriverManager.getConnection(url, usuario, pass);
//			
//			System.out.println("Conectado a la BD...");
//			
//		} catch (ClassNotFoundException e) {
//			System.out.println("Error en el conector....");
//			e.printStackTrace();
//		} catch (SQLException e){
//			System.out.println("Error en la conexión....");
//			e.printStackTrace();
//		}
//		
//		return conexion;
//	}
//	
//	public Connection getConnection() {
//		return con;
//	}
//
//}