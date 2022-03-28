import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Main{

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));
        System.out.println(Arrays.toString(insertionSort(numbers).toArray()));
    };

    static List<Integer> insertionSort(List<Integer> numbers){
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < numbers.get(0)){
                int temp = numbers.get(i);
                numbers.remove(i);
                numbers.add(0, temp);
            } else {
                for(int j = 1; j < i; j++){
                    if(numbers.get(i) > numbers.get(j - 1) && numbers.get(i) < numbers.get(j)){
                        int temp = numbers.get(i);
                        numbers.remove(i);
                        numbers.add(j, temp);
                    };
                };
            };
        };
        return numbers;
    };

};