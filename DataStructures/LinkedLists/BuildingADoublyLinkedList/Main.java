class Main {

    public static void main(String[] args){
        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList("Hello World!");
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.prepend(99);
        doublyLinkedList.prepend(100);
        doublyLinkedList.insert(2, "Inserted at index 2");
        doublyLinkedList.remove(3);
        doublyLinkedList.printAllValues();
    };

};