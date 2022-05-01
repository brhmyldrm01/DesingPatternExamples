package visitor.example;

public class PC implements Electronic {
	private String wordFile;
	
	
	/**
	 * @return the wordFile
	 */
	public String getWordFile() {
		return wordFile;
	}

	/**
	 * @param wordFile the wordFile to set
	 */
	public void setWordFile(String wordFile) {
		this.wordFile = wordFile;
	}

	public void generateFile() {
		wordFile = " Word File";
	}

	@Override
	public void accept(Printer printer) {
		printer.print(this);
	}
}
