public class Game {
    Player p1;
    Player p2;
    Dice d1;
    Dice d2;
    Game() {
            p1 = new Player();
            p2 = new Player();
            d1 = new Dice();
            d2 = new Dice();
        }

    void start() {
        p1.turn(d1);
        p2.turn(d2);

        if (d1==d2) {
            System.out.println("Player1:"+d1.me+"Player2:"+d2.me+"結果:あいこ");
        }
        else {
            if(d1.me>d2.me){
                System.out.println("Player1:"+d1.me+"Player2:"+d2.me+"結果:Player1の勝ち");
            }
            else{
                System.out.println("Player1:"+d1.me+"Player2:"+d2.me+"結果:Player1の負け");
            }
        }
}
}
