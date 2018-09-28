/*
	抽象工厂模式：提供一个接口用于创建相关或依赖对象的家族，而不需要明确指定具体类
	
	PizzaINgredientFactory：抽象的pizza原料工厂接口，定义了一个相关产品的家族
	NYPizzaIngredientFactory：具体的pizza工厂，负责生产相对应的原料
	NYPizzaStore：具体pizzaStore实例，是抽象工厂的实例
	Dough Sauce Cheese都是不同的原料
	
	感觉写的不太对
 */
package abstractFactoryPattern;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
//	Veggies veggies[];
//	Cheese cheese;
//	Pepperoni pepperoni;
//	Clams clam;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
