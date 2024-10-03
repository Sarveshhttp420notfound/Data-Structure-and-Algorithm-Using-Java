package level_2_Pattern;

import java.util.Scanner;

public class Question_18_Pattern_6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt(); //5
		int star=n/2 + 1;
		int space=1;
		
		for(int row=1;row<=n;row++) {
			for(int cst=1;cst<=star;cst++) {
				System.out.print("*\t");
			}
			for(int csp=1;csp<=space;csp++) {
				System.out.print("\t");
			}
			
			for(int cst=1;cst<=star;cst++) {
				System.out.print("*\t");
			}
			System.out.println();
			if(row<=n/2) {
				star -=1;
				space +=2;
			}
			else {
				star +=1;
				space -=2;
			}
			
//			System.out.println();
		}
		

	}

}
