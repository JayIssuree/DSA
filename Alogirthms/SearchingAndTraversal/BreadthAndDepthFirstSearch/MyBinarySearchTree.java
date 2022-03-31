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

    List<Integer> breadthFirstSearchR(List<Integer> list, List<Node> queue){
        if(queue.size() == 0){
            return list;
        };
        Node currentNode = queue.remove(0);
        list.add(currentNode.getValue());
        if(currentNode.getLeft() != null){
            queue.add(currentNode.getLeft());
        };
        if(currentNode.getRight() != null){
            queue.add(currentNode.getRight());
        };
        return breadthFirstSearchR(list, queue);
    };

    List<Integer> depthFirstSearchInOrder(List<Integer> list, Node currentNode){
        if(currentNode.getLeft() != null){
            depthFirstSearchInOrder(list, currentNode.getLeft());
        };
        list.add(currentNode.getValue());
        if(currentNode.getRight() != null){
            depthFirstSearchInOrder(list, currentNode.getRight());
        };
        return list;
    };

    List<Integer> depthFirstSearchPreOrder(List<Integer> list, Node currentNode){
        list.add(currentNode.getValue());
        if(currentNode.getLeft() != null){
            depthFirstSearchPreOrder(list, currentNode.getLeft());
        };
        if(currentNode.getRight() != null){
            depthFirstSearchPreOrder(list, currentNode.getRight());
        };
        return list;
    };

    List<Integer> depthFirstSearchPostOrder(List<Integer> list, Node currentNode){
        if(currentNode.getLeft() != null){
            depthFirstSearchPostOrder(list, currentNode.getLeft());
        };
        if(currentNode.getRight() != null){
            depthFirstSearchPostOrder(list, currentNode.getRight());
        };
        list.add(currentNode.getValue());
        return list;
    };

};