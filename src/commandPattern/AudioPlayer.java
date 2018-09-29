/*
 * 命令模式：行为型模式，把请求或操作封装到一个对象中，以使用不同的请求。
 * 
 * 本例模拟了一个录音机，将各种命令如play rewind stop封装成不同的Command
 * 
 * 实现了请求方和接收方的解耦，请求方不必关心请求怎么被接受，怎么被执行的
 * 
 * 也很容易实现宏命令，本例暂未实现
 */
package commandPattern;

// 接受者角色 一个录音机
public class AudioPlayer {
	public void play() {
		System.out.println("Playing...");
	}
	
	public void rewind() {
		System.out.println("Rewind...");
	}
	
	public void stop() {
		System.out.println("Stop.");
	}
}
