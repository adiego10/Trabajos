package Punto12nm;

public class Amarre {
	int valor, posicion;
	String nombre, dni;
	Fecha inicio, fin;
	Barco barco;
	
	public Amarre(){
		valor=2;posicion=0;barco= new Barco();nombre=" ";
		dni=" ";inicio=new Fecha();fin=new Fecha();
	}
	public int DiasAlquiler (){
		return ( fin.num - inicio.num + ((fin.anio -inicio.anio)*365) );
	}
	public boolean ComprobarAnio(){
		return (inicio.anio <= fin.anio);
	}
	public boolean ComprobarFechas(){
		return (fin.num > inicio.num && ComprobarAnio());
	}
	public boolean VerificarFechas(){
		return (inicio.VerificarFecha() && fin.VerificarFecha());
	}
	public int Valor(){
		return ( (DiasAlquiler()) * (barco.Modulo()) * valor);
	}
	public void VerAlquiler(){
		System.out.println("Nombre: "+nombre+". DNI: "+dni+".");
		System.out.println("Posicion: "+posicion+". Barco Nº: "+barco.getMatricula() +".");
		System.out.print("Inicio: ");inicio.Mostrar(); System.out.print(". Fin: ");fin.Mostrar() ;System.out.println(".");
		System.out.println("Valor: $"+Valor() +".");
	}
	
	public int getValor() {
		return valor;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Fecha getInicio() {
		return inicio;
	}
	public void setInicio(Fecha inicio) {
		this.inicio = inicio;
	}
	public Fecha getFin() {
		return fin;
	}
	public void setFin(Fecha fin) {
		this.fin = fin;
	}
	public Barco getBarco() {
		return barco;
	}
	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
}
