import java.io.*;
import java.util.Scanner;
/**
*/
public class Analizador{
	public static void main(String argv[]){
		System.out.println("Escriba el nombre del fichero txt:");
		System.out.println("<<Asegúrese de que se encuentra en la misma ruta que el ejecutable)>>");
		Scanner sc = new Scanner(System.in);
		String textIn = sc.nextLine();
		String path = "";
		try {
			path = new File(".").getCanonicalPath() + "\\" + textIn;
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		AnalizadorLexico lexico = null;
		try {
			lexico = new AnalizadorLexico( new java.io.FileReader(path));
			parser sintactico = new parser(lexico);
			sintactico.parse();
		}
		catch (java.io.FileNotFoundException e) {
			System.out.println("Archivo \""+path+"\" no encontrado.");
		}
		catch (java.io.IOException e) {
			System.out.println("Error durante la lectura del"+" archivo \""+path+"\".");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Excepcion:");
			e.printStackTrace();
		}
	}
}
