package Punto11;
import java.util.Vector;
public class Medios {
	Vector<Publicacion> p;
	public Medios(){
		p=new Vector<Publicacion>();
	}
	public void agregar(Publicacion P){
		p.add(P);
	}
	public Publicacion mostrar(int i){
		return p.get(i);
		
	}
	public void m_Medios(){
		int j=0;
		for(Publicacion g: p){
			System.out.println("La publicacion N° " + j);
			System.out.println(g);
			j++;
		}
	}
}
