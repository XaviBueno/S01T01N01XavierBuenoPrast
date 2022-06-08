package Ex02;

public class AppCotxe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Cotxe.getMarca()); //static final: Constant que pertany a la clase i no a un objecte 
		Cotxe.setModel("Focus"); //Static: Variable que pertany a la classe i no a un objecte
		System.out.println(Cotxe.getModel());
		Cotxe cotxe1=new Cotxe("Mondeo");// L'única variable que es pot posar al constructor és model, tot i que es una variable de tota la clase
		System.out.println(cotxe1.getPotencia()); //final: en aquest cas és una constant que pertany al objecte.
		System.out.println(Cotxe.frenar());
		System.out.println(cotxe1.accelerar());
	}

}
