package level_2_Pattern;

import java.util.Scanner;

public class Question_23_Pattern_12 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0;
		int b=1;
		for(int row=1;row<=n;row++) {
			for(int fib=1;fib<=row;fib++) {
				System.out.print(a+"\t");
				int c=a+b;
				a=b;
				b=c;
			}
			System.out.println();
		}

	}

}
