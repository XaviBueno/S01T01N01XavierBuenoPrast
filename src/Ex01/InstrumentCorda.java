package Ex01;

public class InstrumentCorda extends Instrument {
	
	
	//Constructor
	public  InstrumentCorda(String nom, double preu){
		super(nom,preu);
		
		
	}
	
	//metode sobreescrit
	@Override
	public   String tocar(){
		return super.tocar()+ "corda";
	}
		
}
