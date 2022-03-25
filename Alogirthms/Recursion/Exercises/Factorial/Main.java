class Main{

    public static void main(String[] args){
        System.out.println(findFactorialRecursive(6));
        System.out.println(findFactorialIterative(3));
    };

    static Integer findFactorialRecursive(Integer num){
        if(num == 1){
            return 1;
        };
        return num * findFactorialRecursive(num - 1);
    };

    static Integer findFactorialIterative(Integer num){
        int result = 1;
        for(int i = num; i != 0; i--){
            result = result * i;
        };
        return result;
    };

};