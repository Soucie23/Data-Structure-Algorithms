package DSA_Package;
public class PullOperation {
    public static void main(String[] args) {
    int[] stack={1,2,3,4,5};
    int top=stack.length-1;
        System.out.println("Stack elements before pop operations: ");
        for (int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
        while (top>=0){
            int poppedTop=stack[top];
            top--;
            System.out.println(poppedTop+" "+"popped from the stack");
        }
        if(top==-1){
            System.out.println("Stack underflow !");
        }
    }
}
