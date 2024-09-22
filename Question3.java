import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = 0.0;
        int area;
        System.out.println("Enter the radius of Circle");
        radius = in.nextDouble();
        area = (int) (3.14 * radius * radius);
        System.out.println("The area is " + area);

    }
}
