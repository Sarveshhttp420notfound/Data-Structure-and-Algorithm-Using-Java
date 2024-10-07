package level_2_Pattern;

import java.util.Scanner;

public class Question_27_Pattern_15 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=n/2;
		int val=1;
		for(int row=1;row<=n;row++) {
			for(int csp=1;csp<=space;csp++) {
				System.out.print("\t");
				
			}
			int cval=val;
			
			for(int cst=1;cst<=star;cst++) {
				System.out.print(cval+"\t");
			
			
			if(cst<=star/2) {
				cval++;
			}else {
				cval--;
			}}
			
			if(row<=n/2) {
				space--;
				star +=2;
				val++;
			}
			else {
				space++;
				star -=2;
				val--;
			}

			System.out.println();
		}

	}

}
