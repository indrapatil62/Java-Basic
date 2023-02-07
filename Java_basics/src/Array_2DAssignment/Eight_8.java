//sum of each row and column
package Array_2DAssignment;

public class Eight_8 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		for (int i=0;i<=2;i++) {
			int sum=0;
			for (int j=0;j<=2;j++) {
				sum+=A[i][j];
			}
			System.out.println("Addition of Row "+i+ "="+sum);
		}
		for (int i=0;i<=2;i++) {
			int sum=0;
			for (int j=0;j<=2;j++) {
				sum+=A[j][i];
			}
			System.out.println("Addition of Column "+i+ "="+sum);
		}

	}

}
