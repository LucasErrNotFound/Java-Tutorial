import java.util.Scanner;

public class IfElse{

	public static void main(String[] args){

		// If statement => perform a block of code if it's condition evaluates to be true

		Scanner read = new Scanner(System.in);

		System.out.println("How old are you?");
		System.out.print("-----> ");
			int age = read.nextInt();

			if (age < 18){
				System.out.println("You are a minor!");
			}

			else {
				System.out.println("You are an adult!");
			}

		System.out.println("\nChoose your desired number from 1-10");
		System.out.print("-----> ");
			int num = read.nextInt();
			
			if (num == 1){
				System.out.println("Everyone calls Jawili");
			}

			else if (num == 2){
				System.out.println("Rafael looking like an artist with that smile");
			}

			else if (num == 3){
				System.out.println("Someone is having a crush on Brian");
			}

			else if (num == 4){
				System.out.println("I relax because I have a grade of 1.00");
			}

			else if (num == 5){
				System.out.println("Kobe looking like a neat student with his school uniform");
			}

			else if (num == 6){
				System.out.println("Someone said that Daniela looks gorgeous");
			}

			else if (num == 7){
				System.out.println("Nash can really be a macho dancer");
			}

			else if (num == 8){
				System.out.println("Graham's graham tastes delicious");
			}

			else if(num == 9){
				System.out.println("Joey Jr is loyal to one person");
			}

			else if (num == 10){
				System.out.println("Someone's playing Basketball while wearing his hoodie");
			}

			else {
				System.out.println("Read the instruction please...");
			}
	}
}
