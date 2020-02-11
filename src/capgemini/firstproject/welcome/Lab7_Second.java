package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Lab7_Second {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Lab7_Second obj = new Lab7_Second();
		System.out.println(obj.countCharacter(obj.getArray()));
	}

	public char[] getArray() {
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
		char arr[] = new char[size];
		for (int i = 0; i < size; i++) {
			try {
				arr[i] = br.readLine().charAt(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return arr;

	}

	public Map<Character, Integer> countCharacter(char arr[]) {
		int size = arr.length;
		int i = 0;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		hm.put(arr[0], 1);
		for (i = 1; i < size; i++) {
			Iterator<Entry<Character, Integer>> itr = hm.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<Character, Integer> me = (Map.Entry<Character, Integer>) itr.next();
				if (arr[i]==me.getKey()) {
					hm.replace(arr[i], me.getValue()+1);
					break;
				} else {
					hm.put(arr[i], 1);
					break;
				}
			}
		}
		return hm;
	}

}
