# Selection Sort

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

- Not the most efficient algorithm
- Average and worst time complexity is O(n^2)
- Space complexity is O(1)