package abstractFactoryPattern;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Prepareing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
//		cheese = ingredientFactory.createCheese();
	}

}
