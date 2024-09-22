import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a1, a2, a3, a4, a5;
        System.out.println("Enter 5 numbers >>");
        a1 = in.nextInt();
        a2 = in.nextInt();
        a3 = in.nextInt();
        a4 = in.nextInt();
        a5 = in.nextInt();
        double avg = (a1 + a2 + a3 + a4 + a5) / 5;
        System.out.println("Average of the numbers is >> " + avg);

    }

}
