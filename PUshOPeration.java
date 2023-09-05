package DSA_Package;
//JAVA program for Push Operation
import java.util.Scanner;
public class PUshOPeration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of the stack: ");
        int maxSize=scanner.nextInt();
        int[] stack=new int[maxSize];
        int top=-1;

        while (true) {
            System.out.println("Enter an element to push (Enter 000 to exit): ");
            int value = scanner.nextInt();
            if (value == 000) {
                break;
            }

            if (top == maxSize - 1) {
                System.out.println("!Stack Overflow! Stack is full ! Cannot push");
            } else {
                top++;
                stack[top] = value;
                System.out.println(value+"pushed onto the stack");
            }
        }
        System.out.println("Stack elements");
        for (int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
        while (true){
            System.out.println("Enter an element to pull  (Enter 0 to exit): ");
            int value1 = scanner.nextInt();
            if (value1 == 0) {
                break;
            }
            if (top==-1){
                System.out.println("Stack underflow !");
            }
            else if(top>=0){
                int poppedValue=stack[top];
                top--;
                System.out.println("Popped value is: "+poppedValue);
            }
            System.out.println("Pulled elements");
            for (int i=0;i<=top;i++){
                System.out.println(stack[i]);
            }
        }
        scanner.close();
    }
}
