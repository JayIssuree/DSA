class Main {

    public static void main(String[] args){
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.append(16);
        linkedList.prepend(10);
        System.out.println(linkedList.getHead().getValue());
        System.out.println(linkedList.getTail().getValue());
        System.out.println(linkedList.getLength());
    };

};