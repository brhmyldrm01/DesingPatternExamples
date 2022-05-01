package chain.example;

public class AviPlayer extends VideoPlay{

	@Override
	public void play(String file) {
		// TODO Auto-generated method stub
		if(file=="avi")
			System.out.println("avi played");
		else {
		if(this.nextPlayer!=null)
			nextPlayer.play(file);
		else
			System.out.println("wrong file type");
			
	}
	}

	
	
}
