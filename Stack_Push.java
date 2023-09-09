package Practice;

import java.util.Scanner;

public class Stack_Push {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int maxSize = scanner.nextInt();
        int[] stack = new int[maxSize];
        int top = -1;
        while (true) {
            System.out.println("Enter elements to push or 0 to exit"); // Changed from 000 to 0
            int value = scanner.nextInt();
            if (value == 0) { // Changed from 000 to 0
                break;
            }
            if (top == maxSize - 1) {
                System.out.println("Stack overflow");
            } else {
                top++;
                stack[top] = value;
                System.out.println("Pushed elements are: " + value);
            }
            System.out.println("Stack elements are: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
        scanner.close();
    }
}
