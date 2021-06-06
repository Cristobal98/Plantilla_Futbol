package futbol;

public class equipo {
		 
		//ATRIBUTOS
	
		int id;
		String Nombre;
		String Apellidos;
		int Edad;
		 
		//CONSTRUCTOR
		
		public equipo(int id, String nombre, String apellidos, int edad) {
			super();
			this.id = id;
			Nombre = nombre;
			Apellidos = apellidos;
			Edad = edad;
		}
		
		//GETTER SETTER
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
		}
		
		public String getNombre() {
			return Nombre;
		}
		
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		
		public String getApellidos() {
			return Apellidos;
		}
		
		public void setApellidos(String apellidos) {
			Apellidos = apellidos;
		}
		
		public int getEdad() {
			return Edad;
		}
		
		public void setEdad(int edad) {
			Edad = edad;
		}
		 
		 

}
