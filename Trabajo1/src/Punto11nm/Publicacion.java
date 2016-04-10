package Punto11nm;

public class Publicacion {
	int codigo, paginas, precio, mesdp,aniodp;
	String titulo, responsable, editor;
	
	public Publicacion(int paginas, int precio, int mesdp, int aniodp, String titulo, String responsable, String editor){
		this.paginas=paginas;this.precio=precio;this.mesdp=mesdp;this.aniodp=aniodp;
		this.titulo=titulo;this.responsable=responsable;this.editor=editor;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getMesdp() {
		return mesdp;
	}
	public void setMesdp(int mesdp) {
		this.mesdp = mesdp;
	}
	public int getAniodp() {
		return aniodp;
	}
	public void setAniodp(int aniodp) {
		this.aniodp = aniodp;
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
	public boolean VerificarMes(int mes){
		return (mes>0 && mes<13);
	}
	public void Mostrar(){
		System.out.println("---------------------------------");
		Tipo();
		System.out.println("Titulo: "+ titulo+ ".");
		System.out.println("Responsable: "+ responsable+ ".");
		System.out.println("Editor: "+ editor+ ".");
		System.out.println("Paginas: "+ paginas+ ".");
		System.out.println("Mes de Publicacion: "+ mesdp+ ".");
		System.out.println("Año de Publicacion: "+ aniodp+ ".");
		System.out.println("Codigo: "+ codigo+ ".");
	}
	public void Tipo(){
		System.out.println("Tipo de Publicacion: -----." );
	}
}
