/*
 * 利用双重检查加锁，先检查实例是否被创建，只有还未创建才同步
 * 
 * volatile关键词确保当uniqueInstance变量被初始化为Singleton4实例时，多个线程能
 * 正确处理uniqueInstance变量
 */
package singletonPattern;

public class Singleton4 {
	private volatile static Singleton4 uniqueInstance;
	
	private Singleton4() {};
	
	public static Singleton4 getInstance() {
		if ( uniqueInstance == null ) {
			synchronized ( Singleton4.class ) {
				if ( uniqueInstance == null ) {
					uniqueInstance = new Singleton4();
				}
			}
		}
		return uniqueInstance;
	}
}
