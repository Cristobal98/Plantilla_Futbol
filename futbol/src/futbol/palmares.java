package futbol;

public class palmares extends equipo {

	//ATRIBUTOS
	
	int ligasTotales;

	//CONSTRUCTOR
	
	public palmares(int id, String nombre, String apellidos, int edad, int ligasTotales) {
		super(id, nombre, apellidos, edad);
		this.ligasTotales = ligasTotales;
	}
	
	//GETTER SETTER
	
	public int getLigasTotales() {
		return ligasTotales;
	}
	
	public void setLigasTotales(int ligasTotales) {
		this.ligasTotales = ligasTotales;
	}

}
