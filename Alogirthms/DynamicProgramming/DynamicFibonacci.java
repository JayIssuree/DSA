import java.util.HashMap;

class DynamicFibonacci{

    static int count = 0;
    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    
    DynamicFibonacci(){
        cache.put(0, 0);
        cache.put(1, 1);
    };

    int calculate(int index){
        if(this.cache.containsKey(index)){
            return this.cache.get(index);
        };
        count++;
        this.cache.put(index, (calculate(index - 1) + calculate(index - 2)));
        return this.cache.get(index);
    };

    void printAndResetCount(){
        System.out.println(this.count);
        this.count = 0;
    };

};
// O(n)