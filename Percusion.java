package nivel1;

public class Percusion extends Instrumento {

	public Percusion(String name, float price) {
		super(name, price);
	}

	@Override
	public String tocar() {
		String msg = "Está sonando un instrumento de percusión.";
		return msg;
	}

}
