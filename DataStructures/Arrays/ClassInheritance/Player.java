public class Player {

    String name;
    String type;

    Player(String name, String type){
        this.name = name;
        this.type = type;
    };

    void introduce(){
        System.out.println("Hello I am " + this.name + ", I'm a " + this.type);
    };

};