package Punto11;

public class TestMain {

	public static void main(String[] args) {
		Medios medios= new Medios();
		
		Diario d1= new Diario(45,12,3,2015,"La Nacion","Mauro Gutierrez","Gerfacio Nuñez",32);
		Diario d2= new Diario(102,39,4,2015,"El Financiero","Martin Perez","Gabriel Nuas",45);
		Diario d3= new Diario(3,44,5,2015,"Opinion Austral","Mauricio Lopez","Geronimo Nerty",3);
		Diario d4= new Diario(80,32,6,2015,"Clarin","Marcelo Martinez","German Natiel",15);
		Diario d5= new Diario(33,15,7,2015,"Olé","Michel Gonzalez","Goreinasdaf Nuriel",8);
		d4.EntregaSemanal();
		d3.EntregaSemanal();
		d5.HabilitarRecarga();
		d1.HabilitarRecarga();
		
		medios.AgregarPublicacion(d1);
		medios.AgregarPublicacion(d2);
		medios.AgregarPublicacion(d3);
		medios.AgregarPublicacion(d4);
		medios.AgregarPublicacion(d5);
		
		Revista r1= new Revista(33,16,7,2015,"Caras","Mfefw Gvnmbvez","Rdgfads Oljbsadkgj",32);
		Revista r2= new Revista(34,17,6,2015,"Gente","Masdas Gogfez","Adsghae Yjbgaldkbj",84);
		Revista r3= new Revista(35,18,5,2015,"PB","Mheryer Gotyuiez","Gojfksa Tjkbga",999);
		Revista r4= new Revista(36,19,4,2015,"Billiken","Mcbnbcn Gonfafez","Hsfdawe Nuriel",15);
		
		medios.AgregarPublicacion(r1);
		medios.AgregarPublicacion(r2);
		medios.AgregarPublicacion(r3);
		medios.AgregarPublicacion(r4);
		
		medios.Mostrar();
		
		medios.QuitarPublicacion(7);
		
		medios.AgregarPublicacion(r2);
		
		medios.Mostrar();

	}

}
