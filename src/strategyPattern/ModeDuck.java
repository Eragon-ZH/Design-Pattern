package strategyPattern;

public class ModeDuck extends Duck {
	public ModeDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void display() {
		System.out.println("I'm a model duck.");
	}

}
