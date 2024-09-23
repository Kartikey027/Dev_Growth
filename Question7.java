import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double income,tax=0.0;
        System.out.println("Enter your annual income >>");
        income=in.nextDouble();
        if(income <=300000){
            tax=income*5/100;
        }
        else if(income <=700000){
            tax=(300000*0.05)+(income-300000)*0.1;
        }
        else if(income<=1500000){
            tax=(300000*0.05)+(400000*0.1)+(income-700000)*0.2;
        }
        else{
            tax=(300000*0.05)+(400000+0.1)+(800000*0.2)+(income-1500000)*0.3;
        }
        System.out.println("Tax = "+tax);
    }
}
