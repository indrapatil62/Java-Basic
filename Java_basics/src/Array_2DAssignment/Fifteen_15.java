//Find Determinant of matrix
package Array_2DAssignment;

public class Fifteen_15 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},
			    {4,5,6},
			    {7,8,9}};
		int X=0,Y=0,Z = 0;
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				X=(A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1]));
				Y=(A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0]));
				Z=(A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]));
			}
		}
		System.out.println("Determinant of Matrix A is :"+(X+Y-Z));

	}

}
