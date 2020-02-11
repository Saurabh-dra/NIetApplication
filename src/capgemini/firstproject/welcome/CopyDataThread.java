package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread implements Runnable {
	BufferedReader br = null;
	FileWriter fw;
	FileReader fr1;

	public CopyDataThread(FileReader fr) {
		fr1=fr;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\kumar\\Documents\\Links\\source.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int buff = 0,count=0;
		try {
			fw = new FileWriter("C:\\Users\\kumar\\Documents\\Links\\target.txt");
			while ((buff=br.read())!=-1) {
				fw.write((char)buff);
				fw.flush();
				++count;
				if(count==10) {
					System.out.println("10 Characters copied!");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count=0;
				}
			}
//			fw.append('\0');
			System.out.println("File Copied");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}