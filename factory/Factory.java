package factory;

public class Factory {

	public FileCompression compressionType(String type) {
		switch(type) {
		case "zip": return new Zip(".zip");
		case "rar": return new Rar("Rar/");
		default: return null;
		}
	}
	


	
	
	
}
