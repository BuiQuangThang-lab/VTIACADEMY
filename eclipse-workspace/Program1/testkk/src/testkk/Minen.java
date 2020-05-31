package testkk;

import java.io.*;

public class Minen {
	public static void main(String args[]) {
		Minen m = new Minen();
		System.out.println(m.amethod());
	}

	public int amethod() { 
	 try { 
	 FileInputStream dis = new  FileInputStream("JavaCodingConvetion.txt"); 
	} catch (FileNotFoundException fne) { 
	System.out.println("No such file found"); 
	return -1; 
	} catch (IOException ioe) { 
	} finally { 
	System.out.println("Doing finally"); 
	} 
	return 0; 
	}
}
