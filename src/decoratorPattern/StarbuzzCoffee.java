package decoratorPattern;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// 第一个顾客点了一杯 Espresso
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ "$" + beverage.cost());
		
		// 第二个顾客点了一个DarkRoast， 并加 mocha mocha whip，用不同的调料类装饰饮品
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription()
				+ "$" + beverage2.cost());
		
		// 同样用Soy Mocha Whip分别装饰 HouseBlend
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription()
				+ "$" + beverage3.cost());
	}

}
