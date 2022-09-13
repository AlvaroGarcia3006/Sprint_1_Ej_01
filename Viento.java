package nivel1;

public class Viento extends Instrumento{

	public Viento(String name, float price) {
		super(name, price);
	}

	@Override
	public String tocar() {
		
		String msg = "Está sonando un instrumento de viento.";
		return msg;
	}

}
