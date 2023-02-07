// Add 2 Matrices
package Array_2DAssignment;

public class First_1 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3,4},{5,6,7,8}};
		int B[][]= {{1,2,3,4},{5,6,7,8}};
		int C[][]=new int[4][4];
		
		for(int i=0;i<4;i++){    
			for(int j=0;j<4;j++){    
			C[i][j]=A[i][j]+B[i][j];     
			System.out.print(C[i][j]+" ");    
			}
			System.out.println("\n");
		}
	}

}
