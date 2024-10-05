package Pattern_Question;

import java.util.Scanner;

public class Pattern_11 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
//	
          int val=1;
		for(int row=1;row<=n;row++) {
			for(int cst=1;cst<=row;cst++) {
				System.out.print(val+"\t");
				val++;
				
			}
			System.out.println();
		}

	}

}
