package DSA_Package;

import java.util.Scanner;

public class Switch_Push_Pull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int maxSize = scanner.nextInt();
        int stack[] = new int[maxSize];
        int top = -1;
        while (true) {
            System.out.println("Choose operation");
            System.out.println("1.Push");
            System.out.println("2. Pull");
            System.out.println("3. Review Stack");
            System.out.println("4. EXit");
            System.out.println("Enter the choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the elements to push");
                    int value = scanner.nextInt();

                    if (top == maxSize - 1) {
                        System.out.println("Stack overflow");
                    } else {
                        top++;
                        stack[top] = value;
                        System.out.println(value + " " + "pushed onto the back");
                    }
                    break;
                case 2:
                    if (top == -1) {
                        System.out.println("Stack underflow !");
                    } else {
                        int poppedValue = stack[top];
                        top--;
                        System.out.println(poppedValue + " " + "popped from the stack");
                    }
                    break;
                case 3:
                    System.out.println("Stack elements");
                    for (int i = top; i >= 0; i--) {
                        System.out.println(stack[i]);
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice !");
            }
        }
    }
}
