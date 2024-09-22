import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        String name, entry_no;
        System.out.println("Enter your name >>");
        name = in.nextLine();
        System.out.println("Enter your age >>");
        age = in.nextInt();
        System.out.println("Enter your entry number >>");
        entry_no = in.next();
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Entry number = " + entry_no);
    }
}
