package Punto11;

public class Publicacion {
private int codigo,pagina,precio,a�o;
private String titulo,responsable,editor,mesp;
public Publicacion(){
	super();
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public int getPagina() {
	return pagina;
}
public void setPagina(int pagina) {
	this.pagina = pagina;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public int getA�o() {
	return a�o;
}
public void setA�o(int a�o) {
	this.a�o = a�o;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getResponsable() {
	return responsable;
}
public void setResponsable(String responsable) {
	this.responsable = responsable;
}
public String getEditor() {
	return editor;
}
public void setEditor(String editor) {
	this.editor = editor;
}
public String getMesp() {
	return mesp;
}
public void setMesp(String mesp) {
	this.mesp = mesp;
}
public String toString() {
	return "/nCodigo=" + codigo + 
			"/nTitulo=" +titulo+  
			"/nPagina=" + pagina + 
			"/nPrecio=" + precio + 
			"/nA�o=" + a�o +
			"/nResponsable=" + responsable + 
			"/nEditor=" + editor + 
			"/nMes de publicacion=" + mesp ;
}


}
