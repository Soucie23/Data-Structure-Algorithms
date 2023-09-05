package DSA_Package;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String intput = scanner.nextLine();
        int length = intput.length();
        char[] charArray = intput.toCharArray();
        char[] stackArray = new char[length];
        int top = -1;

        for (int i = 0; i < length; i++) {
            if (top == length - 1) {
                System.out.println("Stack overflow !");
            } else {
                top++;
                stackArray[top] = charArray[i];
            }
        }
        for (int i = 0; i < length; i++) {
            if (top == -1) {
                System.out.println("Stack underflow !");
            } else {
                System.out.println(stackArray[top]);
                top--;
            }
        }
        scanner.close();
    }

}

