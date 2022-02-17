class Main {

    public static void main(String[] args){
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(50);
        myQueue.dequeue();
        myQueue.enqueue(25);
        myQueue.enqueue(30);
        myQueue.enqueue(35);
        myQueue.enqueue(40);
        myQueue.enqueue(45);
        System.out.println(myQueue.peek().getValue());
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.printAllValues();
    };

}