package clases;

import java.time.LocalDate;

public class Persona {

	protected String nombre;
	protected LocalDate fechaNac;
	
	public Persona()
	{
		this.nombre="";
		this.fechaNac=LocalDate.now();
	}
	public Persona(String n, LocalDate f)
	{
		this.nombre=n;
		this.fechaNac=f;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
	}
	
	
}
