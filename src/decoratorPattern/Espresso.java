package decoratorPattern;

public class Espresso extends Beverage {
	// Ũ��������
	
	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}

}
