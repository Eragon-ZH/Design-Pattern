/*
	���󹤳�ģʽ���ṩһ���ӿ����ڴ�����ػ���������ļ��壬������Ҫ��ȷָ��������
	
	PizzaINgredientFactory�������pizzaԭ�Ϲ����ӿڣ�������һ����ز�Ʒ�ļ���
	NYPizzaIngredientFactory�������pizza�����������������Ӧ��ԭ��
	NYPizzaStore������pizzaStoreʵ�����ǳ��󹤳���ʵ��
	Dough Sauce Cheese���ǲ�ͬ��ԭ��
	
	�о�д�Ĳ�̫��
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
