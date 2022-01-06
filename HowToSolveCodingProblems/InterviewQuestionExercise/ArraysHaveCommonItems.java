import java.util.HashSet;

public class ArraysHaveCommonItems{

    static String[] testArray1 = {"a", "b", "c", "x"};
    static String[] testArray2 = {"z", "y", "i"};
    static String[] testArray3 = {"z", "y", "x"};

    public static void main(String[] args){
        System.out.println(hasCommonItem(testArray1, testArray2));
    };

    public static boolean hasCommonItem(String[] array1, String[] array2){
        HashSet<String> hashSet = new HashSet<String>();

        for(int i = 0; i < array1.length; i++){
            hashSet.add(array1[i]);
        };

        for(int j = 0; j < array2.length; j++){
            if(hashSet.contains(array2[j])){
                return true;
            } else {
                hashSet.add(array2[j]);
            };
        };
        
        return false;
    };

};

// O(a+b)