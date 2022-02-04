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

    Node getNext(){
        return this.next;
    };

    void setNext(Node nextNode){
        this.next = nextNode;
    };

    Object getValue(){
        return this.value;
    };

};