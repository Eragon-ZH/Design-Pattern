/*
 	装饰模式：动态地给一个对象增加一些额外的职责
 	包含：
	 	Component: 抽象构件
		ConcreteComponent: 具体构件
		Decorator: 抽象装饰类
		ConcreteDecorator: 具体装饰类
	
	本例为一个咖啡馆，饮品可以动态添加各种调料并实时计算价格
	Beverage为抽象构件
	DarkRoast HouseBlend Espresso等饮料为具体构件
	CondimentDecorator为抽象装饰类，是所有调料的超类，同时也是Beverage的子类
	Mocha Soy Whip等调料为具体装饰类
*/

package decoratorPattern;

public abstract class Beverage {
	// 饮料类	
	String description = "Unknow Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
