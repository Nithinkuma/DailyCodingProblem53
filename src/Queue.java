import java.util.Stack;

public class Queue {
    private final Stack<Integer> stack1 = new Stack<>();
    private final Stack<Integer> stack2 = new Stack<>();

    public void push(int n){ //O(1)
            stack1.push(n);
    }

    public int pop(){ //O(n)
        if(stack1.isEmpty())
            return -1;
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int pop = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return pop;
    }
}

