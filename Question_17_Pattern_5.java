package level_2_Pattern;

import java.util.Scanner;

public class Question_17_Pattern_5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=n/2;
		for(int row=1;row<=n;row++) {
			for (int csp=1;csp<=space;csp++) {
				System.out.print("\t");
			}
			
			for(int cst=1;cst<=star;cst++) {
				System.out.print("*\t");
			}
			if(row<=n/2) {
				star=star+2;
				space--;
			}
			else {
				star=star-2;
				space++;
			}
			
			System.out.println();
		}

	}

}
