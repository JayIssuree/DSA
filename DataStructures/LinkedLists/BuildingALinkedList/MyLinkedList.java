class MyLinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    MyLinkedList(Object value){
        Node firstNode = new Node(value);
        this.assignHead(firstNode);
        this.assignTail(firstNode);
        this.length = 1;
    };

    Node getHead(){
        return this.head;
    };

    Node getTail(){
        return this.tail;
    };

    Integer getLength(){
        return this.length;
    };

    void assignHead(Node head){
        this.head = head;
    };

    void assignTail(Node tail){
        this.tail = tail;
    };

    void append(Object value){
        Node appendedNode = new Node(value);
        this.getTail().assignNext(appendedNode);
        this.assignTail(appendedNode);
        this.length++;
    };

    void prepend(Object value){
        Node prependedNode = new Node(value);
        prependedNode.assignNext(this.head);
        this.assignHead(prependedNode);
        this.length++;
    };

};