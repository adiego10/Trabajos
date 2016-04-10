package Punto10_2;
import java.util.Vector;
public class Empresa {
	Vector<Programa> E;

	public Empresa() {
		super();
		E = new Vector<Programa>() ;
	}
	public void agregar(Programa P){
		E.add(P);
	}
	public Programa mostrar(int i){
		return E.get(i);
		
	}
	public void M_empresa(){
		int j=0;
		for(Programa g: E){
			System.out.println("El programa N° " + j);
			System.out.println(g);
			j++;
		}
	}
	

}
