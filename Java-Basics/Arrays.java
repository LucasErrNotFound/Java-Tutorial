public class Arrays{

	public static void main(String[] args){

		// Array => Used to store multiple values in a single variable

		String[] names = new String[6];

		names[0] = "Mark";
		names[1] = "Daniela";
		names[2] = "Johannah";
		names[3] = "Brian";
		names[4] = "Jawili";
		names[5] = "Jana";

		for(int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		
		// If you want to print out a single element in the array, just do System.out.println(names[0]);
		// This will print out "Mark"

		// Alternate version of this is;

		String[] others = {"Graham", "Kobe", "Adriel", "Mardie", "Joey"};

		// You can modify an element in the array
		// others[0] = "SianRey"
		// So, Graham is replaced by SianRey

		System.out.println();
		
		for(String i: others){
			System.out.println(i);
		}
	}
}
