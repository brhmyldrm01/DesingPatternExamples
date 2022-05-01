package chain.example;

public class Main {

	public static void main(String[] args) {
		VideoPlay mp4player = new mp4Player();
		VideoPlay mpplayer = new mpPlayer();
		VideoPlay aviplayer =new AviPlayer();
		
		mp4player.setNext(mpplayer);
		mpplayer.setNext(aviplayer);
		
		mp4player.play("mp4");
		mp4player.play("mp");
		mp4player.play("avi");
		mp4player.play("mp4fs");

	}

}
