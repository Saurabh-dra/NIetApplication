package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lab6_Sixth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab6_Sixth obj = new Lab6_Sixth();
		obj.show();
	}
	void show() {
		int lineNo = 0,charNo=0,wordNo=0;
		try {
			FileReader fr = new FileReader("C:\\Users\\kumar\\Documents\\Links\\FileRead.txt");
			BufferedReader buff = new BufferedReader(fr);
			try {
				String line;
				while ((line = buff.readLine()) != null) {
					StringTokenizer st=new StringTokenizer(line," ");
					wordNo=wordNo+st.countTokens();
					charNo=charNo+line.length();
					lineNo++;
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("Line="+lineNo);

		System.out.println("Word="+wordNo);

		System.out.println("Characters="+charNo);

	}

}
