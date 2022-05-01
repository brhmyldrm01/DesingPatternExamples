package chain.example;

public class mp4Player extends VideoPlay{

	@Override
	public void play(String file) {
		// TODO Auto-generated method stub
		if(file=="mp4")
			System.out.println("mp4 plsyed");
		else {
		if(this.nextPlayer!=null)
			nextPlayer.play(file);
		else
			System.out.println("wrong file type");
			
	}
	}

	
	
}
