package Getting_Started;

import java.util.Scanner;

public class Question_7_Reverse_a_number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int digit=0;
		while(n!=0) {
			digit=n%10;
			System.out.println(digit);
			n=n/10;
		}

	}

}
