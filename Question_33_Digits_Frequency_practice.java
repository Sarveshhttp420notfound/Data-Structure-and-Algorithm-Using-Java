package level_3_Functions;

import java.util.Scanner;

public class Question_33_Digits_Frequency_practice {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int f=getdigitfrequency(n,d);
		System.out.println(f);

	}
	
	public static int getdigitfrequency(int n,int d) {
		int number=0;
		while(n>0) {
			int remainder=n%10;
			if(d==remainder) {
				number++;
			}
			n=n/10;
		}
		return number;
	}

}
