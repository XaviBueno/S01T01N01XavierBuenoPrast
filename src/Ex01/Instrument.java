package Ex01;
		

public  class Instrument {
	//Atributs
	private String nom;
	private double preu;
	private static double  descomptePreu; //variable Static per demostrar el bloc d'inicialització membres de clase
	
	//Inicialitza membres instancia
	{
		
		System.out.println("Init intance Instrument");
		preu=0;
		nom="";
	
	}
	
	//Inicialitza membres classe
	static{
		System.out.println("Init class Instrument");
		descomptePreu=10;
	}
	
	//Setters & getters
	
	public static void setDescompte(double descompte) {
		descomptePreu=descompte;
	}
		
	//Constructor
	
	public Instrument(String nom, double preu) {
		this.nom=nom;
		this.preu=preu;
		
	}
	//metode 
	public  String tocar() {
		return "Està sonant un instrument de ";
	};
	
	
	
}
