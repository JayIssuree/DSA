class MyStack {

    private Node top;
    private Node bottom;
    private Integer length;

    MyStack(){
        this.top = null;
        this.bottom = null;
        this.length = 0;
    };

    Node peek(){
        return this.top;
    };

    void push(Object value){
        Node addedNode = new Node(value);
        if(this.isEmpty()){
            this.top = addedNode;
            this.bottom = addedNode;
        } else {
            addedNode.setNext(this.top);
            this.top = addedNode;
        };
        this.length++;
    };

    void pop(){
        if(this.isEmpty()){
            return;
        };
        Node oldTop = this.top;
        Node newTop = oldTop.getNext();
        oldTop.setNext(null);
        this.top = newTop;
        this.length--;
        if(this.isEmpty()){
            this.bottom = null;
        };
    };

    Boolean isEmpty(){
        return this.length == 0;
    };

    void printAllValues(){
        Node currentNode = this.top;
        while(currentNode != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNext();
        };
    };

};