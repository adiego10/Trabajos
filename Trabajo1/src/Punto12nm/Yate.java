package Punto12nm;

public class Yate extends Deportivo{
	int camarotes;
	public Yate(){
		super();
		camarotes=0;
	}
	public int Modulo(){
		return (super.Modulo()+camarotes);
	}
	public String Tipo(){
		return "Yate ";
	}
	public int getCamarotes() {
		return camarotes;
	}
	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}
}
