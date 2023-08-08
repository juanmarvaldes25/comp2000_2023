import javax.swing.JFrame;
/**import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Grid{
    // fields
    int cellHeight= 35;
    Cell[][] cells = new Cell[20][20];
  
    // constructors
    public Grid() {
      for(int i=0; i<cells.length; i++) {
        for(int j=0; j<cells[i].length; j++) {
          cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
        }
      }
    }

    public void paint(Graphics g){
        for(int i=0; i<cells.length; i++) {
            for(int j=0; j<cells[i].length; j++) {
              cells[i][j].drawCell(g);
            }
          }
        }
    }

**/
import java.awt.Graphics;

public class Grid {
  // fields
  Cell[][] cells = new Cell[20][20];

  // constructors
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }
  // methods
  public void paint(Graphics g) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g);
      }
    }
  }
}
