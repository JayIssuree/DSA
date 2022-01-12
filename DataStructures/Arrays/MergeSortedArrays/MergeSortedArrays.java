import java.util.Arrays;

public class MergeSortedArrays {

    static int[] array1 = { 2, 3, 15, 31, 66, 300, 501 };
    static int[] array2 = { 4, 6, 30, 31, 55, 99, 100, 101, 102, 500 };

    public static void main(String[] args){
        System.out.println(Arrays.toString(mergeSortedArray(array1, array2)));
    };

    static int[] mergeSortedArray(int[] array1, int[] array2){
        int size = array1.length + array2.length;
        int[] sortedArray = new int[size];
        int array1index = 0;
        int array2index = 0;
        
        for(int i = 0; i < size; i++){
            if(array1index < array1.length && array2index < array2.length){
                if(array1[array1index] <= array2[array2index]){
                    sortedArray[i] = array1[array1index];
                    array1index++;
                } else if(array2[array2index] <= array1[array1index]){
                    sortedArray[i] = array2[array2index];
                    array2index++;
                };
            } else if(array1index < array1.length){
                sortedArray[i] = array1[array1index];
                array1index++;
            } else if(array2index < array2.length){
                sortedArray[i] = array2[array2index];
                array2index++;
            };
        };
        return sortedArray;
    };

};

// O(a+b)