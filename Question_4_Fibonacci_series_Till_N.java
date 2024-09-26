package Getting_Started;

import java.util.Scanner;

public class Question_4_Fibonacci_series_Till_N {
//print 10 number fibonacci series------0 1 1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt(); //40
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
		}
		
	}

}
