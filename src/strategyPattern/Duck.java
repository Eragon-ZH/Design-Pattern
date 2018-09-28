/*
	逻辑模式
	所有鸭子都继承自Duck类， 不同鸭子有不同的fly和quack的方式，不用继承而是设计不同的接口
	所有鸭子都performFly和performQuack，但是具体实现由自己定义
	
	有两个接口flyBehavior和quackBehavior
	FlyNoWay FlyRocketPowered FlyWithWings Quack等是接口的具体实现
	
	MallardDuck ModelDuck是具体的鸭子类 他们自己选择定义自己具有何种行为
 */

package strategyPattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
		
	}
	
	public abstract void display();
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
