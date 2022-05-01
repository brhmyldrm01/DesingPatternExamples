package bridge.example;

public class StudentRepository implements BaseRepository {

	StorageRepository storageRepository;

	public StudentRepository(StorageRepository storageRepository) {
		this.storageRepository = storageRepository;
	}
	
	public StorageRepository getRepository(){
		return storageRepository;
	}
	
	public void save() {
		System.out.println("student entity");
		storageRepository.store();
	}
	
	
	
}
