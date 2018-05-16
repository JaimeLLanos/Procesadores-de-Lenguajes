import java.util.ArrayList;

public class Sentencia {

	ArrayList<Elementos> listaElementos = new ArrayList<Elementos>();

	public Sentencia(ArrayList<Elementos> listaElementos) {
		this.listaElementos = listaElementos;
	}

	public ArrayList<Elementos> getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(ArrayList<Elementos> listaElementos) {
		this.listaElementos = listaElementos;
	}

	@Override
	public String toString() {
		String aux = "";
		for(Elementos e : listaElementos){
			aux = aux + e.toString();
		}
		
		return aux;
	}
	
	
}
