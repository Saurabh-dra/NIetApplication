package capgemini.firstproject.books;

import java.util.*;
public abstract class Item {
	Scanner scan;
	Item(){
		scan=new Scanner(System.in);
	}
	//public void show();
	private String unique_id,title;
	private int no_of_copies;
	
	public String getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	
	public void addItem() {
		System.out.println("Enter the Unique ID:");
		setUnique_id(scan.nextLine());
		System.out.println("Enter the Title:");
		setTitle(scan.nextLine());
		System.out.println("Entet the Number of Copies:");
		setNo_of_copies(scan.nextInt());
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return String.format("Title\nUnique IQ -%s\n",title);
		
	}
	

}
