package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab10_Second {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		Lab10_Second obj=new Lab10_Second();
		String str=null;
		try {
			str=obj.br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Format fr=(str2)->{
			String str1="";
			int len=str2.length();
			for(int i=0;i<len;i++) {
				if(i==len-1)
					str1=str1+str2.charAt(i);
				else
					str1=str1+str2.charAt(i)+" ";
			}
			return str1;
		};
		
		System.out.println(fr.addSpace(str));
		
	}
}
interface Format{
	String addSpace(String str2);
}