
public class Array {

	public static void main(String[] args) {

		int[] myArray = {2, 4, 5, 6, 7};
		
		for(int j : myArray) {
			System.out.print(j+" ");
		}
		System.out.println("\n");
		
		//Reversing an array
		for(int i=myArray.length-1; i>=0; i--) {
			System.out.print(myArray[i]+" ");
		}
	}

}
