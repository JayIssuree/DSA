import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ReverseString {

    public static void main(String[] args){
        System.out.println(reverseSentence(args));
        System.out.println(reverseString("Hello Jay"));
    };

    static String reverseWord(String word){
        String reversedWord = new String();
        for(int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        };
        return reversedWord;
    };

    static String reverseSentence(String[] sentence){
        List<String> reversedSentence = new ArrayList<String>();
        for(int i = sentence.length - 1; i >= 0; i--){
            reversedSentence.add(reverseWord(sentence[i]));
        };
        return String.join(" ", reversedSentence);
    };

    static String reverseString(String string){
        // String reversedString = new String();
        // for(int i = string.length() - 1; i >= 0; i--){
        //     reversedString += string.charAt(i);
        // };

        // return reversedString;
        
        StringBuilder reversedString = new StringBuilder(string);
        reversedString.reverse();

        return reversedString.toString();
    };

};

// O(n)