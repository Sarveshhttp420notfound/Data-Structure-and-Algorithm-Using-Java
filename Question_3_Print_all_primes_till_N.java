package Getting_Started;

import java.util.Scanner;

public class Question_3_Print_all_primes_till_N {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int low=scn.nextInt();
		int high=scn.nextInt();
		for(int n=low;n<=high;n++) {
			int factor=0;
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					factor++;
					break;
				}
			}
			if(factor==0) {
				System.out.println(n);
			}
		}

	}

}
