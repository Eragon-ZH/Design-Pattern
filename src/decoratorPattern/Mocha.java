package decoratorPattern;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		// 记住被装饰的对象
		this.beverage = beverage;
	}
	
	public String getDescription() {
		// 额外扩展功能
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		// 额外扩展功能
		return .20 + beverage.cost();
	}

}
