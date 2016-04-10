package Punto10;

import java.util.Vector;

public class GestorPrograma {
	Vector <Programa> lista;
	int cont;
	
	public GestorPrograma(){
		lista= new Vector<Programa>();
		cont=0000;
	}
	public void AgregarPrograma(Programa programa){
		cont++;
		programa.setCodigo(cont);
		lista.addElement(programa);	
	}
	public void MostrarLista(){
		for(Programa p: lista){
			p.Mostrar();
		}
	}
	public void QuitarPrograma(int codigo){
		boolean done=false;int i=0;
		while(!done){
			if (((lista.elementAt(i)).getCodigo())== codigo){
				lista.remove(i);
				done=true;
			}
			i++;
		}
	}
	
}
