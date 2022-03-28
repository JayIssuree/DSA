# Selection Sort

- Useful for when the list is already almost sorted
- Performs well in small data sets

- Iterate through the data and insert the following element into the correct position amongst all previous element
- The comparison element is 'bubbled down' to the correct postion

6, 5, 3, 1, 8, 7, 2, 4

1. [6], 5, 3, 1, 8, 7, 2, 4 => Look at the first element, keep it where it is
2. [6, 5], 3, 1, 8, 7, 2, 4 => Compare the next element to the previous and insert in correct position
3. [5, 6, 3], 1, 8, 7, 2, 4 => Compare the next element to the previous and insert in correct position
4. [3, 5, 6, 1], 8, 7, 2, 4 => Compare the next element to the previous and insert in correct position
5. [1, 3, 5, 6, 8], 7, 2, 4 => Compare the next element to the previous and insert in correct position
6. [1, 3, 5, 6, 8, 7], 2, 4 => Compare the next element to the previous and insert in correct position
7. [1, 3, 5, 6, 7, 8, 2], 4 => Compare the next element to the previous and insert in correct position
8. [1, 2, 3, 5, 6, 7, 8, 4] => Compare the next element to the previous and insert in correct position
9. [1, 2, 3, 4, 5, 6, 7, 8] => Compare the next element to the previous and insert in correct position

- Not the most efficient algorithm
- Can be O(n)
- Space complexity is O(1)