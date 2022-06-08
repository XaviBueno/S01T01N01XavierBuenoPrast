package Ex01;

public class InstrumentVent extends Instrument{
	
	
	//Constructor
	public  InstrumentVent(String nom, double preu){
		super(nom,preu);
		
		
	
	
	}
	
	//Métode
	public  String tocar(){
		
		return super.tocar()+ "vent";
}

}
