import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class BottomUpFibonacci{

    int calculate(int n){
        List<Integer> answer = new ArrayList<Integer>(Arrays.asList(0, 1));
        for(int i = 2; i <= n; i++){
            answer.add(answer.get(i - 1) + answer.get(i - 2));
        }
        return answer.get(answer.size() - 1);
    };

}