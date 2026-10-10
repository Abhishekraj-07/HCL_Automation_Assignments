/*1	A class sixth student required to solve basic mathematics problems. For this he/ she needs to perform operations 
  such as addition, subtraction, multiplication, division, remainder, square, cube, and absolute. Write a program 
  using methods to perform these basic operations.*/

public class BasicOperations {

    // This method adds two numbers and returns the result.
    static int add(int a, int b) {
        return a + b;
    }

    // This method subtracts the second number from the first number.
    static int subtract(int a, int b) {
        return a - b;
    }

    // This method multiplies two numbers.
    static int multiply(int a, int b) {
        return a * b;
    }

    // This method divides the first number by the second number.
    static double divide(int a, int b) {
        // Division by zero is not allowed in mathematics.
        if (b == 0) {
            System.out.println("Division by zero is not possible.");
            return 0;
        }

        // Type casting is used to get the answer in decimal form.
        return (double) a / b;
    }

    // This method finds the remainder after division.
    static int remainder(int a, int b) {
        // Remainder by zero is also not possible.
        if (b == 0) {
            System.out.println("Remainder by zero is not possible.");
            return 0;
        }
        return a % b;
    }

    // This method returns the square of a number.
    static int square(int number) {
        return number * number;
    }

    // This method returns the cube of a number.
    static int cube(int number) {
        return number * number * number;
    }

    // This method returns the absolute value of a number.
    // Absolute value means the positive value of a number.
    static int absolute(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }

    public static void main(String[] args) {
        // These are sample numbers used to perform basic operations.
        int firstNumber = 20;
        int secondNumber = 6;
        int negativeNumber = -15;

        // Display the original numbers.
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        // Call each method and display its result.
        System.out.println("Addition: " + add(firstNumber, secondNumber));
        System.out.println("Subtraction: " + subtract(firstNumber, secondNumber));
        System.out.println("Multiplication: " + multiply(firstNumber, secondNumber));
        System.out.println("Division: " + divide(firstNumber, secondNumber));
        System.out.println("Remainder: " + remainder(firstNumber, secondNumber));
        System.out.println("Square of first number: " + square(firstNumber));
        System.out.println("Cube of second number: " + cube(secondNumber));
        System.out.println("Absolute value of " + negativeNumber + ": " + absolute(negativeNumber));
    }
}
