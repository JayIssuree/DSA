public class PrintArrayPairs {

    static String[] lettersArray = {"A", "B", "C", "D", "E"};

    public static void main(String[] args){
        for(int i = 0; i < lettersArray.length; i++){
            for(int j = 0; j < lettersArray.length; j++){
                System.out.println(lettersArray[i] + lettersArray[j]);
            };
        };
    };

};

// O(n^2)