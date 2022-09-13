package nivel1;

public class Cuerda extends Instrumento {

	public Cuerda(String name, float price) {
		super(name, price);
	}

	@Override
	public String tocar() {
		String msg = "Está sonando un instrumento de cuerda.";
		return msg;
	}

}
