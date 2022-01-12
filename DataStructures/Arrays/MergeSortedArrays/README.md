## Exercise

- Given 2 sorted arrays that are sorted. Can you merge these 2 arrays into one big one that is still sorted?

```
arrayA = [0, 3, 4, 31, 32, 99]
arrayB = [4, 6, 30, 50, 66]
=> [0, 3, 4, 4, 30, 31, 32, 50, 66, 99]
```

## Questions

- Array will always contain integers?
- Do massive arrays fit in memory?

## Thought Process

- Naive approach would be to concat the arrays then do in built Arrays.sort() => worst case scenario this would be O(a*b)
- Since the arrays are already sorted you only need to go through each of them once => O(a+b)
- Compare the first elements of each array => insert the smallest number into new array => inciriment the index of the array that the number was inserted from + 1
- arrayA[0] < arrayB[0] => emptyArray.push(arrayA[0]) => arrayA[1] < arrayB[0]