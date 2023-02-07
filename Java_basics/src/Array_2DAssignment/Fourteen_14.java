// Transpose of matrix
package Array_2DAssignment;

public class Fourteen_14 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},
			    {4,5,6},
			    {7,8,9}};
		int B[][]=new int[3][3];
		
		System.out.println("Original Matrix :");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				B[j][i]=A[i][j];
			}
		}
		
		System.out.println("\nTranspose matrix of A :");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}

	}

}
