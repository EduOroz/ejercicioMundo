package com.edu.personas;

public class Estudiante extends Personas {

	private String estudios;
	private boolean estaBecado;
	
	public Estudiante(String nombre, int edad, estado_civil estado, String estudios, boolean estaBecado) {
		super(nombre, edad, estado);
		this.estudios = estudios;
		this.estaBecado = estaBecado;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public boolean isEstaBecado() {
		return estaBecado;
	}

	public void setEstaBecado(boolean estaBecado) {
		this.estaBecado = estaBecado;
	}

	@Override
	public String toString(){
		return "Estudiante{ nombre= " +getNombre() + ", edad= " +getEdad() +", estado= " +getEstado()
		+", estudios= " +getEstudios() +", becado= " +isEstaBecado()+"}" ;
	}
}
