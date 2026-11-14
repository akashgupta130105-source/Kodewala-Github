package fileStorage;

public class Main {
	public static void main(String []args) {
		StorageControl storage= new StorageControl();
		storage.storageControl(new AWSS3());
	}

}
