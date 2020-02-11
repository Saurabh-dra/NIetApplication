package capgemini.firstproject.welcome;

import java.io.FileReader;

public class FileProgram {
	FileReader fr;
	public static void main(String[] args) {
		FileProgram obj=new FileProgram();
//		try {
//			obj.fr=new FileReader("C:\\Users\\kumar\\Documents\\Links\\FileRead.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		CopyDataThread reader= new CopyDataThread(obj.fr);
		new Thread(reader).start();
		
	}
}
