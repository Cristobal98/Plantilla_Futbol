package futbol;

public class jugadores extends equipo {

	//ATRIBUTOS
	
	int dorsal;
	String posicion;
	
	//CONSTRUCTOR
	
	public jugadores(int id, String nombre, String apellidos, int edad, int dorsal, String posicion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}
	
	//GETTER SETTER
	
	public int getDorsal() {
		return dorsal;
	}
	
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}
