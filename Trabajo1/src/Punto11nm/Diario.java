package Punto11nm;

public class Diario extends Publicacion{
	boolean recarga,entregas;
	int semana;
	
	public Diario(int paginas, int precio, int mesdp, int aniodp, String titulo, String responsable, String editor,int semana){
		super(paginas,precio,mesdp,aniodp,titulo,responsable,editor);
		this.semana=semana;recarga=false;
	}
	public void HabilitarRecarga(){
		this.recarga=true;
	}
	public void EntregaSemanal(){
		this.entregas=true;
	}
	public boolean VerificarSemana(int semana){
		return (semana>0 && semana<53);
	}
	public void Mostrar(){
		super.Mostrar();
		String si="no";String sq="quincenal";
		if (recarga){
			si="si";
		}
		if (entregas){
			sq="semanal";
		}
		System.out.println("Recarga: "+ si+ ".");
		System.out.println("Precio: "+ precio+ ".");
		System.out.println("Entrega: "+ sq+ ".");
		System.out.println("------------------------------");
	}
	public void Tipo(){
		System.out.println("Tipo de Publicacion: Diario." );
	}
	
	public int getSemana() {
		return semana;
	}
	public void setSemana(int semana) {
		this.semana = semana;
	}
}
