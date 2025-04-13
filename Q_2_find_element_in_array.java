package DSA;

import java.util.Scanner;

public class Q_2_find_element_in_array {
	
	public static void main(String[] args) throws Exception{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int data =scn.nextInt();
		int ans=linearSearch(data,arr);
		System.out.println(ans);
	}
	
	public static int linearSearch(int data,int[]arr) {
		int idx=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==data) {
				idx=i;
			}
		}
		return idx;
	}
	

}
