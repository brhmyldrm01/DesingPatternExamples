package composite.ornek1;

public class LeafCalisan extends Component {

	public LeafCalisan(String isim, departman departman) {
		super(isim, departman);
		
	}

	@Override
	public void rapor() {
	System.out.println(this.getIsim()+ ": raporu.");
		
	}

	
}
