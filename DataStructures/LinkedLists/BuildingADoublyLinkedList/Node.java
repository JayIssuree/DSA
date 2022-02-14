class Node {

    private Object value;
    private Node previous;
    private Node next;

    Node(Object value){
        this.value = value;
        this.previous = null;
        this.next = null;
    };

    Node(Object value, Node previous, Node next){
        this.value = value;
        this.previous = previous;
        this.next = next;  
    };

    Object getValue(){
        return this.value;
    };

    Node getPrevious(){
        return this.previous;
    };

    void setPrevious(Node previousNode){
        this.previous = previousNode;
    };

    Node getNext(){
        return this.next;
    };

    void setNext(Node nextNode){
        this.next = nextNode;
    };

};