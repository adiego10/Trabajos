package Punto12nm;

import java.util.Vector;

public class Puerto {
	Vector <Amarre> amarres;
	int posicion,capacidad;
	
	public Puerto(){
		amarres=new Vector <Amarre>();posicion=-1;capacidad=50;
	}
	public void AgregarAmarre(Amarre amarre){
		if (!Lleno()){
			posicion++;
			amarre.setPosicion(posicion);
			amarres.addElement(amarre);
		}else{
			System.out.println("Puerto lleno!, sin espacio para amarres.");
		}
	}
	public void QuitarAmarre(int posicion){
		if (!Vacio()){
			boolean done=false;int i=0;
			while(!done){
				if (((amarres.elementAt(i)).getPosicion())== posicion){
					System.out.println("Se elimino correctamente el amarre con el barco matricula: "+ amarres.elementAt(i).barco.matricula + ".");
					amarres.remove(i);
					done=true;
				}
				i++;
			}
		}else{
			System.out.println("Puerto Vacio.");
		}
		
	}
	public void Mostrar(){
		if (!Vacio()){
			for (Amarre a: amarres){
				System.out.println(a.posicion+" - $ "+a.Valor()+" -- "+a.nombre+"  -  Tipo: "+a.barco.Tipo()+a.barco.matricula+".");
			}
		}else{
			System.out.println("Puerto Vacio.");
		}
	}
	public void MostrarEspecifico(int i){
		amarres.elementAt(i).VerAlquiler();
	}
	public boolean Lleno(){
		return (!(posicion<capacidad));
	}
	public int ValorTotal(){
		int suma=0;
		for(Amarre a: amarres){
			suma=suma+ a.Valor();
		}
		return suma;
	}
	public boolean Vacio(){
		return (amarres.size() == 0);
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
}
