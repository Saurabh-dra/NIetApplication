package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab6_Second {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab6_Second obj = new Lab6_Second();
		obj.show();
	}

	void show() {
		System.out.println("Enter the file name:");
		String fileName = null;
		String line = null;
		try {
			fileName = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader("C:\\Users\\kumar\\Documents\\Links\\" + fileName);
			BufferedReader buff = new BufferedReader(fr);
			try {
				int lineNo = 1;
				while ((line = buff.readLine()) != null) {
					System.out.println("Line " + lineNo + ":" + line);
					lineNo++;
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

	}
}
