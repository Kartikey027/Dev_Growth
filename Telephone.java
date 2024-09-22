import java.util.Scanner;
public class Telephone {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String name;
        int min;
        double bill=0.0;
        System.out.println("Enter the name of the user and minutes ");
        name=in.next();
        min=in.nextInt();
        if(min<400)
        {
            bill=min*0.7;
        }
        else if(min<=600){
            bill=min*0.9;
        }
        else if(min>600){
         bill=min*1.2;
        }
        System.out.println("The bill of+ Mr."+" "+name+"is  "+bill);
    }
}
