package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import File.FileManager;

public class IOManager {
	public static final String OBJECT_EMPTY = "Error! Object is null";
	//Question 1: Tạo method read File 
	public static void readFile(String pathFile) throws IOException {
		FileManager.isFileExists(pathFile);
		FileInputStream fileInputStream = new FileInputStream(pathFile);
		byte[] b = new byte[1024];
		int c = fileInputStream.read(b);
		while (c != -1) {
			String content = new String (b, 0, c);
			System.out.print(content);
			c = fileInputStream.read(b);
		}
        
		fileInputStream.close();
	}
	
	//Question 2: Tạo method write content to File 
	
	public static void writeFile(String pathFile, boolean isContinuing, String content) throws IOException {
		FileOutputStream fileOutputStream = new FileOutputStream(pathFile,isContinuing);
		fileOutputStream.write(content.getBytes());
		fileOutputStream.close();
	}
	
	//Question 3: Tạo method write Object   
	
	public static void writeObject(InputStream object, String path) throws Exception  {
	    if(object == null) {
	    	throw new Exception (OBJECT_EMPTY);
	    }
	    File folder = new File(path);
	    if(!folder.exists()) {
	    	folder.createNewFile();
	    }else {
	    	FileManager.deleteFile(path);
	    	folder.createNewFile();
	    }
	    FileOutputStream fileOutputStream = new FileOutputStream(path);
		ObjectInputStream objectInputStream = new ObjectInputStream(object);
		objectInputStream.
	} 
}
