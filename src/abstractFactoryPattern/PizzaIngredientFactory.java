package abstractFactoryPattern;

public interface PizzaIngredientFactory {
	// �����ӿڣ����𴴽����е�ԭ��
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
//	public Veggies[] createVeggies();
//	public Pepperoni createPepperoni();
//	public Clams createClams();

}
