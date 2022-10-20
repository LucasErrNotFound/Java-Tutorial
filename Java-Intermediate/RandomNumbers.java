import java.util.Random;

public class RandomNumbers{

	public static void main(String[] args){

		Random generate = new Random();
		int x = generate.nextInt(6); // It will generate numbers from 0 to 5, because computer always start at 0
					// To solve it, just do it like this; (6)+1;
		System.out.println(x);

		double decimal = generate.nextDouble();
		System.out.println(decimal);
	
		boolean crap = generate.nextBoolean();
		System.out.println(crap);
	}
}
