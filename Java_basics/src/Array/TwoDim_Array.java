package Array;

public class TwoDim_Array {

	public static void main(String[] args) {
		int Numbers[][] = new int[2][2];
		
		Numbers[0][0]=0;
		Numbers[0][1]=2;
		Numbers[1][0]=3;
		Numbers[1][1]=4;
		
		int r,c;
		for (r=0;r<2;r++) {
			for(c=0;c<2;c++) {
				System.out.print(Numbers[r][c]+"\t");
			}
			System.out.println("\n");
		}

	}

}
