import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class MyMaxBinaryHeap {

    List<Integer> data = new ArrayList<Integer>();

    void insert(int value){
        data.add(value);
        bubbleUp();
    };

    void bubbleUp(){
        int index = data.size() - 1;
        int element = data.get(index);
        while(index > 0){
            int parentIndex = (int) Math.floor((index - 1)/2);
            int parent = data.get(parentIndex);
            if(element <= parent) {
                break;
            } else {
                data.set(parentIndex, element);
                data.set(index, parent);
                index = parentIndex;
            };
        };
    };

    void printBinaryHeap(){
        System.out.println(Arrays.deepToString(data.toArray()));
    };

};