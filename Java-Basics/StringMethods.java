public class StringMethods{
	
	public static void main(String[] args){

		// String => A reference data type that can storne one or more characters
		// Reference data types have access to useful methods

		String name = "Lucas";

		boolean result = name.equalsIgnoreCase("lucas");
		System.out.println(result);    // It will display "true", because lucas and Lucas is the same

		// int result = name.length();
		// System.out.println(result); // It will display "5" because Lucas contains five characters

		// char result = name.charAt(0);	// It will always start at 0
		// System.out.println(result);		// It will print out the character 'L'

		// int result = name.indexOf("c");	// Index is the position of the character
		// System.out.println(result);		// It will print out "2"
		
		// String result = name.toUpperCase();	// Change all characters to uppercase
		// System.out.println(result);			// Print out "LUCAS" 

		// String result = name.toLowerCase();	// Change all characters to lowercase
		// System.out.println(result);			// Print out "lucas"

		// String result = name.trim();	// Trim unnecessary whitespaces

		// String result = name.replace('c', 'k');	// Replaces 'c' with 'k' 
		// System.out.println(result);				// Print out "Lukas"
	}
}
