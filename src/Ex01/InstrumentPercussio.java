package Ex01;


public class InstrumentPercussio extends Instrument {
	//Constructor
	
	public  InstrumentPercussio(String nom, double preu){
		super(nom,preu);
	
	}
	
	//Metode
	public   String tocar(){
		return super.tocar()+ "percussió";
	}

}
