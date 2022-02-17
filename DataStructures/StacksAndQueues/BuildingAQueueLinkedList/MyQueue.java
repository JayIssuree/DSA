class MyQueue {

    private Node first;
    private Node last;
    private Integer length;

    MyQueue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    };

    Node peek(){
        return this.first;
    };

    Node enqueue(Object value){
        Node newNode = new Node(value);
        if(this.isEmpty()){
            this.first = newNode;
            this.last = newNode;
        } else {
            this.last.setNext(newNode);
            this.last = newNode;
        };
        this.length++;
        return newNode;
    };

    Node dequeue(){
        if(this.isEmpty()){
            return null;
        };
        Node oldHead = this.first;
        this.first = oldHead.getNext();
        oldHead.setNext(null);
        this.length--;
        if(this.isEmpty()){
            this.last = null;
        };
        return oldHead;
    };

    Boolean isEmpty(){
        if(this.first == null){
            return true;
        };
        return false;
    };

    void printAllValues(){
        Node currentNode = this.first;
        while(currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        };
    };

};