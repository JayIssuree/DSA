## Rules
- Each node can only have 0, 1 or 2 children
- Each child can only have 1 parent
- Each node represents a certain state
- They are similar to linked lists:
    - Instead of each node having a single pointer to the .next value
    - There are 2 pointers that point .left or .right
    - They both start at the head/root
- Allows fo O(log n) run time
- THE BASE OF ALL LOG N CALCULATIONS IS 2 unless stated otherwise 

## Perfect Binary Tree
- Every level is full (each node points to 2 children)
- The bottom layer nodes point to 0 children
- The number of nodes doubles at each level as we move down the tree
- The number of nodes at bottom level == the number of nodes on all the previous levels + 1
- Half of the nodes are on the bottom level

# Full Binary Tree
- Each node has either 0 or 2 children
- Never 1 child

# Calculating the Number of Nodes at Each Level
- 2^n where n = the level
- root node: 2^0 = 1
- level 1: 2^1 = 2
- level 2: 2^2 = 4
- level 3: 2^3 = 8

# Calculating the Total Number of Nodes in a Perfect Binary Tree
- 2^h - 1 where h = tree height (if there are 3 levels to the tree, the height is 4)
- log nodes = height
    log2 16 = 4

O(log n) where n is the height of the tree/max number of steps to find a node

# Automatic Balancing of Trees
- AVL
- Red Black
- These 2 types of binary search tree automatically balance themselves