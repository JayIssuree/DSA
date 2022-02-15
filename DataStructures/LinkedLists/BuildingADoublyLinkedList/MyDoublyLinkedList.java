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
        headNode.setPrevious(null);
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
            Node trailingNode = leadingNode.getNext();
            Node insertedNode = new Node(value, leadingNode, trailingNode);
            leadingNode.setNext(insertedNode);
            trailingNode.setPrevious(insertedNode);
            this.length++;
        };
    };

    void remove(Integer index){
        if(index <= 0){
            this.setHead(this.getHead().getNext());
        } else if(index >= this.getLength()){
            this.setTail(this.getTail().getPrevious());
        } else {
            Node leadingNode = this.traverseToIndex(index - 1);
            Node trailingNode = leadingNode.getNext().getNext();
            leadingNode.setNext(trailingNode);
            trailingNode.setPrevious(leadingNode);
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

    void printAllValuesReversed(){
        Node currentNode = this.getTail();
        for(int i = 0; i < this.getLength(); i++){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getPrevious();
        };
    };

};