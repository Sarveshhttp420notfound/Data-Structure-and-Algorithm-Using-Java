package DSA;

import java.util.Scanner;

public class Q_4_Sum_of_two_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n1=scn.nextInt();
		int []a=new int[n1];
		for(int i=0;i<n1;i++) {
			a[i]=scn.nextInt();
		}
		int n2=scn.nextInt();
		int []b=new int[n2];
		for(int i=0;i<n2;i++) {
			b[i]=scn.nextInt();
		}
		
		sumArray(a,b);
		

	}

	/*
	 * a=[1.2,3,8] b=[1,2,7,9] output=[2,5,1,7]
	 */
	public static void sumArray(int [] a,int []b) {
		int n1=a.length;
		int n2=b.length;
		int size=n1>n2?n1:n2;
		int i=n1-1;
		int j=n2-1;
		int k=size-1;
		int [] c=new int [size];
		int carry=0;
		
		
		while(k>=0) {
			int sum=carry;
			
			if(i>=0) {
				sum +=a[i];
			}
			if (j>=0) {
				sum +=b[j];
			}
			 carry=sum/10;
			int value=sum%10;
			
			c[k]=value;
			i--;
			j--;
			k--;
			
		}
		
		if(carry>0) {
			System.out.println(carry);
		}
		
		for(int p=0;p<size;p++) {
			System.out.println(c[p]);
		}
		
	}
	

}
