package commandPattern;

// 客户端类 发出命令
public class Julia {

	public static void main(String[] args) {
		// 创建接受者
		AudioPlayer audioPlayer = new AudioPlayer();
		// 创建命令对象
		Command playCommand = new PlayCommand(audioPlayer);
		Command rewindCommand = new RewindCommand(audioPlayer);
		Command stopCommand = new StopCommand(audioPlayer);
		// 创建请求者
		Keyboard keyboard = new Keyboard();
		keyboard.setPlayCommand(playCommand);
		keyboard.setRewindCommand(rewindCommand);
		keyboard.setStopCommand(stopCommand);
		// 测试
		keyboard.play();
		keyboard.rewind();
		keyboard.stop();
		keyboard.play();
		keyboard.stop();
	}

}
