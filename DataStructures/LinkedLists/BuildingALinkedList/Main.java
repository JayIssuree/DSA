class Main {

    public static void main(String[] args){
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.append(16);
        linkedList.prepend(10);
        linkedList.insert(99, 100);
        linkedList.insert(-99, 2);
        linkedList.insert(2, 9);
        linkedList.insert(5, "Hello");
        linkedList.remove(-99);
        linkedList.remove(99);
        linkedList.printAllValues();
    };

};