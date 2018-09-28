package abstractFactoryPattern;

public class testPizzaStore {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		nyPizzaStore.orderPizza("cheese");
		
	}

}
