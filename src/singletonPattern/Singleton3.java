/*
 * �ھ�̬��ʼ������ֱ�Ӵ�������ʵ����Ҳ�ܱ�֤�̰߳�ȫ
 * 
 * �����������ʵ��������ô����Դ�ɲ������ַ���
 */
package singletonPattern;

public class Singleton3 {
	private static Singleton3 uniqueInstance = new Singleton3();
	
	private Singleton3() {};
	
	public static Singleton3 getInstance() {
		return uniqueInstance;
	}
}
