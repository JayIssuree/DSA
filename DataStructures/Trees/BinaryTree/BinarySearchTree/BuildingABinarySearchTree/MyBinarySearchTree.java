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

};