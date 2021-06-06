package futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static ArrayList<equipo> cuerpoTecnico = new ArrayList<equipo>();
	public static ArrayList<equipo> plantillaJugadores = new ArrayList<equipo>();
	public static ArrayList<equipo> totalPalmares = new ArrayList<equipo>();
	
	public static void main(String[] args) {
		
		//ANADIR CUERPO TECNICO                   ID    NOMBRE     APELL   EDAD  TITULO  AÑOSEXP
		cuerpo_tecnico zidane = new cuerpo_tecnico(1, "Zinedine", "Zidane", 53, "45F4T5", 21);
		cuerpo_tecnico bettoni = new cuerpo_tecnico(2, "David", "Bettoni", 49, "93K5R1", 2);
		cuerpo_tecnico roberto = new cuerpo_tecnico(3, "Roberto", "Vazquez", 46, "62V4W6", 3);
		cuerpo_tecnico javier = new cuerpo_tecnico(4, "Javier", "Mallo", 44, "93K5R1", 11);
		cuerpo_tecnico pintus = new cuerpo_tecnico(5, "Antonio", "Pintus", 58, "31G4Q3", 8);
		
		//ANADIR JUGADORES               ID   NOMBRE    APELL EDAD DORSAL  POSICION
		jugadores courtois = new jugadores(1, "Thibaut", "Courtois", 29, 1, "Portero");
		jugadores ramos = new jugadores(2, "Sergio", "Ramos", 35, 4, "Defensa Central");
		jugadores varanne = new jugadores(3, "Raphael", "Varanne", 28, 5, "Defensa Central");
		jugadores carvajal = new jugadores(4, "Daniel", "Carvajal", 29, 2, "Lateral Derecho");
		jugadores mendy = new jugadores(5, "Ferland", "Mendy", 25, 23, "Lateral Izquierdo");
		jugadores casemiro = new jugadores(6, "Carlos Enrique", "Casemiro", 29, 14, "Pivote");
		jugadores kroos = new jugadores(7, "Toni", "Kroos", 31, 8, "Mediocentro");
		jugadores modric = new jugadores(8, "Luka", "Modric", 35, 10, "Mediocentro");
		jugadores vinicius = new jugadores(9, "Vinicius", "JR", 20, 20, "Extremo Izquierdo");
		jugadores rodrygo = new jugadores(10, "Rodygo", "Goes", 20, 25, "Extremo Derecho");
		jugadores benzema = new jugadores(11, "Karim", "Benzema", 33, 9, "Delantero");
		
		
		//AÑADIR PALMARES                 ID  NOMBRE   APELL   AÑOS LIGASGANADAS
		palmares realMadrid = new palmares(1, "Real", "Madrid", 119, 34);

		//AÑADIMOS AL ARRAYLIST
		
		cuerpoTecnico.add(zidane);
		cuerpoTecnico.add(bettoni);
		cuerpoTecnico.add(roberto);
		cuerpoTecnico.add(javier);
		cuerpoTecnico.add(pintus);
		
		plantillaJugadores.add(courtois);
		plantillaJugadores.add(ramos);
		plantillaJugadores.add(varanne);
		plantillaJugadores.add(carvajal);
		plantillaJugadores.add(mendy);
		plantillaJugadores.add(casemiro);
		plantillaJugadores.add(kroos);
		plantillaJugadores.add(modric);
		plantillaJugadores.add(vinicius);
		plantillaJugadores.add(rodrygo);
		plantillaJugadores.add(benzema);
		
		totalPalmares.add(realMadrid);
		
		int salir = 1;
		//MENU
		Scanner sc = new Scanner(System.in);
		while (salir == 1) {
			System.out.println("ELIGE UNA OPCION DE LAS DISPONIBLES");
			System.out.println("1. Informacion Equipo");
			System.out.println("2. Listado Jugadores");
			System.out.println("3. Listado Cuerpo Tecnico");
			System.out.println("4. Total palmares");
			System.out.println("5. Simular liga");
			System.out.println("6. Editar Plantilla");
			System.out.println("7. Exit");
			
			int opcion = sc.nextInt();
			
			try {
				
				if (opcion != 1 || opcion != 2 || opcion != 3 || opcion != 4 || opcion != 5 || opcion != 6 || opcion != 7) {
					
					throw new excepciones(1);
					
				}
				
			}  catch (excepciones ex) {
				
	            System.out.println(ex.getMessage());
	            
	        }
			
				
			switch (opcion) {
				case 1: 
					System.out.println("Informacion Equipo");
					System.out.println("__________________");
					System.out.println("Nombre del equipo: " + totalPalmares.get(0).getNombre() + totalPalmares.get(0).getApellidos() + "\n");
					System.out.println("Total jugadores: " + plantillaJugadores.size() + "\n");
					System.out.println("Total integrantes Cuerpo Tecnico: " + cuerpoTecnico.size() + "\n");
					System.out.println("Total ligas: " + realMadrid.getLigasTotales() + "\n");
					System.out.println("__________________");
					break;
				case 2: 
					System.out.println("Listado Jugadores \n");
					for (int i=0; i<plantillaJugadores.size(); i++) {
						System.out.println(plantillaJugadores.get(i).getNombre() + " " + plantillaJugadores.get(i).getApellidos() + " , " + plantillaJugadores.get(i).getEdad() + " Años , ID = " + plantillaJugadores.get(i).getId());
					}
					System.out.println(".....................................");
					break;
				case 3: 
					System.out.println("Listado Cuerpo Tecnico \n");
					for (int i=0; i<cuerpoTecnico.size(); i++) {
						System.out.println(cuerpoTecnico.get(i).getNombre() + " " + cuerpoTecnico.get(i).getApellidos() + " , " + cuerpoTecnico.get(i).getEdad() + " Años , ID = " + cuerpoTecnico.get(i).getId());
					}
					System.out.println(".....................................");
					break;
				case 4: 
					System.out.println("Informacion Palmares \n");
					System.out.println("El equipo ha conseguido un total de " + realMadrid.getLigasTotales() + " ligas.\n");
					break;
				case 5: 
					int jornada = 1;
					String resultado = "";
					int victorias = 0;
					int empates = 0;
					int derrotas = 0;
					int num = 0;
					while (jornada <= 38) {
						num = (int)(Math.random()*3 + 1);
						if (num == 1) {
							victorias = victorias + 1;
							resultado = "Victoria";
						} else if (num == 2) {
							empates = empates + 1;
							resultado = "Empate";
						} else if (num == 3) {
							derrotas = derrotas + 1;
							resultado = "Derrota";
						} 
						System.out.println("Jornada " + jornada + " :" + resultado + "!");
						jornada++;
					}
					System.out.println("");
					System.out.println("El resultado de la Liga ha sido: " + "Victorias("+ victorias + ")" + " Empates("+ empates + ")" + " Derrotas("+ derrotas + ")");
					System.out.println("");
					
					if (victorias > 15 && empates > 8) {
						int ligas = realMadrid.getLigasTotales() + 1;
						realMadrid.setLigasTotales(ligas);
						System.out.println("");
						System.out.println("ENHORABUENA!! HAS GANADO LA LIGA DE ESPAÑA!!");
						System.out.println("");
					} else if (derrotas > 20) {
						System.out.println("");
						System.out.println("Los malos resultados han hecho descender el equipo a Segunda Division.");
						System.out.println("");
					} else if (victorias >= 10 || empates >= 10 || derrotas < 20) {
						System.out.println("");
						System.out.println("Hay que mejorar de cara a la proxima temporada!");
						System.out.println("");
					}
					System.out.println(".....................................");
					break;
				case 6: 
					//SUBMENU
					int salir2 = 1;
					while (salir2 == 1) {
						System.out.println("ELIGE UNA OPCION DE LAS DISPONIBLES");
						System.out.println("1. Añadir Jugador");
						System.out.println("2. Eliminar Jugador");
						System.out.println("3. Añadir Cuerpo Técnico");
						System.out.println("4. Eliminar Cuerpo Técnico");
						System.out.println("5. Volver");
						
						int opcion2 = sc.nextInt();
							
						switch (opcion2) {
							case 1:
								System.out.println("Dame el ID nuevo");
								int id = sc.nextInt();
								System.out.println("Nombre del jugador nuevo");
								sc.nextLine();
								String nombre = sc.nextLine();
								System.out.println("Apellidos del jugador nuevo");
								String apellidos = sc.nextLine();
								System.out.println("Dame la edad del jugador");
								int edad = sc.nextInt();
								System.out.println("Dame el dorsal nuevo");
								int dorsal = sc.nextInt();
								System.out.println("Nombre de la posicion del jugador");
								sc.nextLine();
								String posicion = sc.nextLine();
								plantillaJugadores.add(new jugadores(id, nombre, apellidos, edad, dorsal, posicion));
								break;
							case 2: 
								System.out.println("Dame el ID a eliminar");
								int idElimiar = sc.nextInt();
								for (int i=0; i<plantillaJugadores.size(); i++) {
									if (plantillaJugadores.get(i).getId() == idElimiar) {
										plantillaJugadores.remove(i);
									}
								}
								break;
							case 3: 
								System.out.println("Dame el ID nuevo");
								int id2 = sc.nextInt();
								System.out.println("Nombre del personal nuevo");
								sc.nextLine();
								String nombre2 = sc.nextLine();
								System.out.println("Apellidos del personal nuevo");
								String apellidos2 = sc.nextLine();
								System.out.println("Dame la edad del personal");
								int edad2 = sc.nextInt();
								System.out.println("ID Titulacion del personal");
								sc.nextLine();
								String titulacion = sc.nextLine();
								System.out.println("Años de experiencia del personal");
								int experiencia = sc.nextInt();
								cuerpoTecnico.add(new cuerpo_tecnico(id2, nombre2, apellidos2, edad2, titulacion, experiencia));
								break;
							case 4: 
								System.out.println("Dame el ID a eliminar");
								int idElimiar2 = sc.nextInt();
								for (int i=0; i<cuerpoTecnico.size(); i++) {
									if (cuerpoTecnico.get(i).getId() == idElimiar2) {
										cuerpoTecnico.remove(i);
									}
								}
								break;
							case 5:
								salir2 = 0;
								break;
						}
					}
					break;
				case 7:
					salir = 0;
					break;
			}
		}
		//CERRAR EL SCANNER
		sc.close();
	}

}
