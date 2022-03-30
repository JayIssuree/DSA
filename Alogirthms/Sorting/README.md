# Sorting

- Every language implements their .sort method in their own way => this can lead to unexpected results
- JavaScript [2, 65, 34, 2, 1, 7, 8] => [1, 2, 2, 34, 65, 7, 8]
    - It converts the first index to a string/unicode and compares the values
    
- There are time and space complexity tradeoffs between using each sorting algorithm:
https://www.bigocheatsheet.com/

## Quick
    - Time => O(n log(n)) / O(n log(n)) / O(n^2)
    - Space => O(log n)

## Heap
    - Time => O(n log(n)) / O(n log(n)) / O(n log(n))
    - Space => O(1)

## Bubble
    - Time => O(n) / O(n^2) / O(n^2)
    - Space => O(1)

## Selection
    - Time => O(n^2) / O(n^2) / O(n^2)
    - Space => O(1)

## Insertion
    - Time => O(n) / O(n^2) / O(n^2)
    - Space => O(1)
    - Great for small sets of data / data that is already nearly sorted

## Merge
    - Time => O(n log(n)) / O(n log(n)) / O(n log(n))
    - Space => O(n)

## Radix
    - Time => O(nk) / O(nk) / O(nk)
    - Space => O(n + k)
    - Great when working with unasigned integers

## Counting
    - Time => O(n+k) / O(n+k) / O(n+k)
    - Space => O(k)
    - Great when working with unasigned integers