import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c=0;
        System.out.println("Enter 2 integers ");
        a=in.nextInt();
        b=in.nextInt();
        if(a<b)
        {
            c=a+b;
        }
        else if(a>b){
            c=a-b;
        }
        else{
            c=a*b;
        }
        System.out.println(c);
    }
}
