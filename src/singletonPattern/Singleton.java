/*
 * 单例模式：只允许创造一个实例 并提供一个全局访问点
 * 
 * 构造函数 Singleton() 为私有的，实例化只能通过类方法 Singleton.getInstance()
 * 如果已经有实例则直接返回该实例
 * 
 * 多线程可能会有问题
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
