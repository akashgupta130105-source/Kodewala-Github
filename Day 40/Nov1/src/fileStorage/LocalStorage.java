package fileStorage;

public class LocalStorage implements IStorage {

	@Override
	public void uploadFile() {
		System.out.println("LocalStorage.uploadFile()");
		
	}

	@Override
	public void downloadFile() {
		System.out.println("LocalStorage.downloadFile()");
		
	}

}
