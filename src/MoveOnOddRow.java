import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class MoveOnOddRow implements AIMovementBehaviour {

    Actor actor;

    MoveOnOddRow(Actor b){
    actor = b;
    }


    public void move(List<Cell> possibleLocs){
        int moveBotChooses;
          
        moveBotChooses = (possibleLocs.size()-1);
        System.out.println("Decided point off row = " + moveBotChooses);
        //System.out.println("possible locations size = " + possibleLocs.size());
     
       actor.setLocation(possibleLocs.get(moveBotChooses));
 }
    }
    

