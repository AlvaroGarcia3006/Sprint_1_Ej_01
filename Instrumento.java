package nivel1;

public abstract class Instrumento {
	
	protected String name;
	protected float price;
	
	public Instrumento(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	public abstract String tocar();

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(float price) {
		this.price = price;
	}	
	
}
