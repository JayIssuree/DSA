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

    void prepend(Object value){
        Node prependedNode = new Node(value);
        this.getHead().setPrevious(prependedNode);
        prependedNode.setNext(this.getHead());
        this.setHead(prependedNode);
        this.length++;
    };

    void append(Object value){
        Node appendedNode = new Node(value);
        appendedNode.setPrevious(this.getTail());
        this.getTail().setNext(appendedNode);
        this.setTail(appendedNode);
        this.length++;
    };

    void printAllValues(){
        Node currentNode = this.getHead();
        for(int i = 0; i < this.getLength(); i++){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        };
    };

};