package factoryMethodPattern;

public class ChicagoStyleChessePizza extends Pizza {
	
	public ChicagoStyleChessePizza() {
		name = "Chicago Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Suace";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
