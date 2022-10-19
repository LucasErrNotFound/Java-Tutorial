public class SwapVariable{

	public static void main(String[] args){

		String x = "Water";	// Iniatilize x to Water
		String y = "Air";	// Iniatilize y to Air
		String temp;		// Declare a variable name temp, for temporary

		temp = x;	// set temp equal to the value of x
		x = y;		// set x equal to the value of y
		y = temp;	// set y equal to the value of temp

		System.out.println("x: "+x);	// Instead of printing Water, it will print Air
		System.out.println("y: "+y);	// Instead of printing Air, it will print Water
	}
}
