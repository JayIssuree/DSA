## Exercise

Given an array, return the first element that is repeated.
```
[2, 5, 1, 2, 3, 5, 1, 2, 4]
Should return 2

[2, 1, 1, 2, 3, 5, 1, 2, 4]
Should return 1

[2, 3, 4, 5]
Should return undefined
```

## Questions

- Are the contents of the arrays always Integers?
- Do massive arrays fit in memory?

## Thought Process

- Naive approach would be to compare each element to every other element (nested loop) and save the indicies of where the element is repeated. Then return the element of the lowest value indicies => O(n^2)
- If an element is reapeated, you would only need to check the elements inbetween those to indicies to see if a reapeat occurs sooner - it seems you would still have to loop even though the array gets smaller each time
- Only looping through the array once and translating each element to a hash that keeps track of that elements count, the returning the first element whos count reaches 2 => O(n)

## Resources
- https://www.tutorialspoint.com/java/util/java_util_hashmap.htm
- https://stackoverflow.com/questions/81346/most-efficient-way-to-increment-a-map-value-in-java
