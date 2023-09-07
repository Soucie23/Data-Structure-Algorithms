package Queue;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class DynamicStack {
    private final LinkedList<Integer>stackList;
    public DynamicStack(){ //constructor
        stackList= new LinkedList<Integer>(); //initialize
    }
    public void push(int item){
        stackList.add(item);
    }
    public int pop(){
        if (isEmpty()){
            return 0;
        }
        int lastIndex=stackList.size()-1;
        int poppedItem=stackList.get(lastIndex);
        stackList.remove(lastIndex);
        return poppedItem;
    }
    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size()-1);
    }
    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    public int size(){
        return stackList.size();
    }

    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        try{
            System.out.println("Popped: "+stack.pop());
            System.out.println("Popped: "+stack.pop());
        }
        catch (EmptyStackException e){
            System.out.println("Error: Stack is empty");
        }
        try{
            System.out.println("Top Element: "+stack.peek());
        }
        catch (EmptyStackException e){
            System.out.println("Error: Stack is empty");
        }
        System.out.println("Is stack empty? "+stack.isEmpty());
        System.out.println("Stack size: "+stack.size());
    }
}
