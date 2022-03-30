class Main {

    public static void main(String[] args){
        MyBinarySearchTree bst = new MyBinarySearchTree(20);
        bst.insert(22);
        bst.insert(9);
        bst.insert(11);
        bst.insert(46);
        bst.insert(19);
        bst.insert(8);
        bst.insert(21);

        bst.breadthFirstSearch();
    };

}