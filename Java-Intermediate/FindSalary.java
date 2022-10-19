import java.util.Scanner;

public class FindSalary{

	public static void main(String args[]){
		Scanner read = new Scanner(System.in);

		System.out.println("What is your wage?");
		System.out.print("-----> ");
			int wage = read.nextInt();

		System.out.println("\nHow long do you work? In Hours?");
		System.out.print("-----> ");
			int hours = read.nextInt();

		int salary = wage * hours;
			System.out.println("\nYour salary is: "+salary);
				
			read.close();
	}
}
