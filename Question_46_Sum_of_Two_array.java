package level_4_Array;

import java.util.Scanner;

public class Question_46_Sum_of_Two_array {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n1=scn.nextInt();
		//First array
		int []a=new int [n1];
		for(int i=0;i<n1;i++) {
			a[i]=scn.nextInt();
		}
		//Second Array
		int n2=scn.nextInt();
		int [] b=new int [n2];
		for(int i=0;i<n2;i++) {
			b[i]=scn.nextInt();
		}
		
		sumoftwoarray(a,b);

	}
	
	public static void sumoftwoarray(int[]a,int[]b) {
		int n1=a.length;
		int n2=b.length;
		int size=n1>n2?n1:n2;
		int []c=new int[size];
		int carry=0;
		
		int i=n1-1;
		int j=n2-1;
		int k=size-1;
		
		while(k>=0) {
			int sum=carry;
			
			if(i>=0) {
				sum +=a[i];
			}
			if(j>=0) {
				sum +=b[j];
			}
			
			carry=sum/10;
			int val=sum%10;
			c[k]=val;
			
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
