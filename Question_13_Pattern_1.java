package level_2_Pattern;

import java.util.Scanner;

public class Question_13_Pattern_1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=n-1;
		
		for(int row=1;row<=n;row++) {
			for(int cst=1;cst<=star;cst++) {
				System.out.print("*\t");
			}
			for(int csp=1;csp<=space;csp++) {
				System.out.print("\t");
			}
			star++;
			space--;
			System.out.println();
			
		}

	}

}
