import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Programa {

	String nombre;
	String constantes;
	String Variables;
	ArrayList<Funciones> listaFunciones = new ArrayList<Funciones>();
	
	
	
	public Programa(String constantes, ArrayList<Funciones> listaFunciones) {
		this.constantes = constantes;
		this.listaFunciones = listaFunciones;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getConstantes() {
		return constantes;
	}
	public void setConstantes(String constantes) {
		this.constantes = constantes;
	}
	public String getVariables() {
		return Variables;
	}
	public void setVariables(String variables) {
		Variables = variables;
	}
	public ArrayList<Funciones> getListaFunciones() {
		return listaFunciones;
	}
	public void setListaFunciones(ArrayList<Funciones> listaFunciones) {
		this.listaFunciones = listaFunciones;
	}
	
	public void imprime(){
		
		String aux = "";
		for(Funciones f : listaFunciones){
			aux = aux + f.toString();
		}
		
		PrintWriter input =null;
		try{
			File fich=new File("analizador.html");
			input = new PrintWriter(fich);
			input.println("PROGRAM " + "main" + "\n" + constantes + aux);
		
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	
}
