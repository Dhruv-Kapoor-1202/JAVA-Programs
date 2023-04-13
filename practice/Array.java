import java.util.Arrays;

class Array {

	public static void main(String[] args) {
			
		int[] numbers = new int[5];
		numbers[0] = 1;
		numbers[1] = 2;
		//numbers[10] = 3; //this will raise an exception
		//System.out.println(numbers)  // this will return weird value, I think the address?, idk.
		//So we use the Arrays class and its methods
		
		//Method Over-loading
		System.out.println(Arrays.toString(numbers));
	}
}

