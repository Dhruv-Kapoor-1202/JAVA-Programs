import java.util.Scanner;

class Rex {
	public int[] getArray() {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter size of Array: ");
		int size = obj.nextInt();
		
		System.out.print("Enter array elements: ");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = obj.nextInt();
		}
		return array;
	}
}
	
class Rexy  extends Rex {
	public int[] sortArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

}

class Raxist extends Rexy {
	public static void display(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
	}
	public static void main(String args[]) {
		Racist obj = new Racist();
		int array[] = obj.getArray();
		display(obj.sortArray(array));
	}
}
	
