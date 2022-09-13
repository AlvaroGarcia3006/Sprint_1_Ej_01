package nivel1;

public class Banda {

	public static void main(String[] args) {
		
		String msg;
		Viento viento1 = new Viento("flauta", 50);
		msg = viento1.tocar();
		System.out.println(msg);
		
		Cuerda cuerda1 = new Cuerda("Guitarra", 96);
		System.out.println(cuerda1.tocar());
		
		Percusion percusion1 = new Percusion("Batería", 690);
		System.out.println(percusion1.tocar());

	}

}
