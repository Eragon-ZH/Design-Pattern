/*
 * 利用 synchronized 关键字将其变成同步方法，保证没有两个线程同时进入这个方法
 * 
 * 但事实上只有第一次new的时候才需要同步，这样可能会带来额外性能损耗
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
