package bridge.example;

public interface BaseRepository {

	public StorageRepository getRepository();
	public void save();
}
