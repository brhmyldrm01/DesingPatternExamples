package factory;

public class Rar implements FileCompression {

	String path;
	public Rar(String path) {
		this.path=path;
	}
	
	
	@Override
	public String compString(String file) {
		
		return path + file;
	}

	
}
