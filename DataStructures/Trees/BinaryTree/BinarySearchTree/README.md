## Rules
- All child nodes to the RIGHT of the parent node must be GREATER than parent node
- All child nodes to the LEFT of the parent node must be LESS THAN the parent node
- Each node can only have up to 2 children

Lookup, Insert and Delete are all O(log n)
You would only ever have to do the max height/number of levels of the tree operations
A tree that has 7 nodes has a height of 3 so there would only be a max of 3 operations
log2 8 = 3

## Unbalanced Binary Search Tree
- An unbalanced binary search tree is where nodes repeated get added to one side of the tree and each node only has 1 child node
- This turns the binary search tree into more of a linked list
- Lookup, Insert & Delete operations are now O(n)
- Ideally we want a balanced tree in all cases

There are no O(1) operations in trees, unlike other data structures