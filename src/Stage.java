
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

//import Actor.Cat;

//import Actor.Bird;

public class Stage {
    Grid grid;
    Actor[] actors;

    Stage(){
        grid = new Grid();
        actors = new Actor[3];

        actors[0] = new Cat(grid.cells[17][5]);
        actors[1] = new Dog(grid.cells[14][12]);
        actors[2] = new Bird(grid.cells[11][3]);
    }

public void drawStage(Graphics g){
    grid.paint(g);
((Cat) actors[0]).paintCat(g);
((Dog) actors[1]).paintDog(g);
((Bird) actors[2]).paintBird(g);
}
}
