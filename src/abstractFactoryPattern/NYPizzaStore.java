package abstractFactoryPattern;

public class NYPizzaStore extends PizzaStore {

	protected Pizza creatPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = 
				new NYPizzaIngredientFactory();
		if ( item.equals("cheese") ) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		}
//		else if ( ) {
//			pizza = 
//		}
//		else if ( ) {
//			pizza = 
//		}
		return pizza;
	}
}
