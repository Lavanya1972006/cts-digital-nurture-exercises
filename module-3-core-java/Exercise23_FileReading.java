import java.io.*;
import java.util.*;

public class Exercise23_FileReading {
    public static void main(String[] args) {
         try {
            BufferedReader br =
                    new BufferedReader(new FileReader("output.txt"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}