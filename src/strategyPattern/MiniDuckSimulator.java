package strategyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// mallard duck 会飞会叫		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		// model duck 不会飞会叫
		Duck model = new ModeDuck();
		model.performFly();
		model.performQuack();
		
		// 现在model duck 也会飞了		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
