public class ForEachLoop{

	public static void main(String[] args){

		// For-Each loop = "Enhanced For Loop", traversing technique to iterate through the elements in an array/collection
		// Less steps, more readable
		// Less flexible

		String[] band = {"Mark", "Adriel", "Brian", "Clint"};

		for(String i: band){
			System.out.println(i);
		}
	}
}
