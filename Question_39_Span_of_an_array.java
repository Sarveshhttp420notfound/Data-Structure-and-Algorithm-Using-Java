package level_4_Array;

import java.util.Scanner;

public class Question_39_Span_of_an_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {//how many number executed
			arr[i]=scn.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		int result=max-min;
		System.out.println(result);
		
		

	}

}
