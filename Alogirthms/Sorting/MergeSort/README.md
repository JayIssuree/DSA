# Merge Sort

- Repeatedly compare 2 values and swap/insert the smallest value into the start of the list

6, 5, 3, 1, 8, 7, 2, 4

1. Compare index 0 & 1 => 6 > 5 => 5 is the smallest
2. Compare index 1 & 2 => 5 > 3 => 3 is the smallest
3. Compare index 2 & 3 => 3 > 1 => 1 is the smallest
4. Compare index 3 & 4 => 8 < 1 => 1 is the smallest
5. Compare index 3 & 5 => 7 > 1 => 1 is the smallest
6. Compare index 3 & 6 => 2 > 1 => 1 is the smallest
7. Compare index 3 & 7 => 4 > 1 => 1 is the smallest
8. Have compared all elements => swap 1 with element at index 0
    1, 5, 3, 6, 8, 7, 2, 4
9. Repeat process from index 1

Repeat until data is sorted

- One of the most efficient sorting algorithms
- Performs better than most other sorting algorithms
- Divide and conquer approach => uses a form of recursion
- Do not have to compare everything to everything => Just local lists to each other
- Time complexity is O(n log(n))
- Space complexity is O(n)