// check Two Matrices are equal or not
package Array_2DAssignment;

public class Five_5 {

	public static void main(String[] args) {
		int A[][]= {{1,2,3,4},{5,6,7,8}};
		int B[][]= {{1,2,3,4},{5,6,7,8}};
		
		for(int i=0;i<4;i++){    
			for(int j=0;j<4;j++){
				if (A[i][j]==B[i][j]) {
					System.out.print("Both arrays are Equal"); 
				}
				else {
					System.out.println("Arrays are not equal");
				}
			}
		}

	}

}
