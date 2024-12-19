public class Game {
    Player p; 
    Dice d;

    Game(){
        p = new Player();
        d = new Dice();
    }
    void start() {
        p.turn(d);
        
    }
    void judge(){
        System.out.println(d.me);
    }
}
