class Main {

    public static void main(String[] args){
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.append(16);
        linkedList.prepend(10);
        linkedList.printAllValues();
        System.out.println(linkedList.getLength());
    };

};