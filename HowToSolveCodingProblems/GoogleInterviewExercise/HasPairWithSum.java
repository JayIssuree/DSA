import java.util.HashSet;

class HasPairWithSum{

    static int[] testArray = { 9, 4, 3, 4, 5, 6 };

    public static void main(String[] args){
        System.out.println(hasPairWithSum(testArray, 4));
    };

    public static boolean hasPairWithSum(int[] array, int sumValue){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            if(hashSet.contains(sumValue - array[i])){
                return true;
            } else {
                hashSet.add(array[i]);
            };
        };
        return false;
    };

};

// O(n)