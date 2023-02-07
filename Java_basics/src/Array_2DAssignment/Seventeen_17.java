// the sparse matrix
package Array_2DAssignment;

public class Seventeen_17 {

	public static void main(String[] args) {
		int arr[][]= {{0,0,1,2},
				{0,2,4,0},
				{0,3,0,1},
				{0,0,0,1}};
		int L=0;
		int row[]=new int[L];
		int column[]=new int[L];
		int Value[]=new int [L];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if (arr[i][j]!=0) {
					L++;
				}
			}
		}
		
		int k = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if (arr[i][j]!=0) {
					row[k]=i;
					column[k]=j;
					Value[k]=arr[i][j];
					k++;
				}
			}
		}
		System.out.print("Row  "+" ");
		for(int i=0;i<L;i++) {
			System.out.print(row[i]+" ");
		}
		
		System.out.print("Column  "+" ");
		for(int i=0;i<L;i++) {
			System.out.print(column[i]+" ");
		}
		
		System.out.print("Value  "+" ");
		for(int i=0;i<L;i++) {
			System.out.print(Value[i]+" ");
		}
		

	}

}
