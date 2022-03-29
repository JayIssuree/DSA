import java.util.Arrays;

class Main {

    public static void main(String[] args){
        int[] numbers = {99, 5, 12, 8, 15, 7};
        System.out.println(Arrays.toString(quickSort(numbers)));
    };

    static int[] quickSort(int[] arr){
        if(arr.length == 1){
            return arr;
        };

        int pivotIndex = arr.length/2;
        int comparisonIndex = 0;

        while(comparisonIndex < arr.length - 1){
            if(comparisonIndex == pivotIndex){
                comparisonIndex++;
            };

            if(comparisonIndex < pivotIndex){
                if(arr[comparisonIndex] <= arr[pivotIndex]){
                    comparisonIndex++;
                } else if(arr[comparisonIndex] > arr[pivotIndex]){
                    if(pivotIndex - comparisonIndex == 1){
                        int temp = arr[comparisonIndex];
                        arr[comparisonIndex] = arr[pivotIndex];
                        arr[pivotIndex] = temp;
                        comparisonIndex++;
                        pivotIndex--;
                    } else {
                        int temp = arr[pivotIndex - 1];
                        arr[pivotIndex - 1] = arr[pivotIndex];
                        arr[pivotIndex] = temp;
                        pivotIndex--;
                        arr[pivotIndex + 1] = arr[comparisonIndex];
                        arr[comparisonIndex] = temp;
                    };
                };
            };

            if(comparisonIndex > pivotIndex){
                if(arr[comparisonIndex] > arr[pivotIndex]){
                    comparisonIndex++;
                } else if(arr[comparisonIndex] < arr[pivotIndex]){
                    if(comparisonIndex - pivotIndex == 1){
                        int temp = arr[comparisonIndex];
                        arr[comparisonIndex] = arr[pivotIndex];
                        arr[pivotIndex] = temp;
                        comparisonIndex++;
                        pivotIndex++;
                    } else {
                        int temp = arr[pivotIndex + 1];
                        arr[pivotIndex + 1] = arr[pivotIndex];
                        arr[pivotIndex] = temp;
                        pivotIndex++;
                        arr[pivotIndex - 1] = arr[comparisonIndex];
                        arr[comparisonIndex] = temp;
                    };
                };
            }
        };

        int[] left = Arrays.copyOfRange(arr, 0, pivotIndex);
        int[] right = Arrays.copyOfRange(arr, pivotIndex, arr.length);

        return quickSort(left);

    };

};