
public class Funciones {

	String type;
	String nombre;
	String cabecera;
	Sentencia sent;
	
	
	public Funciones(String nombre, String cabecera, Sentencia sent) {
		this.type = "";
		this.nombre = nombre;
		this.cabecera = cabecera;
		this.sent = sent;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCabecera() {
		return cabecera;
	}
	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}
	public Sentencia getSent() {
		return sent;
	}
	public void setSent(Sentencia sent) {
		this.sent = sent;
	}

	@Override
	public String toString() {
		if(type == ""){
			return "PROCEDURE " + nombre + cabecera + sent.toString();
			
		}else{
			return "FUNCTION " + nombre + cabecera + ": " + type + sent.toString();
		}
	}
	
	
	
	
	
}
