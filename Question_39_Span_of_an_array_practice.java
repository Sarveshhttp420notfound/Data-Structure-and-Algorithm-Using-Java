package level_4_Array;

import java.util.Scanner;

public class Question_39_Span_of_an_array_practice {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans=span(arr);
		System.out.println(ans);

	}
	public static int span(int[] arr) {
		int max=Integer.MIN_VALUE; //+ infinity
		int min=Integer.MAX_VALUE; //+infinity
		for(int i=0;i<arr.length;i++) {
			int currentvalue=arr[i];
			if(currentvalue>max) {
				max=currentvalue;
			}
			if(currentvalue<min) {
				min=currentvalue;
			}
		}
		return max-min;
	}

}
