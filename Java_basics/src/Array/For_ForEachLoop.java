package Array;

import java.util.Scanner;

public class For_ForEachLoop {

	public static void main(String[] args) {
//		float arr[]= {56.36f,54.36f,67,98,56};
//		System.out.println("Simple for loop");
//		for(int i=0;i<5;i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println("\nFor Each Loop");
//		for(float i:arr) {
//			System.out.println(i);
//		}
		int Arr[]= {10,20,30,40,50,60,70};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i<Arr.length;i++) {
			System.out.print(Arr[i]+" ");
		}
		for(int j=0;j<n;j++) {
			System.out.print(Arr[j]+" ");
		}

	}

}
