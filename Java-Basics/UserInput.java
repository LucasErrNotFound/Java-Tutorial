import java.util.Scanner;	// Import Scanner from java utility

public class UserInput{		// Don't forget to set the class name the same as the file name
    
	public static void main(String[] args){

		Scanner read = new Scanner(System.in);	// start Scanner, named it read, System input

		System.out.println("What is your name?");
		System.out.print("-----> ");
			String name = read.nextLine();	// System will wait for user to enter a String

		System.out.print("\nGood Morning "+name+"!");	// Will print the user input
			read.close();	// To avoid resource leak, the Scanner should be closed	

		/* 
			String  -----> nextLine()		-----> Reads a line of text from the user
			int     -----> nextInt()		-----> Reads a int value from the user
			float   -----> nextFloat()		-----> Reads a float value from the user
			double  -----> nextDouble()		-----> Reads a double value from the user
			boolean -----> nextBoolean()		-----> Reads a boolean value from the user
			long    -----> nextLong()		-----> Reads a long value from the user
			short   -----> nextShort()		-----> Reads a short value from the user
			byte	-----> nextByte()		-----> Reads a byte value from the user
			next()					----->	Reads user input
		 */
	}
}
