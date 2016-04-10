package Punto11;

public class Diario extends Publicacion{
String tdp;
int r_interior,semana_p;
public Diario(){
	super();
}
public String getTdp() {
	return tdp;
}
public void setTdp(String tdp) {
	this.tdp = tdp;
}
public int getR_interior() {
	return r_interior;
}
public void setR_interior(int r_interior) {
	this.r_interior = r_interior;
}
public int getSemana_p() {
	return semana_p;
}
public void setSemana_p(int semana_p) {
	this.semana_p = semana_p;
}
@Override
public String toString() {
	return "----------------------------------"+
			"Diario "+ super.toString() +
			"/nTipo de publicacion=" + tdp + 
			"/nRecargo de interior=" + r_interior + 
			"/nSemana de publicacion=" + semana_p+
			"/n----------------------------------";
}


}
