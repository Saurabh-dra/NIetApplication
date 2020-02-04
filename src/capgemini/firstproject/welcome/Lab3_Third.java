package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3_Third {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isr);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3_Third obj = new Lab3_Third();
		obj.show(obj.getSorted());

	}

	private void show(int[] sorted) {
		for(int i=0;i<sorted.length;i++)	{
			System.out.println(sorted[i]);
		}
	}

	public int[] getSorted() {
		System.out.println("Enter the size of array");
		int i, size = 0;
		int array[] = null;
		try {
			size = Integer.parseInt(in.readLine());
			array = new int[size];
			System.out.println("Enter the array elements");
			for (i = 0; i < size; i++) {
				array[i] = Integer.parseInt(in.readLine());
			}
			for (i = 0; i < size; i++) {
				int temp = array[i], s = 0;
				while (temp != 0) {
					int rem = temp % 10;
					s = s * 10 + rem;
					temp = temp / 10;
				}
				array[i] = s;
			}
			for (i = 0; i < size - 1; i++) {
				for (int j = i + 1; j < size; j++) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} catch (

		NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return array;
	}

}
