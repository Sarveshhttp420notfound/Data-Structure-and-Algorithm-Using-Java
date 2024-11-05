package Array_Question;

import java.util.Scanner;

public class Question_48_Bar_Chart {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		barchart(arr);
		

	}
	
	public static void barchart(int[] arr) {
		int max=maximum(arr);
		for(int h=max;h>0;h--) {
			for(int ele:arr) {
				if(ele>=h) {
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			
			System.out.println();
		}
		
	}
	
	public static int maximum(int[] arr) {
		int max=-1;
		
		for(int ele:arr) {
			max=Math.max(ele,max);
		}
		return max;
	}

}
