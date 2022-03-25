# Graphs
- Each item is called a NODE/VERTEX
- Each link is called an EDGE
- Can represent networks, family trees, roads and locations etc
- Graphs => Trees => Linked Lists
- Great for representing relationships
- Hard to scale

# Directed Graphs
- Movemend between nodes is directional
- Singly Linked Lists

# Unidrected Graphs
- Movement between nodes is bidirectional
- Double Linked List

# Weighted
- Values can be assigned to the edges, not just the nodes
- Mostly used in the the fastest route between 2 locations

# Unweighted
- Values are not assigned to the edges

# Cyclic
- Vertices that connect in a circular fashion
- A node can point to a node that is previously in the list 
- The tail node of a linked list points back to the head

# Acyclic
- The vertices do not loop back
- Each node points to a new node, not one previously in the list

# Edge List
- Lists every edge and the nodes that link them
eg [[0, 2], [2, 3], [2, 1], [1, 3]]

# Adjacency List
- Lists the adjacent nodes of a node
- Index is the node value and the array at that index lists the adjacent nodes
eg [[2], [2, 3] [0, 1, 3], [1, 2]]

# Adjacency Matrix
- Has a true or false value that states whether a node is connected to another node
- Can also contain the weighted values, not just true or false
eg [
    [0, 0, 1, 0],
    [0, 0, 1, 1],
    [1, 1, 0, 1],
    [0, 1, 1, 0]
]

# Example Graph

        2------0
       / \
      /   \
     1-----3