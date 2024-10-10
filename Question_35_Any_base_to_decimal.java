package level_3_Functions;

import java.util.Scanner;

public class Question_35_Any_base_to_decimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int d=scn.nextInt();
		int f=getValueInBase(n,d);
		System.out.println(f);

	}
	
	public static int getValueInBase(int n,int d) {
		int rv=0;
		int p=1;
		while(n>0) {
			int digit=n%d;
			rv+=digit*p;
			p=p*10;
			n=n/8;
			
		}
		return rv;
	}

}
