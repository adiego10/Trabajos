package Punto10;

public class Programa {
	String titulo, director, duracion, inicio, emisor;
	int codigo, propaganda;
	
	public Programa(String titulo, String director, String duracion, String inicio, String emisor, int propaganda){
		this.titulo= titulo;this.director=director;this.duracion=duracion;
		this.inicio=inicio;this.emisor=emisor;this.propaganda=propaganda;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getEmisor() {
		return emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPropaganda() {
		return propaganda;
	}
	public void setPropaganda(int propaganda) {
		this.propaganda = propaganda;
	}
	
	public void Mostrar(){
		System.out.println("Titulo: "+ titulo+ ".");
		System.out.println("Emisor: "+ emisor+ ".");
		System.out.println("Codigo: "+ codigo+ ".");
		System.out.println("Inicio: "+ inicio+ ".");
		System.out.println("Duracion: "+ duracion+ ".");
		System.out.println("Director: "+ director+ ".");
		System.out.println("Propagandas: "+ propaganda+ ".");
	}
}
