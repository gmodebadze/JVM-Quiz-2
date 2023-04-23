import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utils {
    // Private constructor to prevent instantiation
    private Utils() {}

    public static int[] readIntegersFromFile(String fileName) throws FileNotFoundException, InvalidNumberException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        int[] arr = new int[10];
        int i = 0;
        while (scanner.hasNext()) {
            String str = scanner.next();
            try {
                int num = Integer.parseInt(str);
                if (num < 0) {
                    throw new InvalidNumberException("Negative number encountered: " + num);
                }
                arr[i++] = num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format: " + str);
            }
        }
        scanner.close();
        return arr;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            try {
                sum = Math.addExact(sum, num);
            } catch (ArithmeticException e) {
                System.out.println("Integer overflow occurred");
            }
        }
        return sum;
    }
}