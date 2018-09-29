package commandPattern;

// ÇëÇóÕß½ÇÉ«
public class Keyboard {
	private Command playCommand;
	private Command rewindCommand;
	private Command stopCommand;
	
	public void setPlayCommand(Command playCommand) {
		this.playCommand = playCommand;
	}
	
	public void setRewindCommand(Command rewindCommand) {
		this.rewindCommand = rewindCommand;
	}
	
	public void setStopCommand(Command stopCommand) {
		this.stopCommand = stopCommand;
	}
	
	public void play() {
		playCommand.excute();
	}
	
	public void rewind() {
		rewindCommand.excute();
	}
	
	public void stop() {
		stopCommand.excute();
	}
}
