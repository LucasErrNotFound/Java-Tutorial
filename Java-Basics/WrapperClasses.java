public class WrapperClasses{

	public static void main(String[] args){

		// Wrapper Class => Provides a way to use primitive data types as reference data type
		// reference data types contain useful methods
		// can be used with collections (ex. ArrayList)

		// Primitive	Wrapper	
		//
		// boolean		Boolean
		// char			Character
		// int			Integer
		// double		Double

		// Autoboxing => The automatic conversion that the Java compiler makes between the 
		// primitive types and their corresponding object wrapper class

		// Unboxing => The reverse of autoboxing. Automatic conversion of wrapper class to primitive

		Boolean a = true;
		Character b = '&';
		Integer c = 23;
		Double d = 3.14;
		String e = "Norvic";

		if (a == true){
			System.out.println("This is true");
		}

		else{
			System.out.println("This is false");
		}

		e = e.replace('v', 'b');
		System.out.println(e);
	}
}
