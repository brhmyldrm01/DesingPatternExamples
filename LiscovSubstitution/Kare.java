package LSP;

public class Kare extends AlanHesaplanan{

	@Override
	public double alan() {
		
		return getKenar()*getKenar();
	}

	@Override
	public double cevre() {
		// TODO Auto-generated method stub
		return 4*getKenar();
	}

	
}
