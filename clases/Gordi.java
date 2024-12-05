package clases;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gordi extends Persona{
	
	private String codG;
	private double altura;
	private ArrayList<ParejaDeMediciones> parejaDeMediciones = new ArrayList();
	
	public Gordi()
	{
		super();
		this.codG=generarCodigo();
		this.altura=0;
		this.parejaDeMediciones=new ArrayList<ParejaDeMediciones>();
		
	}
	public Gordi(String n, LocalDate f,double a,ArrayList<ParejaDeMediciones> p)
	{
		super(n,f);
		this.codG=generarCodigo();
		this.altura=a;
		this.parejaDeMediciones=p;
		
	}
	
	public String getCodG() {
		return codG;
	}
	public void setCodG(String codG) {
		this.codG = codG;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public ArrayList<ParejaDeMediciones> getParejaDeMediciones() {
		return parejaDeMediciones;
	}
	public void setParejaDeMediciones(ArrayList<ParejaDeMediciones> parejaDeMediciones) {
		this.parejaDeMediciones = parejaDeMediciones;
	}
	@Override
	public String toString() {
		return  super.toString()+"Gordi [codG=" + codG + ", altura=" + altura + ", parejaDeMediciones=" + parejaDeMediciones + "]";
	}
	
	
	private String generarCodigo() {
        String primerasLetras = nombre.substring(0, 2).toUpperCase();
        String ultimosDigitosAnio = String.valueOf(fechaNac.getYear());
        return primerasLetras + "-" + ultimosDigitosAnio;
    }

}
