# Quick Sort

- Pivoting technique to break a large list into smaller lists
- Pick a random element/index as a pivot:
    All elements that are greater go to the right
    All elements that are smaller go to the left
=> You know that that the pivot is in the correct position as everything on the left is smaller and everything on the right is larger
- You split the list into 2 AT THE PIVOT and repeat for the process for the left and right lists

6, 5, 3, 1, 8, 7, 2, 4

1. Pick the pivot
             v
    => 6, 5, 3, 1, 8, 7, 2, 4

2. Go through and compare each element to the pivot and move to the correct side
       .     v
    => 6, 5, 3, 1, 8, 7, 2, 4
    => 6 is larger than the pivot so move 3 down a space (swap 3 with 5) and then swap 5 with 6
       .  v
    => 6, 3, 5, 1, 8, 7, 2, 4
          v  .
    => 5, 3, 6, 1, 8, 7, 2, 4

3. Compare 3 with 5
       .  v  
    => 5, 3, 6, 1, 8, 7, 2, 4
    => As they are next to each other, just swap positions
       v  .  
    => 3, 5, 6, 1, 8, 7, 2, 4

4. Compare 3 with 1
       v        .
    => 3, 5, 6, 1, 8, 7, 2, 4
    => 1 is less than 3 so move 3 up a space (swap 3 with 5) and then swap 5 with 1
          v     .
    => 5, 3, 6, 1, 8, 7, 2, 4
       .  v     
    => 1, 3, 6, 5, 8, 7, 2, 4

5. Repeat the process:
             v  
    => 1, 2, 3, 5, 8, 7, 6, 4
    => You know that 3 is in the correct position in this list

6. Split the list and repeat the process:
    => 1, 2 (already sorted)
    => 5, 8, 7, 6, 4

    
- One of the most efficient sorting algorithms and the fastest on average
- Performs better than most other sorting algorithms
- Divide and conquer approach => uses a form of recursion
- Do not have to compare everything to everything => Just local lists to each other
- Time complexity is O(n log(n))
- Space complexity is O( log(n))
- If you pick the largest/smallest element then the worst case time complexity will be O(n^2)