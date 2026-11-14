package fileStorage;

public class AzureBlobStorage implements IStorage{

	@Override
	public void uploadFile() {
		System.out.println("AzureBlobStorage.uploadFile()");
		
	}

	@Override
	public void downloadFile() {
		System.out.println("AzureBlobStorage.downloadFile()");
		
	}

}
