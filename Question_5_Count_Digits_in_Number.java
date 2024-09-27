package Getting_Started;

import java.util.*;

public class Question_5_Count_Digits_in_Number {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int digit=0;
	while(n!=0) {
		n=n/10;
		digit++;
	}
	System.out.println(digit);
	}

}
