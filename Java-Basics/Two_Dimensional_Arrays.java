public class Two_Dimensional_Arrays{

	public static void main(String[] args){

		// 2D => An array of arrays

		String[][] browsers = new String[3][3];

		browsers[0][0] = "Chrome";
		browsers[0][1] = "Edge";
		browsers[0][2] = "Safari";
		browsers[0][2] = "Firefox";
		browsers[1][0] = "DuckDuckGo";
		browsers[1][1] = "Opera";
		browsers[1][2] = "Brave";
		browsers[2][0] = "Vivaldi";
		browsers[2][1] = "Epic";
		browsers[2][2] = "Jawili";	// Just kidding

		for(int i = 0; i < browsers.length; i++){
			System.out.println();

			for(int j = 0; j < browsers[i].length; j++){
				System.out.print(browsers[i][j]+" ");
			}
		}

		// Alternate for this is;

		System.out.println("\n");

		String[][] names = {{"Dodong", "Jav", "Rico"},
			{"Jawili", "Nash", "Graham"},
			{"Kobe", "Joey", "Joey Jr."}
		};
		
		for(int k = 0; k < names.length; k++){
			System.out.println();

			for(int l = 0; l < names[k].length; l++){
				System.out.print(names[k][l]+" ");
			}
		}
	}
}
