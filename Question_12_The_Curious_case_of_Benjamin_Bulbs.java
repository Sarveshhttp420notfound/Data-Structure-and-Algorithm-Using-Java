package Getting_Started;

import java.util.Scanner;

public class Question_12_The_Curious_case_of_Benjamin_Bulbs {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i*i<=n;i++) {
			System.out.println(i*i);
		}

	}

}
