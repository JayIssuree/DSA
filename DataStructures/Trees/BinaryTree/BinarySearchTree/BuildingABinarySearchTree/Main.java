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

        System.out.println(bst.lookup(20).getValue());
        System.out.println(bst.lookup(20).getLeft().getValue());
        System.out.println(bst.lookup(20).getRight().getValue());
        System.out.println(bst.traverse(bst.lookup(20), 8).getValue());
    };

}