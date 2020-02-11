
package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Lab7_Seventh {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab7_Seventh obj = new Lab7_Seventh();
		System.out.println(obj.getSorted(obj.getArray()));
	}

	public int[] getArray() {
		System.out.println("Enter Size of array");
		int size = 0;
		try {
			size = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			try {
				arr[i] = Integer.parseInt(br.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arr;	
	}
	
	public ArrayList<Integer> getSorted(int arr[]) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ;i<arr.length;i++) {
			String s = Integer.toString(arr[i]);
			sb.append(s);
			sb.reverse();
			ar.add(Integer.parseInt(sb.toString()));
			sb.delete(0,sb.toString().length());
		}

		Collections.sort(ar);
		
		return ar;
	}

}
