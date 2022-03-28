import java.util.Arrays;

class Main{

    public static void main(String[] args){
        int[] numbersArr = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(bubbleSort(numbersArr)));
        System.out.println(Arrays.toString(bubbleSort2(numbersArr)));
    };

    static int[] bubbleSort(int[] numbers){
        int count = 1;
        int length = numbers.length;
        for(int j = length; j > 1; j-- ){
            int indexA = 0;
            int indexB = 1;
            for(int i = 0; i < length - count; i++){
                if(numbers[indexA] > numbers[indexB]){
                    int temp = numbers[indexB];
                    numbers[indexB] = numbers[indexA];
                    numbers[indexA] = temp;
                };
                indexA++;
                indexB++;
            };
        count++;
        };
        return numbers;
    };

    static int[] bubbleSort2(int[] numbers){
        int length = numbers.length - 1;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                };
            };
        };
        return numbers;
    };

};

// O(n^2)