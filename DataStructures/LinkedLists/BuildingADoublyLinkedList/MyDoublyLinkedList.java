class MyDoublyLinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    MyDoublyLinkedList(Object value){
        Node startingNode = new Node(value);
        this.setHead(startingNode);
        this.setTail(startingNode);
        this.length = 1;
    };

    Node getHead(){
        return this.head;
    };

    void setHead(Node headNode){
        this.head = headNode;
    };

    Node getTail(){
        return this.tail;
    };

    void setTail(Node tailNode){
        this.tail = tailNode;
        tailNode.setNext(null);
    };

    Integer getLength(){
        return this.length;
    };

    void printAllValues(){
        Node currentNode = this.getHead();
        for(int i = 0; i < this.getLength(); i++){
            System.out.println(currentNode.getValue());
        };
    };

};