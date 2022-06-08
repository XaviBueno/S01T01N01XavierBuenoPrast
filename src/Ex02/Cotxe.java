package Ex02;

public class Cotxe {
	private static final String MARCA="Ford";
	private static String model;
	private final double potencia=100;
	
	public Cotxe(String model) {
		Cotxe.model=model;
	}
	
	public static void setModel(String model) {
		Cotxe.model=model;
	}
	
	public static  String getMarca() {
		return Cotxe.MARCA;
	}
	
	public static  String getModel() {
		return Cotxe.model;
	}
	
	public   double getPotencia() {
		return potencia;
	}
	
	
	public static String frenar() {
		
		return "El vehicle està frenant";
		
	}
	
	
	public  String accelerar() {
		
		return "El vehicle està accelerant";
		
	}
}
