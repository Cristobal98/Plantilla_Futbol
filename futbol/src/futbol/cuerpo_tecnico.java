package futbol;

public class cuerpo_tecnico extends equipo {

	//ATRIBUTOS
	
	String idtitulacion;
	int aniosExperiencia;
	
	//CONSTRUCTOR
	
	public cuerpo_tecnico(int id, String nombre, String apellidos, int edad, String idtitulacion,
			int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.idtitulacion = idtitulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	//GETTER SETTER
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	
	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
}
