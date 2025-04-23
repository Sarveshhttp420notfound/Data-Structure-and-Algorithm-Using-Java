package DSA;

import java.util.Scanner;

public class Q_1_Span_of_An_Array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int ans =span(arr);
		System.out.println(ans);
		

	}
	
	public static int span(int [] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int val=arr[i];
			if(val>max) {
				max=val;
			}
			 if(val<min) {
				min=val;
			}
		}
		
		
		
		return max-min;
		
	}

}
