class Fibonacci{

    static int count = 0;

    int calculate(int index){
        if(index < 2){
            return index;
        };
        count++;
        return calculate(index - 1) + calculate(index - 2);
    };

    void printAndResetCount(){
        System.out.println(this.count);
        this.count = 0;
    };

};

// O(2^n)