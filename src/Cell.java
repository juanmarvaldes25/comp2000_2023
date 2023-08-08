/**import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Cell{
static int size;
//int width;
int x;
int y;

Cell(){
   size = 35; x = 0; y = 0;
}

Cell(int a, int b){
   x = a; y = b;
}

public  void drawCell(Graphics g){
   g.setColor(Color.WHITE);
   g.fillRect(x, y, size, size);
   g.setColor(Color.BLACK);
g.drawRect(this.x,this.y,35,35);
}
}
**/
import java.awt.Color;
import java.awt.Graphics;

public class Cell {
  // fields
  int x;
  int y;
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    x = inX;
    y = inY;
  }

  // methods
  public void paint(Graphics g) {
    g.setColor(Color.WHITE);
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }
}