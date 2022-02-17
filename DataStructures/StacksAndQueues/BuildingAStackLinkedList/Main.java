class Main {

    public static void main(String[] args){
        MyStack myStack = new MyStack();
        myStack.push(5);
        myStack.push(20);
        myStack.push("Hello World!");
        myStack.printAllValues();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.push("New World!");
        myStack.printAllValues();
    };

};