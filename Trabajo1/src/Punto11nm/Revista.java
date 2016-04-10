package Punto11nm;

public class Revista extends Publicacion{
	int numero;
	
	public Revista(int paginas, int precio, int mesdp, int aniodp, String titulo, String responsable, String editor,int numero){
		super(paginas,precio,mesdp,aniodp,titulo,responsable,editor);
		this.numero=numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void Mostrar(){
		super.Mostrar();
		System.out.println("Numero: "+ numero+ ".");
	}
	public void Tipo(){
		System.out.println("Tipo de Publicacion: Revista." );
	}
}
