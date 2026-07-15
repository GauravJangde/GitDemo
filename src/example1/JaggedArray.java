package example1;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][]= new int [3][];
		arr[0]=new int[] {3,4,2};
		arr[1]=new int[] {5,10};
		arr[2]=new int[] {7,5,3,6,1};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
