package com.edu.personas;

public class Personas {

	private String nombre;
	private int edad;
	private estado_civil estado;
	public enum estado_civil {CASADO, SOLTERO, DIVORCIADO, VIUDO}
	
	public Personas(String nombre, int edad, estado_civil estado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public estado_civil getEstado() {
		return estado;
	}

	public void setEstado(estado_civil estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString(){
		return "Persona{ nombre= " +getNombre() + ", edad= " +getEdad() +", estado= " +getEstado() +"}" ;
	}
	
}
