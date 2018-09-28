package factoryMethodPattern;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// 创建两个不同的工厂
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStroe = new ChicagoPizzaStore();
		
		// 每个工厂自己决定制造不同的产品
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStroe.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}

}
