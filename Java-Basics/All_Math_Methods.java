public class All_Math_Methods{

	public static void main(String[] args){

		// Find the largest number

		int num1 = 10;
		int num2 = 20;
		int large = Math.max(num1, num2);
		System.out.println("The largest number is: "+large);

		// Find the lowest number

		int lnum1 = 50;
		int lnum2 = 24;
		int lowest = Math.min(lnum1, lnum2);
		System.out.println("The lowest number is: "+lowest);

		// The absolute value, positive number except for zero

		int anum1 = -99;
		int absolute = Math.abs(anum1);
		System.out.println("The absolute value is: "+absolute);

		// Find the square root

		int number = 100;
		double square = Math.sqrt(number);
		System.out.println("The square root of "+number+" is "+square);

		// Round off

		float round_off = 3.90f;
		float round = Math.round(round_off);
		System.out.println("The result is: "+round);

		// increment value up

		double inum1 = 10.9;
		double increment = Math.ceil(inum1);
		System.out.println("increment value: "+increment);

		// decrement value down

		double dnum1 = 10.1;
		double decrement = Math.floor(dnum1);
		System.out.println("decrement value is: "+decrement);

	}
}
