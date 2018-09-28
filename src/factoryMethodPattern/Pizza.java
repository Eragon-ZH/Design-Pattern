/*
	��������ģʽ������������ô����Ķ�����ʲô
	
	�����ߣ�Creator���ࣺPizzaStore  �����࣬������һ������Ĺ���������������ʵ�ַ��������Ʒ
	��ͬ��PizzaStore������NYPizzaStore��ChicagoPizzaStoreʵ���˲�ͬ��creatPizza�������첻ͬ�Ĳ�Ʒ
	
	��ͬ��pizza�ǲ�ͬ�Ĳ�Ʒ�����̳���Pizza��
 */
package factoryMethodPattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Prepareing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for ( String i : toppings) {
			System.out.println(" " + i);
		}
	}
	
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
}
