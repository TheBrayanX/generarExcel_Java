package inventario.controlador;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class guardarArchivos {
	public void escribeFichero(FileWriter fw, String texto) throws IOException{
        fw.write(texto+"\n");
        fw.flush();
        fw.close();
    }
	
	public void leeFichero(FileReader fr) throws IOException{

		int valor=fr.read();
        while(valor!=-1){
        	System.out.print((char)valor);
            valor=fr.read();
        }
        fr.close();
    }
}
