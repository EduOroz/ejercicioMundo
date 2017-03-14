package com.edu.personas;

public class Empleado extends Personas {

	private String oficio;
	private int sueldo;
	
	public Empleado(String nombre, int edad, estado_civil estado, String oficio, int sueldo) {
		super(nombre, edad, estado);
		this.oficio = oficio;
		this.sueldo = sueldo;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString(){
		return "Empleado{ nombre= " +getNombre() + ", edad= " +getEdad() +", estado= " +getEstado()
		+", oficio= " +getOficio() +", sueldo= " +getSueldo()+"}" ;
	}
}
