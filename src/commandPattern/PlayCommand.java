package commandPattern;

// ¾ßÌåÃüÁî½ÇÉ«
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
