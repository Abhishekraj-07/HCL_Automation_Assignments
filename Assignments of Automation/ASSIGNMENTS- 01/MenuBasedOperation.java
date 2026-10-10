/*2	Write a menu driven program in Java to perform insertion, deletion, linear search, binary search, to find maximum value,
to count even/ odd and to perform insertion sort operation in one dimensional array. */

import java.util.Scanner;

public class MenuBasedOperation {
    public static void main(String[] args) {
        // Scanner is used to take input from the user.
        Scanner sc = new Scanner(System.in);

        // Array size is 100 so that new elements can be inserted later.
        int[] arr = new int[100];

        // n stores the current number of elements in the array.
        int n;

        // choice stores the menu option selected by the user.
        int choice;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        // n must be between 0 and 100 because the array size is 100.
        if (n < 0 || n > 100) {
            System.out.println("Invalid size. Please enter size between 0 and 100.");
            sc.close();
            return;
        }

        System.out.println("Enter " + n + " array elements:");

        // This loop reads the initial array elements from the user.
        // It stops automatically after taking n elements.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // do-while loop is used because the menu should display at least once.
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Linear Search");
            System.out.println("4. Binary Search");
            System.out.println("5. Find Maximum");
            System.out.println("6. Count Even and Odd");
            System.out.println("7. Insertion Sort");
            System.out.println("8. Display");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // switch is used to perform the operation selected by the user.
            switch (choice) {
                case 1:
                    // Insertion means adding a new element at a given position.
                    if (n == 100) {
                        System.out.println("Array is full. Insertion is not possible.");
                        break;
                    }

                    System.out.print("Enter element to insert: ");
                    int value = sc.nextInt();

                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    // Position starts from 1 for easy understanding.
                    if (pos < 1 || pos > n + 1) {
                        System.out.println("Invalid position.");
                    } else {
                        // Shift elements one position to the right to create empty space.
                        for (int i = n; i >= pos; i--) {
                            arr[i] = arr[i - 1];
                        }

                        // Store the new value at the required position.
                        arr[pos - 1] = value;

                        // Increase array size after insertion.
                        n++;
                        System.out.println("Element inserted.");
                    }
                    break;

                case 2:
                    // Deletion means removing an element from a given position.
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();

                    if (pos < 1 || pos > n) {
                        System.out.println("Invalid position.");
                    } else {
                        // Shift elements one position to the left to fill the deleted place.
                        for (int i = pos - 1; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        // Decrease array size after deletion.
                        n--;
                        System.out.println("Element deleted.");
                    }
                    break;

                case 3:
                    // Linear search checks each element one by one.
                    System.out.print("Enter element to search: ");
                    value = sc.nextInt();

                    // found is used like a flag: 0 means not found, 1 means found.
                    int found = 0;
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == value) {
                            System.out.println("Element found at position " + (i + 1));
                            found = 1;
                            break;
                        }
                    }

                    if (found == 0) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 4:
                    // Binary search works only on a sorted array.
                    // So first we sort the array using insertion sort.
                    for (int i = 1; i < n; i++) {
                        int key = arr[i];
                        int j = i - 1;

                        // Move bigger elements one position ahead.
                        while (j >= 0 && arr[j] > key) {
                            arr[j + 1] = arr[j];
                            j--;
                        }

                        // Place key at its correct position.
                        arr[j + 1] = key;
                    }

                    System.out.print("Enter element to search: ");
                    value = sc.nextInt();

                    // low and high represent the searching range.
                    int low = 0;
                    int high = n - 1;
                    found = 0;

                    while (low <= high) {
                        // mid is the middle position of the current range.
                        int mid = (low + high) / 2;

                        if (arr[mid] == value) {
                            System.out.println("Element found at position " + (mid + 1));
                            found = 1;
                            break;
                        } else if (arr[mid] < value) {
                            // Search in the right half.
                            low = mid + 1;
                        } else {
                            // Search in the left half.
                            high = mid - 1;
                        }
                    }

                    if (found == 0) {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    if (n == 0) {
                        System.out.println("Array is empty.");
                        break;
                    }

                    // Assume the first element is maximum.
                    int max = arr[0];
                    // Compare each element with max and update max if a bigger value is found.
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Maximum value: " + max);
                    break;

                case 6:
                    // even stores the count of even numbers and odd stores the count of odd numbers.
                    int even = 0;
                    int odd = 0;

                    for (int i = 0; i < n; i++) {
                        // A number is even if it is completely divisible by 2.
                        if (arr[i] % 2 == 0) {
                            even++;
                        } else {
                            odd++;
                        }
                    }

                    System.out.println("Even numbers: " + even);
                    System.out.println("Odd numbers: " + odd);
                    break;

                case 7:
                    // Insertion sort arranges the array in ascending order.
                    for (int i = 1; i < n; i++) {
                        // key is the element that we want to place at the correct position.
                        int key = arr[i];
                        int j = i - 1;

                        // Shift all elements greater than key to the right side.
                        while (j >= 0 && arr[j] > key) {
                            arr[j + 1] = arr[j];
                            j--;
                        }

                        // Insert key at its correct position.
                        arr[j + 1] = key;
                    }
                    System.out.println("Array sorted.");
                    break;

                case 8:
                    // Display all current elements of the array.
                    System.out.print("Array elements: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 9:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);

        // Close Scanner after all input work is complete.
        sc.close();
    }
}
