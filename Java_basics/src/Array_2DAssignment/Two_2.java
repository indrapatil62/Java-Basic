// Subtract Two Matrices
package Array_2DAssignment;

public class Two_2 {

	public static void main(String[] args) {
		int A[][]= {{5,6,7,8},{5,6,7,8}};
		int B[][]= {{1,2,3,4},{1,2,3,4}};
		int C[][]=new int[4][4];
		
		for(int i=0;i<4;i++){    
			for(int j=0;j<4;j++){    
			C[i][j]=A[i][j]-B[i][j];     
			System.out.print(C[i][j]+" ");    
			}
			System.out.println("\n");
		}

	}

}
