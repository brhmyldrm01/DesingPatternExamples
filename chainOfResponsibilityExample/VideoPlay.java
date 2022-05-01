package chain.example;

public abstract class VideoPlay {

	protected VideoPlay nextPlayer;
	
	public void setNext(VideoPlay vp) {
		this.nextPlayer=vp;
	}
	
	public abstract void play(String file);
}
