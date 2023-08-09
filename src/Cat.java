import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

    class Cat extends Actor{

        Cat(Cell c) {
            super(c);
            //TODO Auto-generated constructor stub
        }
    
        public void paintCat(Graphics g){
              g.setColor(Color.BLUE);
        g.fillRect(cell.x, cell.y, size, size);
        g.setColor(Color.BLUE);
        g.drawRect(cell.x, cell.y, size,size);
        }
    
    }

