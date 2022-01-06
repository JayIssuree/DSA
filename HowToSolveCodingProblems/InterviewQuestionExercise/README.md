## Exercise

Given 2 arrays, create a function that let's a user know (true/false) whether these two array contain any common items
```
array1 = ["a", "b", "c", "x"]
array2 = ["z", "y", "i"]
should return false
```
```
array1 = ["a", "b", "c", "x"]
array2 = ["z", "y", "x"]
should return true
```

## Questions

- Are the contents of the arrays always Strings?
- What about duplicates in the same array?
- Do massive arrays fit in memory?

## Thought Process

- Brute force solution would to do a nested loop and compare all elements of one array to all elements of the other array => O(a^b)
- The average & worst case scenarios of array search(element) is O(n), so looping through one array and searching for each element in the other would also result in => O(a^b)
- Iterating through one array THEN the other would result in O(a+b)
- Hash lookup is on average O(1)
- Hashset will not contain duplicates => when converting the first array to a hashset it will not return true if there are duplicates within the same array

## Resources

- https://www.bigocheatsheet.com/
- https://www.geeksforgeeks.org/difference-between-hashmap-and-hashset/
- https://www.javatpoint.com/java-hashset