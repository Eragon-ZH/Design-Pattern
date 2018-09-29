/*
 * ���� synchronized �ؼ��ֽ�����ͬ����������֤û�������߳�ͬʱ�����������
 * 
 * ����ʵ��ֻ�е�һ��new��ʱ�����Ҫͬ�����������ܻ���������������
 */
package singletonPattern;

public class Singleton2 {
	private static Singleton2 uniqueInstance;
	
	private Singleton2() {};
	
	public static synchronized Singleton2 getInstance() {
		if ( uniqueInstance == null ) {
			uniqueInstance = new Singleton2();
		}
		return uniqueInstance;
	}
	
}
