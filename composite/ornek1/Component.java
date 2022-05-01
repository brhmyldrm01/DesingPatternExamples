package composite.ornek1;

public abstract class Component {
	String isim;
	departman departman;
	
	public Component(String isim, composite.ornek1.departman departman) {
		super();
		this.isim = isim;
		this.departman = departman;
	}

	/**
	 * @return the isim
	 */
	public String getIsim() {
		return isim;
	}

	/**
	 * @param isim the isim to set
	 */
	public void setIsim(String isim) {
		this.isim = isim;
	}

	/**
	 * @return the departman
	 */
	public departman getDepartman() {
		return departman;
	}

	/**
	 * @param departman the departman to set
	 */
	public void setDepartman(departman departman) {
		this.departman = departman;
	}

	public abstract void rapor();

}
