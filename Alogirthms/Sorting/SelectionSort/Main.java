import java.util.Arrays;

class Main {

    public static void main(String[] args){
        int[] numbersArr = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(selectionSort(numbersArr)));
    };

    static int[] selectionSort(int[] numbers){
        int length = numbers.length;
        for(int i = 0; i < length; i++){
            int lowestIndex = i;
            for(int j = i+1; j < length; j++){
                if(numbers[j] < numbers[lowestIndex]){
                    lowestIndex = j;
                };
            };
            int temp = numbers[i];
            numbers[i] = numbers[lowestIndex];
            numbers[lowestIndex] = temp;
        };
        return numbers;
    };
    
};

// O(n^2)