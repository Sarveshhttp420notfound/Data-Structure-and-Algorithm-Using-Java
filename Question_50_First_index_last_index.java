package Array_Question;

import java.util.Scanner;

public class Question_50_First_index_last_index {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int a=scn.nextInt();
		int fi=firstindex(arr,a);
		System.out.println(fi);
		int li=lastindex(arr,a);
		System.out.println(li);
	}
	
	
	public static int firstindex(int[] arr,int a) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		int fi=-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(arr[mid]==a) {
				 fi=mid;
				j=mid-1;
			}
			else if(arr[mid]<a) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
		}
		return fi;
	}
	
	public static int lastindex(int[] arr,int a) {
		int n=arr.length;
		int i=0;
		int j=n-1;
		int li=-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(arr[mid]==a) {
				li=mid;
				i=mid+1;
			}
			else if(arr[mid]<a) {
				i=mid+1;
			}
			
			else {
				j=mid-1;
			}
		}
		
		return li;
	}

}
