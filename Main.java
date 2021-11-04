import java.io.File;
import java.util.Scanner;
public class Main {
    private static String DEFAULT_FILE_NAME = "input.txt";

    public static void main(String[] args) {
        System.out.println("Hello World");
        String fileName;
        if (args.length != 0) {
            fileName = args[0];
        }
        else {
            fileName = DEFAULT_FILE_NAME;
        }
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
