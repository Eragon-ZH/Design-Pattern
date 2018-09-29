package commandPattern;

// �ͻ����� ��������
public class Julia {

	public static void main(String[] args) {
		// ����������
		AudioPlayer audioPlayer = new AudioPlayer();
		// �����������
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		// ����������
		Keyboard keyboard = new Keyboard();
		keyboard.setPlayCommand(playCommand);
		keyboard.setRewindCommand(rewindCommand);
		keyboard.setStopCommand(stopCommand);
		// ����
		keyboard.play();
		keyboard.rewind();
		keyboard.stop();
		keyboard.play();
		keyboard.stop();
	}

}
