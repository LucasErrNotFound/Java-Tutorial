import java.util.Scanner;

public class Maths{
	
	public static void main(String[] args){

		Scanner read = new Scanner(System.in);

		int add = 1 + 9;
		System.out.println("Answer is: "+add);

		int subtract = 10 - 5;
		System.out.println("Answer is: "+subtract);

		int multiply = 5 * 5;
		System.out.println("Answer is: "+multiply);

		int divide = 100 / 5;
		System.out.println("Answer is: "+divide);

		// Find the remainder

		int remainder = 50 % 3;
		System.out.println("Answer is: "+remainder);

		// Find if the number is odd or even

		System.out.println("\nEnter your number: ");
		System.out.print("-----> ");
			int number = read.nextInt();

			if((number % 2) == 0){
				System.out.println("\nYour number is even");
			}

			else{
				System.out.println("\nYour number is odd");
			}

		// Find the highest and the lowest number

		System.out.print("\nEnter your first number: ");
		System.out.print("-----> ");
			int num1 = read.nextInt();

		System.out.print("\nEnter your second number: ");
		System.out.print("-----> ");
			int num2 = read.nextInt();

			int max = Math.max(num1, num2);
			int low = Math.min(num1, num2);

			System.out.println("\nThe highest is: "+max);
			System.out.print("And the lowest is: "+low);

			read.close();
	}
}
