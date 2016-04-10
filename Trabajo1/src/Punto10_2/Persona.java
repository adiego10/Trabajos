package Punto10_2;

public class Persona {
	private String Nombre, Apellido;
	private int Dni;
	public Persona(String nombre, String apellido, int dni) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	
}
