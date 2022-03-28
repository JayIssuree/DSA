# Bubble Sort

- Repeatedly compare 2 values and 'bubble up' the higher value

6, 5, 3, 1, 8, 7, 2, 4

1. Compare index 0 & 1 => 6 > 5 => swap places
    5, 6, 3, 1, 8, 7, 2, 4
2. Compare index 1 & 2 => 6 > 3 => swap places
    5, 3, 6, 1, 8, 7, 2, 4
3. Compare index 2 & 3 => 6 > 1 => swap places
    5, 3, 1, 6, 8, 7, 2, 4
4. Compare index 3 & 4 => 6 < 8 => do not swap
    5, 3, 1, 6, 8, 7, 2, 4
5. Compare index 4 & 5 => 8 > 7 => swap places
    5, 3, 1, 6, 7, 8, 2, 4

Repeat until data is sorted

- Not the most efficient algorithm
- Average and worst time complexity is O(n^2)
- Space complexity is O(1)