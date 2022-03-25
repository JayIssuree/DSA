import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

class MyGraph{

    Integer numberOfNodes;
    HashMap<Node, ArrayList<Node>> adjacentList;

    MyGraph(){
        this.numberOfNodes = 0;
        this.adjacentList = new HashMap<Node, ArrayList<Node>>();
    };

    Node addVertex(Object value){
        Node newNode = new Node(value);
        this.numberOfNodes++;
        this.adjacentList.put(newNode, new ArrayList<Node>());
        return newNode;
    };

    void addEdge(Node node1, Node node2){
        this.adjacentList.get(node1).add(node2);
        this.adjacentList.get(node2).add(node1);
    };

    void printAdjecentList(){
        for(Map.Entry<Node, ArrayList<Node>> entry : this.adjacentList.entrySet()){
            Node vertex = entry.getKey();
            ArrayList<Node> edges = entry.getValue();
            System.out.print(vertex.value + "=>");
            for(int i = 0; i < edges.size(); i++){
                System.out.print(edges.get(i).value + " ");
            };
            System.out.println("");
        };
    };

};