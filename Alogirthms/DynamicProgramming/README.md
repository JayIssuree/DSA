## Dynamic Programming

- Optimization technique
- Using a CACHE
- Breaking a problem into a collection of subproblems and STORING their SOLUTIONS incase they appear again
=> Great when using divide and conquer recursion with memoization

1. Can be divided into subproblem
2. Recursive solution
3. Are there repetitive subproblems?
4. Memoize subproblems

## Memoization

```
    function addTo80(n){
        console.log("LONG TIME");
        return 80 + n;
    };


    function memoizedAddTo80(){
        let cache = {};

        return function(n){
            if(cache.n){
                return cache[n];
            } else {
                console.log("LONG TIME");
                cache[n] = 80 + n;
                return cache[n];
            };
        };
    };

    const memoizedAT80 = memoizedAddTo80();
```

=> if we run addTo80(10) multimple times, it will have to execute the LONG TIME code each time the function is called

=> if we run memoizedAT80(10) multiple times, it will only have to execute the LONG TIME code the once, it then stores the result of that in the cache and each subsequent time the function is called it will look up the result in O(1) time
- The cache is ENCLOSED in the memoized function so that the scope of the cache is enclosed in the function

=> This can be used to optimize the fibonacci sequence from O(2^n) to O(n) as previous solutions would be cached