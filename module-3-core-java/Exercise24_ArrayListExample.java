import java.util.*;

public class Exercise24_ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter Name: ");
            names.add(sc.nextLine());
        }

        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }

    }
}