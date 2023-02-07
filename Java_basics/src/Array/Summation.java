package Array;

import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		int Average[]=new int[10];
		int sum=0;
		float avg;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements");
		
		for(int c=0;c<10;c++) {
			Average [c]=sc.nextInt();	
		}
		for(int c=0;c<10;c++) {
			sum+=Average[c];	
		}
		avg=sum/10.0f;
		System.out.println("Summation of array is "+sum);
		System.out.println("Average of array is "+avg);
		sc.close();  // this is opt statement for remove the problem of closing the obj.

	}

}
