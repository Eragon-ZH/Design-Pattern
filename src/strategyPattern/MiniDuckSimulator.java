package strategyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// mallard duck ��ɻ��		
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		// model duck ����ɻ��
		Duck model = new ModeDuck();
		model.performFly();
		model.performQuack();
		
		// ����model duck Ҳ�����		
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
