import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
 /// Actor cat;
 // Actor dog;
 // Actor bird;
  ArrayList<Actor> actors;

  public Stage() {
    grid = new Grid();
    actors = new ArrayList<>();

   actors.add(new Cat(grid.cellAtColRow(0, 0)));
    actors.add(new Dog(grid.cellAtColRow(3, 9)));
   actors.add(new Bird(grid.cellAtColRow(19, 12)));

  }

 // public <T extends Actor> void addActor(Actor a){
  //  actors.add(a);
 // }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for(Actor a: actors){
      a.paint(g);
    }
  }
}
