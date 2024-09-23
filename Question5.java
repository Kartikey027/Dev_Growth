import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int year;
        System.out.println("Enter the Year to check");
        year=in.nextInt();
        if(year % 400 == 0){
            System.out.println(year+" is a Leap Year!!");
        }
        else if(year%4==0 && year%100!=0){
            System.out.println(year+" is a Leap Year!!");
        }
        else{
            System.out.println(year+" is not a Leap Year!!");
        }
    }
}
