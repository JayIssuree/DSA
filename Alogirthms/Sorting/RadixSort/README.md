# Radix Sort

- Used to quickly sort integers or multiple lengths
- No comparisons needed
- O(nk) => Best/Average/Worst Time Complexity
- O(n + k) => Space Complexity
- k is the average number of digits

[35, 97, 81, 1, 157, 1043, 834, 513, 5677, 42, 440]

1. Calculate how many integers the longest number contains
    - 1043/5677 => Contain 4 integers. Therefore the radix sort only needs to run 4 times.
2. Create 10 buckets from 0..9 and sort the values based on the 1s column

    0      1       2       3       4       5       6       7       8       9
  440     81      42    1043     834      35              97
           1             513                            5677

3. This is the new order of values
    - [440, 81, 1, 42, 1043, 513, 834, 35, 97, 5677]

4. Repeat the process for the 10s column

    0      1       2       3       4       5       6       7       8       9
    1     513             834     440                    5677      81      97
                           35      42
                                 1043

=> [1, 513, 834, 35, 440, 42, 1043, 5677, 81, 97]

5. Repeat the process for the 100s colum

    0      1       2       3       4       5       6       7       8       9
      1                            440     513    5677             834                              
     35
     42
   1043
     81
     97

=> [1, 35, 42, 1043, 81, 87, 440, 513, 5677, 834]

6. Repeat the process for the thousands column

    0      1       2       3       4       5       6       7       8       9
      1    1043                            5677
     35
     42
     81
     87
    440
    513
    834

=> [1, 35, 42, 81, 87, 440, 513, 834, 1043, 5677]