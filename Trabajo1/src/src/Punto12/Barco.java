package Punto12;

public class Barco {
	int eslora, aniofabricacion;
	String matricula;
	
	public Barco(){
		eslora=0;aniofabricacion=0;matricula="AAA-000";
	}
	public int Modulo(){
		return (eslora*10);
	}
	public String Tipo(){
		return "----- ";
	}
	public int getEslora() {
		return eslora;
	}
	public void setEslora(int eslora) {
		this.eslora = eslora;
	}
	public int getAniofabricacion() {
		return aniofabricacion;
	}
	public void setAniofabricacion(int aniofabricacion) {
		this.aniofabricacion = aniofabricacion;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
