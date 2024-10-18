package level_4_Array;

import java.util.Scanner;

public class Question_42_Find_element_in_an_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		
		int []arr=new int [n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		
		int compare=scn.nextInt();
		
		int ans =getElement(compare,arr);
		System.out.println(ans);
	}
	
	public static int getElement(int compare,int[] arr) {
		int idx=-1;
		for(int i=0;i<arr.length;i++) {
			if(compare==arr[i]) {
				idx=i;
			}
		}
		return idx;
	}

}
