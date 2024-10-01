package level_2_Pattern;

import java.util.Scanner;

public class Question_16_Pattern_4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=n;
		int space=0;
		for(int row=1;row<=n;row++) {
//			for(int cst=1;cst<=star;cst++) {
//				System.out.print("*\t");
//			}
			for(int csp=1;csp<=space;csp++) {
				System.out.print("\t");
			}
			for(int cst=1;cst<=star;cst++) {
				System.out.print("*\t");
			}
			star--;
			space++;
			System.out.println();
		}

	}

}
