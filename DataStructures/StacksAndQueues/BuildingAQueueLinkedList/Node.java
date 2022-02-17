class Node {

    private Object value;
    private Node next;

    Node(Object value){
        this.value = value;
        this.next = null;
    };

    Node(Object value, Node next){
        this.value = value;
        this.next = next;
    };

    void setNext(Node nextNode){
        this.next = nextNode;
    };

    Node getNext(){
        return this.next;
    };

    Object getValue(){
        return this.value;
    };

};