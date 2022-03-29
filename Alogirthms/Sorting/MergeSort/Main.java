import java.util.Arrays;

class Main {

    public static void main(String[] args){
        int[] numbers = {99, 44, 23, 11, 4, 7, 55, 8, 6, 33, 23, 567, 16, 21};
        System.out.println(Arrays.toString(mergeSort(numbers)));
    };

    static int[] mergeSort(int[] numbers){
        if(numbers.length == 1){
            return numbers;
        };
        int[] left = Arrays.copyOfRange(numbers, 0, numbers.length/2);
        int[] right = Arrays.copyOfRange(numbers, numbers.length/2, numbers.length);

        return merge(mergeSort(left), mergeSort(right));
    };

    static int[] merge(int[] left, int[] right){
        int[] sortedArr = new int[left.length + right.length];
        int lIndex = 0;
        int rIndex = 0;
        int sortedIndex = 0;
        
        while(lIndex < left.length && rIndex < right.length){
            if(left[lIndex] <= right[rIndex]){
                sortedArr[sortedIndex] = left[lIndex];
                lIndex++;
            } else if(right[rIndex] <= left[lIndex]){
                sortedArr[sortedIndex] = right[rIndex];
                rIndex++;
            };
            sortedIndex++;
        };

        if(lIndex < left.length){
            while(sortedIndex < sortedArr.length){
                sortedArr[sortedIndex] = left[lIndex];
                lIndex++;
                sortedIndex++;
            };
        };

        if(rIndex < right.length){
            while(sortedIndex < sortedArr.length){
                sortedArr[sortedIndex] = right[rIndex];
                rIndex++;
                sortedIndex++;
            };
        };
        
        return sortedArr;
    };

};

// O(n log(n))