// sum of diagonal elements matrix
package Array_2DAssignment;

public class Six_6 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int Diagonal=0;
		int n=3;
		System.out.println("Major elements of diagonal is :");
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i==j) {
					Diagonal+=A[i][j];
					System.out.println(A[i][j]);
				}
			}
		}
		System.out.println("Sum of Major Diagonal element of an array is :"+Diagonal);
		
	}

}
