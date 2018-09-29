/*
 * ����ģʽ��ֻ������һ��ʵ�� ���ṩһ��ȫ�ַ��ʵ�
 * 
 * ���캯�� Singleton() Ϊ˽�еģ�ʵ����ֻ��ͨ���෽�� Singleton.getInstance()
 * ����Ѿ���ʵ����ֱ�ӷ��ظ�ʵ��
 * 
 * ���߳̿��ܻ�������
 */
package singletonPattern;

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if ( uniqueInstance == null ) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
}
