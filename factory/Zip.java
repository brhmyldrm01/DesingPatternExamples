package factory;

public class Zip implements FileCompression {
	
	String extention;
	public Zip(String extention) {
		this.extention=extention;
	}
	
	@Override
	public String compString(String file) {
	
		return file + extention;
	}

	
}
