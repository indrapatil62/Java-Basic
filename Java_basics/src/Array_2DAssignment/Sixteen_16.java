//Identity Matrix
package Array_2DAssignment;

public class Sixteen_16 {

	public static void main(String[] args) {
		int arr[][]=new int[3][3];
		
		System.out.println("Identity Matrix is :");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				if(i==j) {
					System.out.print((arr[i][j]=1)+" ");
				}
				else {
					System.out.print((arr[i][j]=0)+" ");
				}
			}
			System.out.println();
		}

	}

}
