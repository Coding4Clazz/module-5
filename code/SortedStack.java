import java.util.Stack;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class demonstrates reading integer inputs from the user, 
 * storing them in a Stack, and then sorting the stack in ascending order.
 */
public class SortedStack {

    /**
     * Main method to execute the program.
     * It reads integers from the user, adds them to a temporary list,
     * sorts the list in ascending order, and pushes the sorted values onto the stack.
     * 
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a Stack to hold the integers
        Stack<Integer> numbersStack = new Stack<>();
        
        // Temporary list to store numbers before sorting
        List<Integer> tempList = new ArrayList<>();
        
        // Initialize Scanner to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a list of integers (enter 'q' to stop):");
        
        // Read input until the user types 'q'
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                // Add integer to the temporary list
                tempList.add(scanner.nextInt());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    // Stop input when user enters 'q'
                    break;
                } else {
                    System.out.println("Please enter a valid integer or 'q' to quit.");
                }
            }
        }
        
        // Sort the temporary list in ascending order
        Collections.sort(tempList);
        
        // Push the sorted elements onto the stack
        for (Integer num : tempList) {
            numbersStack.push(num);
        }
        
        // Print the sorted stack (the stack will retain sorted order)
        System.out.println("Sorted Stack: " + numbersStack);
        
        // Close the scanner to prevent resource leakage
        scanner.close();
    }
}
