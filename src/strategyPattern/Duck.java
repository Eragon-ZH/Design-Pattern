/*
	�߼�ģʽ
	����Ѽ�Ӷ��̳���Duck�࣬ ��ͬѼ���в�ͬ��fly��quack�ķ�ʽ�����ü̳ж�����Ʋ�ͬ�Ľӿ�
	����Ѽ�Ӷ�performFly��performQuack�����Ǿ���ʵ�����Լ�����
	
	�������ӿ�flyBehavior��quackBehavior
	FlyNoWay FlyRocketPowered FlyWithWings Quack���ǽӿڵľ���ʵ��
	
	MallardDuck ModelDuck�Ǿ����Ѽ���� �����Լ�ѡ�����Լ����к�����Ϊ
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
