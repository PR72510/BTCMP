import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sol7 {
    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();
        stack.setSize(5);

        System.out.println(stack.getSize());
        System.out.println(stack.isEmpty());
        stack.push(5);
        stack.push(9);
        System.out.println("Stack pointer is at " +stack.getStack_pointer());
        stack.push(3);
        stack.push(7);
        stack.push(2);
        System.out.println(stack.getSpecialStack());
        System.out.println(stack.isFull());
        System.out.println("Stack pointer is at " +stack.getStack_pointer());
        stack.push(11);
        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.getSpecialStack());
        System.out.println("Stack pointer is at " +stack.getStack_pointer());
        System.out.println(stack.pop());


    }
}

class SpecialStack{
    private List<Integer> specialStack;
    private int size, stack_pointer;

    public SpecialStack() {
        this.stack_pointer = -1;
        this.specialStack = new ArrayList<>();
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public int getStack_pointer() {
        return stack_pointer;
    }

    public List<Integer> getSpecialStack() {
        return specialStack;
    }

    public boolean isEmpty(){
        return stack_pointer == -1;
    }

    public boolean isFull(){
        return stack_pointer == size-1;
    }

    public int push(int data){
        if(isFull()){
            System.out.println("Stack full, cannot insert");
            return -1;
        }
        specialStack.add(data);
        stack_pointer++;
        return 1;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return specialStack.remove(stack_pointer--);
    }



    public int getMin(){
        if(isEmpty()){
            return -1;
        }
        return Collections.min(specialStack);
    }
        }
