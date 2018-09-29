package commandPattern;

// ���������ɫ
public class PlayCommand implements Command {
	private AudioPlayer audio;
	
	public PlayCommand(AudioPlayer audio) {
		this.audio = audio;
	}
	
	@Override
	public void excute() {
		audio.play();
	}

}
