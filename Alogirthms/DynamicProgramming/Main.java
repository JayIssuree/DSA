class Main{

    static int fibonacciCount = 0;

    public static void main(String[] args){
        DynamicFibonacci DF = new DynamicFibonacci();
        Fibonacci F = new Fibonacci();
        System.out.println(DF.calculate(10));
        DF.printAndResetCount();
        System.out.println(DF.calculate(12));
        DF.printAndResetCount();
        System.out.println(F.calculate(10));
        F.printAndResetCount();
        System.out.println(F.calculate(12));
        F.printAndResetCount();
    };

};