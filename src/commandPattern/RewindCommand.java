package commandPattern;

// ¾ßÌåÃüÁî
public class RewindCommand implements Command {
	private AudioPlayer audio;
	
	public RewindCommand(AudioPlayer audio) {
		this.audio = audio;
	}
	
	@Override
	public void excute() {
		audio.rewind();
	}

}
