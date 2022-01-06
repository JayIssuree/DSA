## Exercise

- Given a collection of numbers and a sum value, return whether or not a pair of numbers in the collection adds up to the sum
- Assume that the array will not be sorted
- Cannot use an element at the same index twice
- The same number may appear more than once at a different index

```
[1, 2, 3, 9] => sum = 8
returns false
```
```
[1, 2, 4, 4] => sum = 8
returns true
```

## Questions

- Array will always contain integers?
- Waht about negative numbers, floats etc?
- Do massive arrays fit in memory?

## Thought Process

- Brute force solution would be to do a nested loop and add every element of the array with every other element to see if they equal the sum => O(n^2)
- Iterating through the array once would result in => O(n)
- Hash lookup is on average O(1)

## Resources
- https://www.javatpoint.com/java-hashset
- https://www.tutorialspoint.com/difference-between-an-integer-and-int-in-java