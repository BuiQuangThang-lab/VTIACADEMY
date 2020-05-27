package com.vti.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

	public static final String FILE_EXISTS = "Error! File Exists";
	public static final String FILE_NOT_EXISTS = "Error! File not Exists";

//Question1:  Check File is exists 
	public static boolean isFileExists(String pathFile) {
		File file = new File(pathFile);
		if (file.exists()) {
			return true;
		} else {
			return false;
		}
	}

//Question2:  Create new file 

	public static void createNewFile(String path, String fileName) throws Exception {
		String filePath = path + "\\" + fileName;
		if (isFileExists(filePath)) {
			throw new Exception(FILE_EXISTS);
		}

		File file = new File(filePath);
		file.createNewFile();
	}
//Question 4: Delete file 

	public static void deleteFile(String pathFile) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_EXISTS);
		}
		File file = new File(pathFile);
		file.delete();

	}

//Question 5: Check path is File or Folder  	
	public static boolean isFolder(String path) {
		File folder = new File(path);
		if (folder.isDirectory()) {
			return true;
		} else {
			return false;
		}

	}

//Question 6: Get all File name of Folder  
	public static void getAbsolutePath(String path) throws Exception {
		if (!isFolder(path)) {
			throw new Exception(FILE_NOT_EXISTS);
		}

		File folder = new File(path);
		File[] list = folder.listFiles();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i].getAbsolutePath());
		}

	}

	// Question 7: Copy File
	public static void copyFile(String pathOldFile, String newPath, String newName) throws Exception {
		if (!isFileExists(pathOldFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		if (!isFolder(newPath)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		InputStream inputStream = new FileInputStream(pathOldFile);
		createNewFile(newPath, newName);
		OutputStream outputStream = new FileOutputStream(newPath + "\\" + newName);
		byte[] buffer = new byte[1024];
		int length = inputStream.read(buffer);
		while ((length = inputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
	}
	
	//Question 8: Moving file 
	public static void  moveFile(String pathOldFile, String newPath) throws Exception {
		if (!isFileExists(pathOldFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		File aFile = new File(pathOldFile);
		aFile.renameTo(new File(newPath + aFile.getName()));
	}
	
	//Question9: Rename file
	public static void renameFile(String pathOldFile, String newName) throws Exception {
		File newFile = new File(pathOldFile);
		if (!isFileExists(pathOldFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}if(isFileExists(newFile.getParent() + "\\" + newName)) {
			throw new Exception(FILE_EXISTS);
		}
		File oldFile = new File(pathOldFile);
		oldFile.renameTo(new File(newFile.getParent() + "\\" + newName));
	}
	
	//Question10: Create new folder
	
	public static void createNewFolder(String newPathFolder) throws Exception {
		if(isFileExists(newPathFolder)) {
			throw new Exception(FILE_EXISTS);
		}
		Path dir = Paths.get(newPathFolder);
		Files.createDirectories(dir);
	}
	
	//Question10: Download file
}