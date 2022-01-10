import java.util.HashSet;

class HasPairWithSum{

    static int[] testArray = { 1, 2, 6};

    public static void main(String[] args){
        System.out.println(hasPairWithSum(testArray, 9));
    };

    public static boolean hasPairWithSum(int[] array, int sumValue){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            if(hashSet.contains(array[i])){
                return true;
            } else {
                hashSet.add(sumValue - array[i]);
            };
        };
        return false;
    };

};

// O(n)