package DSA;

import java.util.Scanner;

public class Q_6_first_index_and_last_index {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scn.nextInt();
		}
		int b=scn.nextInt();
		int fi=firstIndex(a, b)	;
		System.out.println(fi);
		
		int li=lastIndex(a, b);
		System.out.println(li);
		
	}
	
	public static int firstIndex(int[]a,int b) {
		int n=a.length;
		int i=0;
		int j=n-1;
		int fi=-1;
		while(i<=j) {
			int mid=i+j/2;
			if(a[mid]==b) {
				fi=mid;
				j=mid-1;
			}
			else if(a[mid]>b) {
				j=mid-1;
			}
			else {
				i=mid+1;
			}
		}
		
		return fi;
		
	}
	
	public static int lastIndex(int[]a,int b) {
		int n=a.length;
		int i=0;
		int j=n-1;
		int li=-1;
		while(i<=j) {
			int mid=i+j/2;
			if(a[mid]==b) {
				li=mid;
				i=mid+1;
			}
			else if(a[mid]>b) {
				j=mid-1;
			}
			else {
				i=mid+1;
			}
		}
		
		return li;
		
	}
	
	
	

}
