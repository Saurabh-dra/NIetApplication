package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Lab7_Eighth {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		Lab7_Eighth obj=new Lab7_Eighth();
		obj.modifyArray(obj.getArray());
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
	public int[] modifyArray(int arr[]) {
		
		HashSet<Integer> mSet=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
			mSet.add(arr[i]);
		
        Object[] arr1 = mSet.toArray(); 	
        for(int i=0;i<arr1.length;i++) {
			arr[i]=(int) arr1[i];
        	System.out.print(arr[i]+" ");
        	}
		return arr;
	}
}
