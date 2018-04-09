import java.io.IOException;
import java.io.PrintWriter;
/**
*/
public class Analizador{
	public static void main(String argv[]){
		String a = "C:\\Users\\jaime\\workspace\\practicaPL\\src\\correcto4.txt";
				AnalizadorLexico lexico = null;
				try {
					lexico = new AnalizadorLexico( new java.io.FileReader(a));
					parser sintactico = new parser(lexico);
					sintactico.parse();
				}
				catch (java.io.FileNotFoundException e) {
					System.out.println("Archivo \""+a+"\" no encontrado.");
				}
				catch (java.io.IOException e) {
					System.out.println("Error durante la lectura del"+" archivo \""+a+"\".");
					e.printStackTrace();
				}
				catch (Exception e) {
					System.out.println("Excepcion:");
					e.printStackTrace();
				}
			}
		}
