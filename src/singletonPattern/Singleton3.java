/*
 * 在静态初始化器中直接创建单件实例，也能保证线程安全
 * 
 * 如果创建运行实例并不怎么耗资源可采用这种方法
 */
package singletonPattern;

public class Singleton3 {
	private static Singleton3 uniqueInstance = new Singleton3();
	
	private Singleton3() {};
	
	public static Singleton3 getInstance() {
		return uniqueInstance;
	}
}
