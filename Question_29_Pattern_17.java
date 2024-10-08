package level_2_Pattern;

import java.util.Scanner;

public class Question_29_Pattern_17 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star= 1;
		int space=2 ;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				if(i==n/2+1) {
					System.out.print("*\t");
				}
				else {
					System.out.print("\t");
				}
				System.out.print("\t");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*\t");
			}
//			star++;
			if( i<=n/2) {
				star++;
			}
			else {
				star--;
			}
			
			System.out.println();
			
		}

	}

}
