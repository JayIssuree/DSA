public class FindNemo {

    static String[] nemoCharacters = {"Marlin", "Darla", "Bruce", "Gill", "Crush", "Nemo", "Mr. Ray", "Nigel", "Bubbles", "Dory", "Peach", "Flo"};

    public static void main(String[] args){
        System.out.println(findNemoCharacter(args[0]));
    };

    public static String findNemoCharacter(String name){
        for (int i = 0; i < nemoCharacters.length; i++){
            if (nemoCharacters[i].equals(name)) {
                return name + " found";
            };
        };
        return name + " not found";
    };

};

// O(n)