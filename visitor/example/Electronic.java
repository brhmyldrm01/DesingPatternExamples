package visitor.example;

public interface Electronic {

	public void generateFile();
	public void accept(Printer printer);
}
