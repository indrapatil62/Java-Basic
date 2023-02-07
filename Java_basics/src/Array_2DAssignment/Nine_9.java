//Interchange the diagonal element
package Array_2DAssignment;

public class Nine_9 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		int Major[]=new int[3];
		int Minor[]=new int[3];
		
		System.out.println("Before Interchanging diagonal array");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nMajor array :");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				if (i==j) {
					Major[i]=A[i][j];
					System.out.print(Major[i] +" ");
				}
			}
		}
		System.out.println("\n\nMinor array :");
		for(int i=0,j=2;i<=2 && j>=0;i++,j--) {
			Minor[i]=A[i][j];
			A[i][j]=Major[i];
			System.out.print(Minor[i]+ " ");
		}
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				if (i==j) {
					A[i][j]=Minor[i];
				}
			}
		}
		System.out.println("\n\nInterchanged diagonal array");
		for (int i=0;i<=2;i++) {
			for (int j=0;j<=2;j++) {
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
	}

}
