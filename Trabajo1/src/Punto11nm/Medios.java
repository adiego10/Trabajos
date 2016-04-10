package Punto11nm;

import java.util.Vector;

public class Medios {
	Vector <Publicacion> gestor;
	int cont;
	
	public Medios(){
		gestor=new Vector <Publicacion>();
		cont=000;
	}
	public void AgregarPublicacion(Publicacion publicacion){
		cont++;
		publicacion.setCodigo(cont);
		gestor.addElement(publicacion);
	}
	public void QuitarPublicacion(int codigo){
		boolean done=false;int i=0;
		while(!done){
			if (((gestor.elementAt(i)).getCodigo())== codigo){
				System.out.println("Se elimino correctamente: "+ gestor.elementAt(i).getTitulo()+ ".");
				gestor.remove(i);
				done=true;
			}
			i++;
		}
	}
	public void Mostrar(){
		for (Publicacion p: gestor){
			p.Mostrar();
		}
	}
	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		this.cont = cont;
	}
}
