package Punto12nm;

public class Velero extends Barco{
	int mastiles;
	public Velero(){
		super();
		mastiles=0;
	}
	public int Modulo(){
		return (super.Modulo()+mastiles);
	}
	public String Tipo(){
		return "Velero ";
	}
	public int getMastiles() {
		return mastiles;
	}
	public void setMastiles(int mastiles) {
		this.mastiles = mastiles;
	}
}
