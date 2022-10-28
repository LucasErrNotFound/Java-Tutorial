import java.util.ArrayList;

public class Arraylist{

	public static void main(String[] args){

		// Array List => A resizable array.
		// Elements can be added and removed after compilation phase
		// store reference data types

		ArrayList<String> names = new ArrayList<String>();

		names.add("Jawili");
		names.add("Nash");
		names.add("Adriel");

		for(String i: names){
			System.out.println(i);
		}
	}
}
