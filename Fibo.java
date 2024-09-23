import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        int a,b,c,n,i;
        Scanner in=new Scanner(System.in);
        a=0;
        b=1;
        System.out.println("Enter the value of n");
        n=in.nextInt();
        System.out.print("First "+n+" terms of fibonacci series are >> ");
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=2;i<n;i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
