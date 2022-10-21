import java.util.Scanner;

public class WhileLoop{

	public static void main(String[] args){

		// While Loop => Executes a block of code as long as a it's condition remains true
		
		Scanner read = new Scanner(System.in);
	
		System.out.println("Ctrl + c to cancel the infinite loop...");
		System.out.println("Enter you phrase:");
		System.out.print("-----> ");
			String phrase = read.nextLine();
			
			read.close();

			while(true){
				System.out.println(phrase);
			}
	}
}
