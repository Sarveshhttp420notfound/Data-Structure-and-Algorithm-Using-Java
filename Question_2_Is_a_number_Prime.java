package Getting_Started;

import java.util.Scanner;

public class Question_2_Is_a_number_Prime {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int t=scn.nextInt();/* how many number tested*/
		
		for(int times=1;times<=t;times++) {
			int n =scn.nextInt();/* which number be tested ex--17,18,*/
			int factor=0;
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					factor++;
					/*if(factor==2) {
						break;
				     }*/
			     }
			}
			if(factor==1) {
				System.out.println("not prime");
			}
			else {
				System.out.println("prime");
			}
		}

	}

}
