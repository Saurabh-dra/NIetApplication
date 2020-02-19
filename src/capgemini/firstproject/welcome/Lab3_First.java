package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab3_First {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isr);

	public static void main(String[] args) {
		Lab3_First obj = new Lab3_First();
		System.out.println(obj.getSecondSmallest());

	}

	public int getSecondSmallest() {

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
			for (i = 0; i < size - 1; i++) {
				for (int j = i + 1; j < size; j++) {
					if (array[i] > array[j]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i=0;
		{
			
			for(int j=i+1;j<size;j++)
			{
				if(array[i]==array[j]) {
					i++;
				}
				else
					return array[j];
			}
		}
		
		return array[0];
	}

}
