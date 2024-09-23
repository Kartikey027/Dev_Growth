import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 integers ");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        if(a>b && a>c){
            System.out.println(a+" is greatest");
        }
        else if(b>c && b>a){
            System.out.println(b+" is greatest");

        }
        else{
            System.out.println(c+" is greatest");
        }
    }
}
