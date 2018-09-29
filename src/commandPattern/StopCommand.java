package commandPattern;

// ¾ßÌåÃüÁî
public class StopCommand implements Command {
	private AudioPlayer audio;
	
	public StopCommand(AudioPlayer audio) {
		this.audio = audio;
	}
	
	@Override
	public void excute() {
		audio.stop();
	}

}
