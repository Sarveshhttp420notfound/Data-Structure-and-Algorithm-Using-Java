package level_2_Pattern;

import java.util.Scanner;

public class Question_22_Pattern_10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int os=n/2;
		int is= -1;
		
		for(int row=1;row<=n;row++) {
			for(int csp=1;csp<=os;csp++) {
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int csp=1;csp<=is;csp++) {
				System.out.print("\t");
			}
			if(row>1&&row<n) {
				System.out.print("*\t");
			}
			System.out.println();
			if(row<=n/2) {
				os--;
				is +=2;
			}
			else {
				os++;
				is -=2;
			}
		}

	}

}
