import java.util.*;
public class MaxOf5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int[] numbers = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        for(int i = 1; i < 5; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The maximum of the 5 numbers is: " + max);
        sc.close();
    }
}
