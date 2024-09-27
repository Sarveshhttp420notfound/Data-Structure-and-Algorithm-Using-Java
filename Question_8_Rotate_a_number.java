package Getting_Started;

import java.util.Scanner;

public class Question_8_Rotate_a_number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int temp=n;
		int digit=0;
		
		while(temp!=0) {
			temp=temp/10;
			digit++;
		}
		k=k%digit;
		if(k<0) {
			k=k+digit;
		}
		
		int pow=(int)Math.pow(10,k);
		int left=n/pow;
		int right=n%pow;
		
		int mul=(int)Math.pow(10,digit-k);
		
		int ans=right*mul+left;
		System.out.println(ans);
	}

}
