import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;


public class Bird extends Actor{

    Bird(Cell c) {
        super(c);
        //TODO Auto-generated constructor stub
    }
    
     public void paintBird(Graphics g){
          g.setColor(Color.GREEN);
    g.fillRect(cell.x, cell.y, size, size);
    g.setColor(Color.GREEN);
    g.drawRect(cell.x, cell.y, size,size);
    }
}
