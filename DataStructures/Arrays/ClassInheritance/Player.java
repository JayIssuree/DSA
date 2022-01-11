public class Player {

    String name;
    String type;

    public Player(String name, String type){
        this.name = name;
        this.type = type;
    };

    public void introduce(){
        System.out.println("Hello I am " + this.name + ", I'm a " + this.type);
    };

};