//find the sum of minor diagonal elements of a matrix
package Array_2DAssignment;

public class Seven_7 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int Diagonal=0;
		int n=3;
		System.out.println("Minor elements of diagonal is :");
		for(int i=0,j=2;i<=2&&j>=0;i++,j--)
	     {
	          Diagonal+=A[i][j];
	          System.out.println(A[i][j]);
	     }
		System.out.println("Sum of Minor Diagonal element of an array is :"+Diagonal);
	}

}
