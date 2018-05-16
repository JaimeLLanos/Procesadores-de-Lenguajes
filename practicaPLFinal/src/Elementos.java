
public class Elementos {

	String atributos;
	boolean v_return;
	
	
	
	public Elementos(String atributos, boolean v_return) {
		this.atributos = atributos;
		this.v_return = v_return;
	}
	public String getAtributos() {
		return atributos;
	}
	public void setAtributos(String atributos) {
		this.atributos = atributos;
	}
	public boolean isV_return() {
		return v_return;
	}
	public void setV_return(boolean v_return) {
		this.v_return = v_return;
	}
	
	@Override
	public String toString() {
		return atributos;
	}
	
	
}
