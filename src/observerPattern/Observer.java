/*
	�۲���ģʽ
	һ�����⣩�Զࣨ�۲��ߣ���������ı��ʱ�����еĹ۲��߽�����Ӧ�ķ�Ӧ
	
	����������Ϊ WeatherData��ʵ�� Subject �ӿ�
	�۲���Ϊ ���ֲ������ CurrentConditionsDisplay��ʵ�ֹ۲��ߵ� Observer �ӿںͲ����� DisplayElement �ӿ�
	
	java���������⣨Observable���͹۲��ߣ�Observer������java.util����
*/
package observerPattern;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
