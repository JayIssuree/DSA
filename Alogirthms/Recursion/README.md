# Recursion

- A function that refers to itself inside of the funtion
- Great for tasks that have repeated sub tasks to do
- Used in searching and sorting algorithms
- Consider using recursion when working with trees
    1. Divided into a number of subproblems that are smaller instances of the same problem
    2. Each instance of the subproblem is identical in nature
    3. The solutions of each subproblem can be combined to solve the problem at hand
=> Divide and conquer using recursion (looking through a phonebook)
- Good for making readable and dry code

1. Identify the base case (when to stop the function)
2. Identify the recursive case (when the rerun the function)
3. Get closer and closer and return when needed => Requires at least 2 returns

function recursion(){
    recursion();
};

- It can be called an infinte amount of times => stack overflow and crashes as it takes up too much memory
- Anything that can be done recursively CAN also be done iteratively (loop)
- Sometimes can lead to a large stack

# Base Case

- Every recursive funtion needs a condition to stop
- You want to bubble up the stack as it works as LIFO

counter = 0;
function recursion(){
    if(counter > 3){
        return "Done!";
    };
    counter++;
    recursion();
};

recursion4 => "Done!"
recursion3 => undefined
recursion2 => undefined
recursion1 => undefined
recursion0 => undefined

- As each call is popped off the stack (from 4 to 0) the last call to be executed is recursion0 (when the counter was 0) and this has no return value

counter = 0;
function recursion(){
    if(counter > 3){
        return "Done!";
    };
    counter++;
    return recursion();
};

recursion4 => "Done!"
recursion3 => recursion4();
recursion2 => recursion3();
recursion1 => recursion2();
recursion0 => recursion1();

- Here the result of the base case is bubbled up
- recursion4 returns "Done!" insead of returning another recursion() call
- The result of returning recursion() in recursion3 the return value of recursion4() => "Done!"
- And so on and so forth
- The return value is bubbled up to the end of the stack and returned