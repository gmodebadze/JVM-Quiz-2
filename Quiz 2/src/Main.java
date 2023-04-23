import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            int[] arr = Utils.readIntegersFromFile("\\\\localhost\\C$\\Users\\USER\\Desktop\\numbers.txt");
            int sum = Utils.getSum(arr);
            System.out.println("The sum of the numbers in the file is: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (InvalidNumberException e) {
            System.out.println("Invalid number encountered: " + e.getMessage());
        }
    }
}