package abstractFactoryPattern;

public interface PizzaIngredientFactory {
	// 工厂接口，负责创建所有的原料
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
//	public Veggies[] createVeggies();
//	public Pepperoni createPepperoni();
//	public Clams createClams();

}
