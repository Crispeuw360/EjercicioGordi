package clases;

import java.time.LocalDate;

public class ParejaDeMediciones {

	private LocalDate fecha;
	private double peso;
	
	
	public ParejaDeMediciones()
	{
		this.fecha=LocalDate.now();
		this.peso=0;
	}
	public ParejaDeMediciones(LocalDate f, double p)
	{
		this.fecha=f;
		this.peso=p;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "ParejaDeMediciones [fecha=" + fecha + ", peso=" + peso + "]";
	}
	
	
}
