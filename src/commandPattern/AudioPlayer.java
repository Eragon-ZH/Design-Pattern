/*
 * ����ģʽ����Ϊ��ģʽ��������������װ��һ�������У���ʹ�ò�ͬ������
 * 
 * ����ģ����һ��¼������������������play rewind stop��װ�ɲ�ͬ��Command
 * 
 * ʵ�������󷽺ͽ��շ��Ľ�����󷽲��ع���������ô�����ܣ���ô��ִ�е�
 * 
 * Ҳ������ʵ�ֺ����������δʵ��
 */
package commandPattern;

// �����߽�ɫ һ��¼����
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
