import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        fileReader("input.txt");
        calcutaltionTest();
    }
    private static void fileReader(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int counter = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                counter++;
                System.out.println("Obtained line number " + counter + " is = " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
