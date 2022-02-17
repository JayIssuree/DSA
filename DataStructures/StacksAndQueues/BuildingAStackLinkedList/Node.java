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

    Object getValue(){
        return this.value;
    };

    Node getNext(){
        return this.next;
    };

    void setNext(Node next){
        this.next = next;
    };

};