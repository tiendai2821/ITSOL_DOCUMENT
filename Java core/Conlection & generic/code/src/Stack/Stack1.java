package Stack;
import java.io.*;
import java.util.*;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {

            // Creating an empty Stack
            Stack<String> stack = new Stack<>();
            // Use push() to add elements into the Stack
            stack.push("Welcome");
            stack.push("To");
            stack.push("shareprogramming");
            // Displaying the Stack
            System.out.println("Initial Stack: " + stack);
            // Pushing elements into the stack
            stack.push("Hello");
            stack.push("World");
            // Displaying the final Stack
            System.out.println("Final Stack: " + stack);

            // Delete Element
        System.out.println("Pop: " + stack.pop());

    }
}
