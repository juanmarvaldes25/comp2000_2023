import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stage {
  Grid grid;
  List<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<Actor>();
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors) {
      a.paint(g);
    }
    Optional<Cell> mouseOverCell = grid.cellAtPoint(mouseLoc);
    if(mouseOverCell.isPresent()){
      Cell cell = mouseOverCell.get();
      System.out.println(cell);
    }
    else{
   System.out.println("Mouse not over cell");
    }
  }

}
