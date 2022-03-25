class Main{

    static String reversedStringA = "";
    static String reversedStringB = "";

     public static void main(String[] args){
        System.out.println(reverseStringRecursive("madkfha"));
        System.out.println(reverseStringIterative("abdullah"));
     };

    static String reverseStringRecursive(String str){
        if(str.length() == 0){
            return reversedStringA;
        };
        reversedStringA += (str.charAt(str.length() - 1));
        return reverseStringRecursive(str.substring(0, str.length() - 1));
    };

    static String reverseStringIterative(String str){
        for(int i = str.length() - 1; i > -1; i--){
            reversedStringB += str.charAt(i);
        };
        return reversedStringB;
    };

};