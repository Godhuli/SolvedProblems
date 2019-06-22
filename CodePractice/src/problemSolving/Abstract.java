package conceptOopDataStructure;

import java.util.Scanner;

abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book{
	void setTitle(String title){
		this.title= title;
	}
}

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the title");
		Scanner s = new Scanner(System.in);
		String title = s.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is:"+ new_novel.getTitle());
		s.close();
	}

}

