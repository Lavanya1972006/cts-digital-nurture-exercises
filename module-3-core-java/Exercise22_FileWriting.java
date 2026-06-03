import java.io.*;
import java.util.*;

public class Exercise22_FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Text: ");
            String text = sc.nextLine();

            FileWriter fw = new FileWriter("output.txt");
            fw.write(text);
            fw.close();

            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println("Error writing file.");
        }

        sc.close();
    }
}