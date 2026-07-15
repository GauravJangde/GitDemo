package example1;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		
		int arr[][] = new int [3][4];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
//		int tmp[]= {2,5,4,1};
//		for(int temp:tmp) {
//			System.out.println(temp);
//		}

		
	}

}
