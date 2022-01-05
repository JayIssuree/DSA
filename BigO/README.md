O(1) Constant - no loops

O(log N) Logarithmic - usually searching algorithms have log n if they are sorted (Binary Search)

O(n) Linear - for loops, while loops through n items

O(n log(n)) Log Linear - usually sorting operations

O(n^2) Quadratic - every element in a collection needs to be compared to ever other element. Two nested loops

O(2^n) Exponential - recursive algorithms that solves a problem of size N

O(n!) Factorial - you are adding a loop for every element

Rule 1: Always worst Case
eg. when looking for an element in an array - presume it is in the last position
[x, a, b, c, d] => O(1) => O(n)
[a, b, x, c, d] => O(3) => O(n)
[a, b, c, d, x] => O(5) => O(n)

Rule 2: Remove Constants
eg. O(2n + 500) => O(n)
eg. O(n/2) => O(n)
Iterating through half a collection
Graphically they are still linear

Rule 3: Different inputs should have different variables
O(a + b) for steps in order +
O(a * b) for nested steps *

Rule 4: Drop Non-dominant terms
eg. O(10n + n^2 + 1000 + n/2) => O(n^2)
In terms of scalability, as n gets bigger, n^2 will hold the most weight
n = 6 => O(60 + 36 + 1000 + 3)
n = 100 => O(100 + 10000 + 1000 + 50)

Space Complexity:
Variables
Data Structures
Function Calls
Allocations

https://www.bigocheatsheet.com/