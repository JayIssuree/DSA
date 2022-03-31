class Node {

    private Integer value;
    private Node right;
    private Node left;

    Node(Integer value){
        this.value = value;
        this.right = null;
        this.left = null;
    };

    Integer getValue(){
        return this.value;
    };

    void setRight(Node rightNode){
        this.right = rightNode;
    };

    Node getRight(){
        return this.right;
    };

    void setLeft(Node leftNode){
        this.left = leftNode;
    };

    Node getLeft(){
        return this.left;
    };

};