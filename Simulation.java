import java.util.ArrayList;

/**
 * Write a description of class Simulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulation {
    ArrayList<Player> players = new ArrayList<Player>();{
    players.add(new TitForTat( ));
    players.add(new Competitor( ));
    players.add(new RandomChooser( ));
    players.add(new Unforgiving( ));
    players.add(new Player( ));
    }
    final static boolean DEBUGGING = false;
    for(int x =0; z < 500; x++){
    p1 = players.get(int)(Math.random()*players.size());
    Player p2 = new Player ( );
    }
    
    public Simulation ( ) {
        this (200);
    }
    
    public Simulation (int gameCount) {

        for (int k=0; k<gameCount; k++) {
            boolean p1cooperated = p1.cooperates ( );
            boolean p2cooperated = p2.cooperates ( );
            if (p1cooperated) {
                if (p2cooperated) {
                    p1.increaseScore (3);
                    p2.increaseScore (3);
                } else {
                    p1.increaseScore (0);
                    p2.increaseScore (5);
                }
            } else {
                if (p2cooperated) {
                    p1.increaseScore (5);
                    p2.increaseScore (0);
                } else {
                    p1.increaseScore (1) ;
                    p2.increaseScore (1);
                }
            }
            if (DEBUGGING) {
                System.out.println ("p1 " + p1cooperated + ", p2 " + p2cooperated);
                System.out.println ("p1 score = " + p1.score ( ) + ", p2 score = " + p2.score ( ));
            }
    
            p1.remember (p2cooperated);
            p2.remember (p1cooperated);
        }
        System.out.println ("Player 1 has " + p1);
        System.out.println ("Player 2 has " + p2);
    }
    for(Player p: players){
        System.out.println(p);
    }
    

}

