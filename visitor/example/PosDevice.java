package visitor.example;

public class PosDevice implements Electronic{
	private String wpsFile;
	
	
	/**
	 * @return the wpsFile
	 */
	public String getWpsFile() {
		return wpsFile;
	}

	/**
	 * @param wpsFile the wpsFile to set
	 */
	public void setWpsFile(String wpsFile) {
		this.wpsFile = wpsFile;
	}

	public void generateFile() {
		wpsFile = " Wps File";
	}

	@Override
	public void accept(Printer printer) {
		printer.print(this);
	}
}
