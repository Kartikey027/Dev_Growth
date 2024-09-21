import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter your name >>");
        name=in.nextLine();
        System.out.println("Enter your age >>");
        age=in.nextInt();
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
}
