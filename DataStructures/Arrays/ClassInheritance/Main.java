public class Main{

    public static void main(String[] args){
        Player playerJay = new Player("Player Jay", "Warrior");
        playerJay.introduce();
        Wizard wizardJay = new Wizard("Wizard Jay", "Healer");
        wizardJay.introduce();
        wizardJay.play();
    };

};