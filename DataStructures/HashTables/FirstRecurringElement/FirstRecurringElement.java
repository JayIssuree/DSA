import java.util.Map;
import java.util.HashMap;

class FirstRecurringElement {

    static String[] stringArr1 = { "I", "am", "doing", "a", "quiz", "and", "this", "is", "a", "string", "array" };
    static Integer[] intArr1 = { 2, 5, 1, 2, 3, 5, 1, 2, 4 };
    static Integer[] intArr2 = { 2, 1, 1, 2, 3, 5, 1, 2, 4 };
    static Integer[] intArr3 = { 2, 3, 4, 5 };

    public static void main(String[] args){
        System.out.println(firstRecurringElement(stringArr1));
        System.out.println(firstRecurringElement(intArr1));
        System.out.println(firstRecurringElement(intArr2));
        System.out.println(firstRecurringElement(intArr3));
        System.out.println(firstRecurringElement(args));
    };

    static Object firstRecurringElement(Object[] array){
        Map<Object, Integer> hashMap = new HashMap<Object, Integer>();
        for(int i = 0; i < array.length; i++){
            hashMap.merge(array[i], 1, Integer::sum);
            if (hashMap.get(array[i]) == 2){
                return array[i];
            };
        };
        return null;
    };

};

// O(n)