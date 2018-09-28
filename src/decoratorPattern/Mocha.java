package decoratorPattern;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		// ��ס��װ�εĶ���
		this.beverage = beverage;
	}
	
	public String getDescription() {
		// ������չ����
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		// ������չ����
		return .20 + beverage.cost();
	}

}
