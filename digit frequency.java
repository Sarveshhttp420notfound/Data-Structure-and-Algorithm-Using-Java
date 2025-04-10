import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt(); //large number like 123455
        int d=scn.nextInt(); //searching no.
        
        int f=getresult(n,d);
        System.out.println(f);
    }
    
    public static int getresult(int n,int d){
        int ans=0;
        while(n!=0){
           int c=n%10;
            if(d==c){
                ans++;
            }
            n=n/10;
        }
        return ans;
    }
    
}