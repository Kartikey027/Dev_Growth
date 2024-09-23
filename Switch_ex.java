import java.util.*;
public class Switch_ex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double a,b,d=0.0;
        int ch,x;
        do{
            System.out.println("Enter 2 numbers >>");
        a=in.nextDouble();
        b=in.nextDouble();
        System.out.println("Enter 1>add 2>subtract 3>divide 4>multiply");
        ch=in.nextInt();
        switch(ch){
            case 1:d=a+b;
                break;
            case 2:d=a-b;
               break;
            case 3:d=a/b;
               break;
            case 4:d=a*b;
               break;
            default:System.out.println("Wrong input");
                
        }
        System.out.println(d);
        System.out.println("Enter 0 to exit");
        x=in.nextInt();
    }while(x!=0);
    }
}
