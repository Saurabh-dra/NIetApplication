package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab4_Forth {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab4_Forth obj = new Lab4_Forth();
		obj.countChar();
	}

	public void countChar() {
		int i, m = 0;
		int size;
		try {
			System.out.println("Enter size");
			size = Integer.parseInt(br.readLine());
			System.out.println("Array");
			char array[] = new char[size];
			for (i = 0; i < size; i++)
				array[i] = br.readLine().charAt(0);

			char map[] = new char[size];
			for (i = 0; i < size; i++) {
				
			}
			System.out.println("Map");
			for (i = 0; i < m; i++) {
				System.out.println(map[i]);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
