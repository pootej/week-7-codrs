import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = new int[5];
        
        System.out.print("Enter the index where you want to insert the element: ");
        int index = scanner.nextInt();
        System.out.print("Enter the value of the element: ");
        int value = scanner.nextInt();
      
        for (int i = numbers.length - 1; i > index; i--) {
            numbers[i] = numbers[i - 1];
        }
        
        numbers[index] = value;
      
        System.out.print("The updated array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}