package chain.example;

public class mpPlayer extends VideoPlay{

	@Override
	public void play(String file) {
		// TODO Auto-generated method stub
		if(file=="mp")
			System.out.println("mp played");
		else {
		if(this.nextPlayer!=null)
			nextPlayer.play(file);
		else
			System.out.println("wrong file type");
			
	}
	}

	
	
}
