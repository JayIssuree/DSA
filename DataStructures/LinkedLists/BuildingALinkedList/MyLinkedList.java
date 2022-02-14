class MyLinkedList {

    private Node head;
    private Node tail;
    private Integer length;

    MyLinkedList(Object value){
        Node firstNode = new Node(value);
        this.setHead(firstNode);
        this.setTail(firstNode);
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

    void setHead(Node head){
        this.head = head;
    };

    void setTail(Node tail){
        tail.setNext(null);
        this.tail = tail;
    };

    void append(Object value){
        Node appendedNode = new Node(value);
        this.getTail().setNext(appendedNode);
        this.setTail(appendedNode);
        this.length++;
    };

    void prepend(Object value){
        Node prependedNode = new Node(value);
        prependedNode.setNext(this.head);
        this.setHead(prependedNode);
        this.length++;
    };

    Node traverseToIndex(Integer index){
        Node currentNode = this.getHead();
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        };
        return currentNode;
    };

    void insert(Integer index, Object value){
        if(index <= 0){
            this.prepend(value);
        } else if(index >= this.getLength()){
            this.append(value);
        } else {
            Node leadingNode = this.traverseToIndex(index - 1);
            leadingNode.setNext(new Node(value, leadingNode.getNext()));
            this.length++;
        };
    };

    void remove(Integer index){
        if(index <= 0){
            this.setHead(this.getHead().getNext());
        } else if(index >= this.getLength()){
            Node leadingNode = this.traverseToIndex(this.getLength() - 1);
            this.setTail(leadingNode);
        } else {
            Node leadingNode = this.traverseToIndex(index - 1);
            leadingNode.setNext(leadingNode.getNext().getNext());
        };
        this.length--;
    };

    void printAllValues(){
        Node currentNode = this.getHead();
        for(int i = 0; i < this.getLength(); i++){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        };
    };

};