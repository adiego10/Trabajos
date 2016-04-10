package Punto10;

public class ProgramaRD extends Programa{
	String musicalizador;
	
	public ProgramaRD (String titulo,String director,String duracion,String inicio,String emisor,int propaganda,String musicalizador){
		super(titulo, director, duracion, inicio, emisor, propaganda);
		this.musicalizador=musicalizador;
	}

	public String getMusicalizador() {
		return musicalizador;
	}
	public void setMusicalizador(String musicalizador) {
		this.musicalizador = musicalizador;
	}
	public void Mostrar(){
		super.Mostrar();
		System.out.println("Musicalizador: "+ musicalizador+ ".");
	}
}
