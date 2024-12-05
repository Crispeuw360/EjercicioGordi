package clases;

import java.time.LocalDate;

public class Pesador extends Persona {

	private LocalDate fechaAlta;
	
	public Pesador()
	{
		super();
		this.fechaAlta=LocalDate.now();
	}
	public Pesador(String n,LocalDate f,LocalDate f1)
	{
		super(n,f);
		this.fechaAlta=f1;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	@Override
	public String toString() {
		return super.toString()+ "Pesador [fechaAlta=" + fechaAlta + "]";
	}
	
	
}
