import java.util.Scanner;

public class calculator{

	public static void main(String[] args){
	
		System.out.print("\033[H\033[2J");
		System.out.flush();

		Scanner read = new Scanner(System.in);

			System.out.print("Console Calculator, choose your desired options:\n");
			System.out.print("[1] << Addition\n[2] << Subtraction\n[3] << Multiplication\n[4] << Division\n[5] << Exit\n");
			System.out.print("-----> ");
				int options = read.nextInt();

				switch(options){

					case 1:
						System.out.print("\nThe sum is: "+Addition());
						break;

					case 2:
						System.out.print("\nThe difference is: "+Subtraction());
						break;

					case 3:
						System.out.print("\nThe product is: "+Multiplication());
						break;

					case 4:
						float result[] = Division();
						System.out.print("\nThe quotient is: "+result[0]+"\nThe Remainder is: "+result[1]);
						break;

					case 5:
						System.out.print("\nOkay, understandable");
						System.exit(0);
				}

			System.out.print("\nWanna use me again?\n");
			System.out.print("-----> ");
				char crap = read.next().charAt(0);

				if(crap == 'Y'){
					main(null);
				}

				else if(crap == 'N'){
					System.out.print("\nOkay, see you next time!");
					System.exit(0);
				}

	}

	public static int Addition(){

		System.out.print("\033[H\033[2J");
		System.out.flush();

		Scanner read = new Scanner(System.in);

		System.out.print("\nPlease Enter Your First Addend\n");
		System.out.print("-----> ");
			int a1 = read.nextInt();

		System.out.print("\nPlease Enter Your Second Addend\n");
		System.out.print("-----> ");
			int a2 = read.nextInt();

			return a1 + a2;
	}

	public static int Subtraction(){

		System.out.print("\033[H\033[2J");
		System.out.flush();

		Scanner read = new Scanner(System.in);

		System.out.print("\nPlease Enter Your Minuend\n");
		System.out.print("-----> ");
			int s1 = read.nextInt();

		System.out.print("\nPlease Enter Your Subtrahend\n");
		System.out.print("-----> ");
			int s2 = read.nextInt();

			return s1 - s2;
	}

	public static int Multiplication(){

		System.out.print("\033[H\033[2J");
		System.out.flush();

		Scanner read = new Scanner(System.in);

		System.out.print("\nPlease Enter Your Multiplicand\n");
		System.out.print("-----> ");
			int m1 = read.nextInt();

		System.out.print("\nPlease Enter Your Multiplier\n");
		System.out.print("-----> ");
			int m2 = read.nextInt();

			return m1 * m2;
	}

	public static float[] Division(){

		System.out.print("\033[H\033[2J");
		System.out.flush();

		Scanner read = new Scanner(System.in);

		System.out.print("\nPlease Enter Your Dividend\n");
		System.out.print("-----> ");
			int d1 = read.nextInt();

		System.out.print("\nplease Enter your Divisor\n");
		System.out.print("-----> ");
			int d2 = read.nextInt();

			float q = d1 / d2;
			float r = d1 % d2;

			return new float[] {q, r}; 
	}
}
