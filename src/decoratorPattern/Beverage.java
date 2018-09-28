/*
 	װ��ģʽ����̬�ظ�һ����������һЩ�����ְ��
 	������
	 	Component: ���󹹼�
		ConcreteComponent: ���幹��
		Decorator: ����װ����
		ConcreteDecorator: ����װ����
	
	����Ϊһ�����ȹݣ���Ʒ���Զ�̬��Ӹ��ֵ��ϲ�ʵʱ����۸�
	BeverageΪ���󹹼�
	DarkRoast HouseBlend Espresso������Ϊ���幹��
	CondimentDecoratorΪ����װ���࣬�����е��ϵĳ��࣬ͬʱҲ��Beverage������
	Mocha Soy Whip�ȵ���Ϊ����װ����
*/

package decoratorPattern;

public abstract class Beverage {
	// ������	
	String description = "Unknow Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
