package inventario.modelo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import inventario.controlador.*;

public class Conversiones {
	
	String texto;
	
	public Conversiones() {
		super();
	}
	
	private static final String FORMATO_FECHA = "dd-mm";
	
	public static String formatearFecha(Date fecha) {
		SimpleDateFormat formateador = new SimpleDateFormat(FORMATO_FECHA);
		return formateador.format(fecha);
		}
	
	public void guardar(String id, String Producto, String Cantidad, String nom_Proveedor, String Destino) {
		String directoryName = System.getProperty("user.dir");
		try {
			FileWriter fw = new FileWriter(directoryName+"/bd.csv", true);
			guardarArchivos a = new guardarArchivos();
			a.escribeFichero(fw, id  + "," + Producto + "," + Cantidad + "," + nom_Proveedor + "," + Destino);
		}catch(IOException e) {
			System.out.println("Error: "+ e);
		}
	}
}