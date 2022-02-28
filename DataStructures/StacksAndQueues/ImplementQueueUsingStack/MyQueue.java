import java.util.ArrayList;

class MyQueue {

    ArrayList<Integer> stack1;
    ArrayList<Integer> stack2;

    public static void main(String[] args){
        MyQueue test = new MyQueue();
        test.push(1);
        test.push(2);
        test.push(3);
        System.out.println(test.pop());
        System.out.println(test.pop());
        test.push(4);
        test.push(5);
        System.out.println(test.pop());
        test.push(6);
        System.out.println(test.pop());
        test.push(7);
        System.out.println(test.peek());

    };

    public MyQueue(){
        stack1 = new ArrayList<Integer>();
        stack2 = new ArrayList<Integer>();
    };

    public void push(int num){
        while(!stack2.isEmpty()){
            stack1.add(stack2.remove(stack2.size() - 1));
        };
        stack1.add(num);
    };

    public int pop(){
        while(!stack1.isEmpty()){
            stack2.add(stack1.remove(stack1.size() - 1));
        };
        return stack2.remove(stack2.size() - 1);
    };

    public int peek(){
        if(!stack1.isEmpty()){
            return stack1.get(0);
        };
        return stack2.get(stack2.size() - 1);
    };

    public boolean empty(){
        return stack1.isEmpty() && stack2.isEmpty();
    };

};