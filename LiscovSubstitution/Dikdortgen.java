package LSP;

public class Dikdortgen extends AlanHesaplanan {

	private int uzunKenar;
	
	
	
	/**
	 * @return the uzunKenar
	 */
	public int getUzunKenar() {
		return uzunKenar;
	}

	/**
	 * @param uzunKenar the uzunKenar to set
	 */
	public void setUzunKenar(int uzunKenar) {
		this.uzunKenar = uzunKenar;
	}

	@Override
	public double alan() {

		return getKenar()*getUzunKenar();
	}

	@Override
	public double cevre() {
		
		return 2*getKenar()+ 2*getUzunKenar();
	}

}
