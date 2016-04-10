package Punto10_2;

public class Programa {
	
private String titulo, N_emisora;
private int codigo, duracion, h_inicio;
Persona Responsable;
public Persona getResponsable() {
	return Responsable;
}
public void setResponsable(Persona responsable) {
	Responsable = responsable;
}
public Programa() {
	super();
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getN_emisora() {
	return N_emisora;
}
public void setN_emisora(String n_emisora) {
	N_emisora = n_emisora;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}
public int getH_inicio() {
	return h_inicio;
}
public void setH_inicio(int h_inicio) {
	this.h_inicio = h_inicio;
}
}
