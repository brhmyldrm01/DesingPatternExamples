package bridge.example;

public class ManagerRepository implements BaseRepository{

	StorageRepository storageRepository;

	public ManagerRepository(StorageRepository storageRepository) {
		this.storageRepository = storageRepository;
	}
	
	public StorageRepository getRepository(){
		return storageRepository;
	}
	
	public void save() {
		System.out.println("manager entity");
		storageRepository.store();
	}
	
	
}
