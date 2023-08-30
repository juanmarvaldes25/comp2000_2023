
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class MoveOnEvenRow implements AIMovementBehaviour{
    Actor a;
    //List<Cell> possibleLocs;

    MoveOnEvenRow(Actor b){
    a = b;

    }
    public void move(List<Cell> possibleLocs){
       
          int moveBotChooses;
          
           moveBotChooses = (new Random()).nextInt(possibleLocs.size()/2);
           System.out.println("Decided point even row = " + moveBotChooses);
          // System.out.println("possible locations size = " + possibleLocs.size());
        
          a.setLocation(possibleLocs.get(moveBotChooses));
    }
}
