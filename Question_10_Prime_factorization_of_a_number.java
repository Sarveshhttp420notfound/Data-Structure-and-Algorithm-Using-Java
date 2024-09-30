package Getting_Started;

import java.util.Scanner;

public class Question_10_Prime_factorization_of_a_number {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=2;i*i<=n;i++) {
			//while(n%i!=0) {
				
			while(n%i==0) {
				n=n/i;
				System.out.println(i);
				break;
				
			}
		}
         
		if(n!=1) {
			System.out.println(n);
		}
	}

}
