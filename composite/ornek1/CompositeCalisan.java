package composite.ornek1;

import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends Component {

	
	private List<Component> calisanlar;
	
	
	public CompositeCalisan(String isim, departman departman) {
		super(isim, departman);
		calisanlar = new ArrayList<Component>();
		
	}

	public void add(Component com) {
		calisanlar.add(com);
	}
	
	public void remove(Component com) {
		calisanlar.remove(com);
	}
	
	@Override
	public void rapor() {
	System.out.println(this.getIsim()+ ": raporu.");
	for (Component component : calisanlar) {
		component.rapor();
	}
		
	}

	
}
