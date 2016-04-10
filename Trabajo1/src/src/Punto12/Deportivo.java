package Punto12;

public class Deportivo extends Barco{
	int potencia;
	public Deportivo(){
		super();
		potencia=0;
	}
	public int Modulo(){
		return (super.Modulo()+potencia);
	}
	public String Tipo(){
		return "Deportivo ";
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
}
