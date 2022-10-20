import java.util.Scanner;

public class Switch{

	public static void main(String[] args){

		Scanner read = new Scanner(System.in);

		System.out.println("Choose you number from 1-13");
		System.out.print("-----> ");
			int number = read.nextInt();

			switch(number){	// Switch is just an alternate version of if statements

				case 1: System.out.println("Jana is beautiful");
						break;

				case 2: System.out.println("Johannah is always talkative");
						break;

				case 3: System.out.println("Father Norvic and Mother Em are having a baby soon");
						break;

				case 4: System.out.println("Is there a spy in our main group chat?");
						break;

				case 5: System.out.println("We are family, family is love");
						break;

				case 6: System.out.println("Walter likes to go on an adventure");
						break;

				case 7: System.out.println("Is it too late now to say sorry?");
						break;

				case 8: System.out.println("I hope Mardie is doing good");
						break;

				case 9: System.out.println("My favorite biscuit is Oreo vanilla");
						break;

				case 10: System.out.println("Someone is secretly admiring Jana right now");
						 break;

				case 11: System.out.println("It's okay to have a crush on someone");
						 break;

				case 12: System.out.println("Don't rush it, I believe on you M...");
						 break;

				default: System.out.println("Don't be pressured, both of you can be friends...");
			}
			read.close();
	}
}
