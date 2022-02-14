class Main {

    public static void main(String[] args){
        MyLinkedList linkedList = new MyLinkedList(5);
        linkedList.append(16);
        linkedList.prepend(10);
        linkedList.insert(3, 100);
        linkedList.insert(0, 2);
        linkedList.insert(2, 9);
        linkedList.printAllValues();
    };

};