package com.edu.programa;

import com.edu.mundo.Mundo;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		System.out.println("Bienvenido al programa creador del Mundo");
		Mundo elMundo = new Mundo();
		
		System.out.println("El mundo está formado por:");
		System.out.println("Habitantes: " +elMundo.getHabitantes());
		System.out.println("");
		System.out.println("Entre los cuales tenemos:");
		System.out.println("	- Estudiantes: " +elMundo.getEstudiantes());
		System.out.println("	- Trabajadores: " +elMundo.getEmpleados());
		System.out.println("	- Resto de Personas: " +elMundo.getPersonas());
		System.out.println("");
		System.out.println("Sus datos registrados son:");
		for (int i=0; i<elMundo.getElMundo().length; i++) {
			System.out.println(elMundo.getElMundo()[i].toString());
		}
		
		
	}

}
