import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class MyBinarySearchTree {

    Node root;

    MyBinarySearchTree(Integer value){
        this.root = new Node(value);
    };

    void insert(Integer value){
        Node insertedNode = new Node(value);
        Node currentNode = this.root;
        while(true){
            if(value < currentNode.getValue()){
                if(currentNode.getLeft() == null){
                    currentNode.setLeft(insertedNode);
                    return;
                } else {
                    currentNode = currentNode.getLeft();
                };
            } else if(value > currentNode.getValue()){
                if(currentNode.getRight() == null){
                    currentNode.setRight(insertedNode);
                    return;
                } else {
                    currentNode = currentNode.getRight();
                };
            };
        }
    };

    Node lookup(Integer value){
        Node currentNode = this.root;
        while(currentNode.getValue() != value){
            if(value < currentNode.getValue()){
                currentNode = currentNode.getLeft();
            } else if(value > currentNode.getValue()){
                currentNode = currentNode.getRight();
            };
        };
        return currentNode;
    };

    Node traverse(Node currentNode, Integer value){
        if(currentNode.getValue() == value){
            return currentNode;
        } else if(value > currentNode.getValue()){
            return traverse(currentNode.getRight(), value);
        } else if(value < currentNode.getValue()){
            return traverse(currentNode.getLeft(), value);
        };
        return traverse(currentNode, value);
    };

    List<Integer> breadthFirstSearch(){
        Node currentNode = this.root;
        List<Integer> list = new ArrayList<Integer>();
        List<Node> queue = new ArrayList<Node>();
        queue.add(currentNode);

        while(queue.size() > 0){
            currentNode = queue.remove(0);
            // System.out.println(currentNode.getValue());
            list.add(currentNode.getValue());
            if(currentNode.getLeft() != null){
                queue.add(currentNode.getLeft());
            };
            if(currentNode.getRight() != null){
                queue.add(currentNode.getRight());
            };
        };
        return list;
    };

};