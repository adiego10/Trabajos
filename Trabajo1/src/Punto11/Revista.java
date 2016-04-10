package Punto11;

public class Revista extends Publicacion{
private int num;
private String tdt;
public Revista(){
	super();
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getTdt() {
	return tdt;
}
public void setTdt(String tdt) {
	this.tdt = tdt;
}
@Override
public String toString() {
	return "----------------------------------"+
			"Revista" +super.toString()+ 
			"/nNumero de revista=" + num + 
			"/nTitulo de tapa=" + tdt + "]"+
			"/n----------------------------------";
}

}
