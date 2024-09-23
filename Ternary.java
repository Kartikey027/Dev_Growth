import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 integers");
        a=in.nextInt();//6
        b=in.nextInt();//5
        c=in.nextInt();//2
        int x=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println(x+" is greater of the three");
    }
}
