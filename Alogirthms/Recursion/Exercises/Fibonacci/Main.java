class Main {

    static int a = 0;
    static int b = 1;
    static int temp;

    public static void main(String[] args){
        System.out.println(fibonacciRecursive(8));
        System.out.println(fibonacciIterative(7));
    };

    static Integer fibonacciIterative(Integer n){
        for(int i = 0; i < n; i++){
            temp = b + a;
            a = b;
            b = temp;
        };
        return a;
    };
    // O(n)

    static Integer fibonacciRecursive(Integer n){
        if(n < 2){
            return n;
        };
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    };
    // O(2^n)
    // Each time the function is called, it calls itself twice, and each of those call itself twice
    // 0 => 0
    // 1 => 1
    // 2 => fr(1) + fr(0)
    // 3 => fr(2) + fr(1)
    // 4 => fr(3) + fr(2)
    // 5 => fr(4) + fr(2)
    // A tree where each branch splits off into 2
};
//         4
//       /   \
//      3     2
//     / \   / \
//    2   1 1   0
//   / \
//  1   0