public class Wizard extends Player{

    Wizard(String name, String type){
        super(name, type);
    };

    public void play(){
        System.out.println("I'm a wizard casting a spell");
    };

};