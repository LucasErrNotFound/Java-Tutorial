import java.util.Scanner;

public class LogicalOperators{

	public static void main(String[] args){

		/*
		   Logical Operators = Used to connect two or more experssions.

		   && => (AND) Both conditions must be true
		   || => (OR) Either condition must be true
		   ! => (NOT) Reverses boolean value of a condition
		   */

		Scanner read = new Scanner(System.in);

		System.out.println("How old are you?");
		System.out.print("-----> ");
			int age = read.nextInt();

			if (age <= 17 && age >= 1){
				System.out.println("You are a minor!");
			}

			else if (age >= 18 && age <= 59){
				System.out.println("You are an adult");
			}

			else if (age >= 60 && age <= 100){
				System.out.println("You are a senior citizen");
			}

		System.out.println("\nIs Nash a funny dude? y or n");
		System.out.print("-----> ");
			char answer = read.next().charAt(0);

			if (answer != 'y'){
				System.out.println("Then you are no fun...");
			}

			else {
				System.out.println("Then we are family!");
			}
			read.close();
	}
}
