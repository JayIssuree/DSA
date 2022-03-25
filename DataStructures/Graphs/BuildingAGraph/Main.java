class Main{

    public static void main(String[] args){
        MyGraph graph = new MyGraph();
        Node zero = graph.addVertex(0);
        Node one = graph.addVertex(1);
        Node two = graph.addVertex(2);
        Node three = graph.addVertex(3);
        Node four = graph.addVertex(4);
        Node five = graph.addVertex(5);
        Node six = graph.addVertex(6);
        graph.addEdge(three, one); 
        graph.addEdge(three, four); 
        graph.addEdge(four, two); 
        graph.addEdge(four, five); 
        graph.addEdge(one, two); 
        graph.addEdge(one, zero); 
        graph.addEdge(zero, two); 
        graph.addEdge(six, five);
        graph.printAdjecentList();
    };

};