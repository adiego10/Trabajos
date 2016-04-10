package Punto10_2;

public class P_Radio extends Programa{
Persona Musicalizacion;
private int Comerciales;
public P_Radio(Persona musicalizacion, int comerciales) {
	super();
	Musicalizacion = musicalizacion;
	Comerciales = comerciales;
}
public Persona getMusicalizacion() {
	return Musicalizacion;
}
public void setMusicalizacion(Persona musicalizacion) {
	Musicalizacion = musicalizacion;
}
public int getComerciales() {
	return Comerciales;
}
public void setComerciales(int comerciales) {
	Comerciales = comerciales;
}
public String toString(){
	return "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>"+
			"Es una radio" + "/nMusicalizacion: "+ getMusicalizacion() + 
			getCodigo() + getResponsable() +
			getDuracion() + getH_inicio() + getDuracion()+
			 "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>";
}
}

