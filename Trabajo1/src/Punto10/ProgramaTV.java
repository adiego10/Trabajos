package Punto10;

public class ProgramaTV extends Programa{
	int tandas;

	public ProgramaTV(String titulo,String director,String duracion,String inicio,String emisor,int propaganda,int tandas){
		super(titulo, director, duracion, inicio, emisor, propaganda);
		this.tandas=tandas;
	}
	
	public int getTandas() {
		return tandas;
	}
	public void setTandas(int tandas) {
		this.tandas = tandas;
	}
	public void Mostrar(){
		super.Mostrar();
		System.out.println("Tandas: "+ tandas+ ".");
	}
}
