package Ex01;

public class AppInstrument {
	
	/* Sortida cònsola
	  
	  	Init class Instrument  	(Initcialitza membres de classe)
	 	Init intance Instrument (Initcialitza membres de instància)
		Init intance Instrument (Initcialitza membres de instància)
		Init intance Instrument (Initcialitza membres de instància)
		Està sonant un instrument de vent
		Està sonant un instrument de corda
		Està sonant un instrument de percussió
	 */
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstrumentVent instrument1 =new InstrumentVent("Flauta",1000);
		InstrumentCorda instrument2 =new InstrumentCorda("Guitarra",1500);
		InstrumentPercussio instrument3 =new InstrumentPercussio("Tambor",850);
	
		System.out.println(
				instrument1.tocar()+'\n'+
				instrument2.tocar()+'\n'+
				instrument3.tocar());
	}

}