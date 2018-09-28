/*
	工厂方法模式：让子类决定该创建的对象是什么
	
	创建者（Creator）类：PizzaStore  抽象类，定义了一个抽象的工厂方法，让子类实现方法创造产品
	不同的PizzaStore子类如NYPizzaStore和ChicagoPizzaStore实现了不同的creatPizza方法制造不同的产品
	
	不同的pizza是不同的产品，都继承自Pizza类
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
