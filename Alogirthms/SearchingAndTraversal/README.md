# Searching & Traversal
- Searching/Inserting/Deleting in a TREE/GRAPH is generally MORE EFFICIENT than a LIST/HASH
- Traversal remains the same O(n)

## Linear Search
- Finding a target value within a list
- Sequentiall checks each element of the list against the target element => Or until it reaches the end of the list
- Best case O(1) => If target is at the start of the list
- Worst case O(n) => If target is at the end of the list / not in the list at all

## Binary Search
- Finding the element in a SORTED LIST
- Can discard half the items by repeatedy comparing the middle index element to the target element
    - Discard the left half if the target is larger than the middle index element
    - Discard the right side if the taget is smaller than the middle index element
- Basically a binary search tree
- Best case O(1) => If target is at the top of the tree / middle of the list
- Worst case O(log n) => If target is at the bottom of the tree (height of tree operations)

## Traversal
- Visiting EVERY SINGLE NODE in a tree/graph
- Sometimes calling operations on each node
=> O(n)

## Example Tree
          9
        /   \
       6    12
     /  \   / \
    1   4  34 45

## Breadth First Search
- Go from left to right on a tree level by level
- The example tree would look like => [9, 6, 12, 1, 4, 34, 45]
- Tree Level:                          1  2      3

- Time complexity => O(n)
- Finds the shortest path (always search the closest nodes to the root node first)
- Requires MORE MEMORY
- Has to keep track of the nodes at the current level in a QUEUE
- Good if you know the target is in the upper levels of a tree/graph

## Depth First Search
- Go to the deepest level, branch by branch, until all the children have been explored
- The example tree would look like => [1, 6, 4, 9, 34, 12, 45] => InOrder
- The example tree would look like => [9, 6, 1, 4, 12, 34, 45] => PreOrder
- The example tree would look like => [1, 4, 6, 34, 45, 12, 9] => PostOrder

- Time complexity => O(n)
- Can get slow if the tree/graph is extremely large
- Requires LESS MEMORY
- Good if you know the target is in the lower levels of a tree/graph
- Can determine if a path exists between 2 nodes

## Determining Which Search To Use
- If you know a solution is not far from the root of the tree => Breadth First Search
- If the tree is very deep and solutions are rare => Breadth First Search (DFS will take long time)
- Finding the shortest path => Breath First Search

- If the tree is very wide => Depth First Search (BFS will need too much memory)
- If solutions are frequent but located deep in the tree => Depth First Search
- Determining whether a path exists between two nodes => Depth First Search