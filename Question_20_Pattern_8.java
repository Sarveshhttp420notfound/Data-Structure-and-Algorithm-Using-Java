package level_2_Pattern;

import java.util.Scanner;

public class Question_20_Pattern_8 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=n-1;
		for(int i=1;i<=n;i++) {
			for(int csp=1;csp<=space;csp++) {
				System.out.print("\t");
			}
			for(int cst=1;cst<=star;cst++) {
				System.out.print("*\t");
			}
			System.out.println();
//			for(int csp=1;csp<=space;csp++) {
//				System.out.print("\t");
//			}
			space--;
		}

	}

}