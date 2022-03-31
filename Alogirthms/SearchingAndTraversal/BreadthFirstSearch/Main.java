import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


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

        System.out.println(bst.breadthFirstSearch());

        List<Integer> initialList = new ArrayList<Integer>();
        List<Node> initialQueue = new ArrayList<Node>();
        initialQueue.add(bst.lookup(20));

        System.out.println(bst.breadthFirstSearchR(initialList, initialQueue));
    };

}