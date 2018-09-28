package factoryMethodPattern;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// ����������ͬ�Ĺ���
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStroe = new ChicagoPizzaStore();
		
		// ÿ�������Լ��������첻ͬ�Ĳ�Ʒ
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStroe.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}

}
