package decoratorPattern;

public class Espresso extends Beverage {
	// Å¨Ëõ¿§·ÈÀà
	
	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}

}
