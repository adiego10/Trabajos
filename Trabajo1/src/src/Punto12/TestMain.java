package Punto12;

import Punto8.Console;

public class TestMain {

	public static void main(String[] args) {
	//	Puerto puerto= new Puerto();
	//	Amarre amar= new Amarre();
	//	Deportivo barc= new Deportivo();
	//	Fecha fec= new Fecha();
	//	
	//	fec.setAnio(1995);
	//	fec.setDia(1);
	//	fec.setMes(1);
	//	fec.setNum();
	//	amar.setInicio(fec);
	//	fec=new Fecha();
	//	fec.setAnio(1995);
	//	fec.setDia(13);
	//	fec.setMes(1);
	//	fec.setNum();
	//	amar.setFin(fec);
	//	amar.setDni("35979797");
	//	amar.setNombre("Nombre y Apellido");
	//	barc.setAniofabricacion(1990);
	//	barc.setEslora(150);
	//	barc.setMatricula("OQE-794");
	//	barc.setPotencia(175);
	//	amar.setBarco(barc);
	//	
	//	puerto.AgregarAmarre(amar);
	//	amar.VerAlquiler();
	//	puerto.Mostrar();
	//	
	//	//System.out.println(barc.Modulo());//fec2.num-fec.num);
		
		
		Puerto puerto= new Puerto();
		int opcion;
		do{
			System.out.println(" ");
			System.out.println("Ingrese una opcion:");
			System.out.println("1- Agregar Barco.");
			System.out.println("2- Quitar Amarre.");
			System.out.println("3- Mostrar Amarres.");
			System.out.println("4- Ver valor total de alquileres.");
			System.out.println("4- Ver datos de alquiler especifico.");
			System.out.println("0- Finalizar.");
			opcion= Console.readInt();
			switch (opcion){
				case 1:{
					int opc;
					do{
						System.out.println(" ");
						System.out.println("AGREGAR NUEVO BARCO: ");
						System.out.println("Ingrese una opcion:");
						System.out.println("1- Agregar Barco Deportivo.");
						System.out.println("2- Agregar Velero.");
						System.out.println("3- Agregar Yate.");
						System.out.println("0- Finalizar.");
						opc= Console.readInt();
						switch (opc){
							case 1:{
								System.out.println("NUEVO BARCO DEPORTIVO: ");
								Deportivo depor=new Deportivo();
								depor.setAniofabricacion(Console.readInt("Ingrese el año de Fabricacion: "));
								depor.setMatricula(Console.readString("Ingrese la matricula del Barco: "));
								depor.setEslora(Console.readInt("Ingrese la eslora del Barco: "));
								depor.setPotencia(Console.readInt("Ingrese la potencia del Barco: "));
								Amarre amarre= new Amarre();
								amarre.setBarco(depor);
								amarre.setNombre(Console.readString("Ingrese el Nombre del Propietario: "));
								amarre.setDni(Console.readString("Ingrese el DNI: "));
								do{
									Fecha fech=new Fecha();
									System.out.println("Fecha de Inicio del Alquiler: ");
									fech.setMes(Console.readInt("Mes: "));
									fech.setDia(Console.readInt("Dia: "));
									fech.setAnio(Console.readInt("Año: "));
									fech.setNum();
									amarre.setInicio(fech);
									fech=new Fecha();
									System.out.println("Fecha de Fin del Alquiler: ");
									fech.setMes(Console.readInt("Mes: "));
									fech.setDia(Console.readInt("Dia: "));
									fech.setAnio(Console.readInt("Año: "));
									fech.setNum();
									amarre.setFin(fech);
								}while (!(amarre.VerificarFechas()) || !(amarre.ComprobarFechas()));
								puerto.AgregarAmarre(amarre);
							}break;
							case 2:{
								System.out.println("NUEVO BARCO VELERO: ");
								Velero veler=new Velero();
								veler.setAniofabricacion(Console.readInt("Ingrese el año de Fabricacion: "));
								veler.setMatricula(Console.readString("Ingrese la matricula del Barco: "));
								veler.setEslora(Console.readInt("Ingrese la eslora del Velero: "));
								veler.setMastiles(Console.readInt("Ingrese la cantidad de mastiles del Velero: "));
								Amarre amarre= new Amarre();
								amarre.setBarco(veler);
								amarre.setNombre(Console.readString("Ingrese el Nombre del Propietario: "));
								amarre.setDni(Console.readString("Ingrese el DNI: "));
								do{
									Fecha fech=new Fecha();
									System.out.println("Fecha de Inicio del Alquiler: ");
									fech.setMes(Console.readInt("Mes: "));
									fech.setDia(Console.readInt("Dia: "));
									fech.setAnio(Console.readInt("Año: "));
									fech.setNum();
									amarre.setInicio(fech);
									fech=new Fecha();
									System.out.println("Fecha de Fin del Alquiler: ");
									fech.setMes(Console.readInt("Mes: "));
									fech.setDia(Console.readInt("Dia: "));
									fech.setAnio(Console.readInt("Año: "));
									fech.setNum();
									amarre.setFin(fech);
								}while (!(amarre.VerificarFechas()) || !(amarre.ComprobarFechas()));
								puerto.AgregarAmarre(amarre);
							}break;
							case 3:{
								System.out.println("NUEVO YATE: ");
								Yate yate=new Yate();
								yate.setAniofabricacion(Console.readInt("Ingrese el año de Fabricacion: "));
								yate.setMatricula(Console.readString("Ingrese la matricula del Barco: "));
								yate.setEslora(Console.readInt("Ingrese la eslora del Yate: "));
								yate.setPotencia(Console.readInt("Ingrese la potencia del Yate: "));
								yate.setCamarotes(Console.readInt("Ingrese la cantidad de camarotes del Yate: "));
								Amarre amarre= new Amarre();
								amarre.setBarco(yate);
								amarre.setNombre(Console.readString("Ingrese el Nombre del Propietario: "));
								amarre.setDni(Console.readString("Ingrese el DNI: "));
								do{
									Fecha fech=new Fecha();
									System.out.println("Fecha de Inicio del Alquiler: ");
									fech.setMes(Console.readInt("Mes: "));
									fech.setDia(Console.readInt("Dia: "));
									fech.setAnio(Console.readInt("Año: "));
									fech.setNum();
									amarre.setInicio(fech);
									fech=new Fecha();
									System.out.println("Fecha de Fin del Alquiler: ");
									fech.setMes(Console.readInt("Mes: "));
									fech.setDia(Console.readInt("Dia: "));
									fech.setAnio(Console.readInt("Año: "));
									fech.setNum();
									amarre.setFin(fech);
								}while (!(amarre.VerificarFechas()) || !(amarre.ComprobarFechas()));
								puerto.AgregarAmarre(amarre);
							}break;
						}
					}while(opc!=0);
				}break;
				case 2:{
					System.out.println("QUITAR BARCO/AMARRE: ");
					if(!puerto.Vacio()){
						puerto.QuitarAmarre(Console.readInt("Ingrese la posicion del amarre: "));
					}else{
						System.out.println("Puerto Vacio.");
					}
				}break;
				case 3:{
					System.out.println("AMARRES DEL PUERTO: ");
					puerto.Mostrar();
				}break;
				case 4:{
					System.out.println("El valor total de todos los amarres es de: "+puerto.ValorTotal()+".");
				}break;
				case 5:{
					System.out.println("DATOS DE ALQUILER: ");
					puerto.MostrarEspecifico(Console.readInt("Ingrese la Posicion: "));
				}
			}
		}while(opcion!=0);
	}
}
