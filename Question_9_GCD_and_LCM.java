package Getting_Started;

import java.util.Scanner;

public class Question_9_GCD_and_LCM {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n1=scn.nextInt();
		int n2=scn.nextInt();
		
		int o11=n1;//take another variable to not destroy original one.
		int o22=n2;
		
		while(n1%n2!=0) {
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n2;
		int lcm=(o11*o22)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
		
	}

}
