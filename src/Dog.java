import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

class Dog extends Actor{

    Dog(Cell c) {
        super(c);
        //TODO Auto-generated constructor stub
    }

     public void paintDog(Graphics g){
          g.setColor(Color.YELLOW);
    g.fillRect(cell.x, cell.y, size, size);
    g.setColor(Color.YELLOW);
    g.drawRect(cell.x, cell.y, size,size);
    }

}
