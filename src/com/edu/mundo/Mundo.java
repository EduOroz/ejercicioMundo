package com.edu.mundo;

import com.edu.personas.Empleado;
import com.edu.personas.Estudiante;
import com.edu.personas.Personas;
import com.edu.personas.Personas.estado_civil;

public class Mundo {

	private final int MAX_HABITANTES = 20;
	private final int MIN_HABITANTES = 5;
	private int habitantes = 0;
	private int personas = 0;
	private int empleados = 0;
	private int estudiantes = 0;
	private Personas[] elMundo;
	
	public Mundo() {
		super();
		this.habitantes = (int) Math.floor(Math.random()*(MAX_HABITANTES - MIN_HABITANTES +1) + MIN_HABITANTES);
		this.elMundo = new Personas[this.habitantes];
		int aux_random = 1;
		for (int i=0; i<elMundo.length; i++) {
			aux_random = (int) Math.floor(Math.random()*3 + 1);
			switch (aux_random) {
				case 1: this.personas++;
						elMundo[i] = new Personas("nombre"+personas, (30+personas), estado_civil.SOLTERO);
						break;
				case 2: this.empleados++;
						elMundo[i] = new Empleado("nombre"+empleados, (30+personas), estado_civil.SOLTERO, "Programador"+empleados, (300000 + empleados*1000));
						break;
				case 3: this.estudiantes++;
						elMundo[i] = new Estudiante("nombre"+estudiantes, (18+estudiantes), estado_civil.SOLTERO, "Informatica"+estudiantes, false);
						break;
			}
		}
	}
	
	
	public int getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public int getEmpleados() {
		return empleados;
	}

	public void setEmpleados(int empleados) {
		this.empleados = empleados;
	}

	public int getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(int estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Personas[] getElMundo() {
		return elMundo;
	}

	public void setElMundo(Personas[] elMundo) {
		this.elMundo = elMundo;
	}

	public int getMAX_HABITANTES() {
		return MAX_HABITANTES;
	}

	public int getMIN_HABITANTES() {
		return MIN_HABITANTES;
	}
	
	
}
