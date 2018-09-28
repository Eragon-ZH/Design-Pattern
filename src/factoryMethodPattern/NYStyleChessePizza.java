package factoryMethodPattern;

public class NYStyleChessePizza extends Pizza {
	
	public NYStyleChessePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Suace";
		
		toppings.add("Grated Reggiano Cheese");
	}
}
