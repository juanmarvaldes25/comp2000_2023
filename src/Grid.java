import javax.swing.JFrame;
import javax.swing.*;
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
          cells[i][j] = new Cell(10+cellHeight*i, 10+cellHeight*j);
        }
      }
    }

    public void paint(Graphics g){
        for(int i=0; i<cells.length; i++) {
            for(int j=0; j<cells[i].length; j++) {
              Cell.drawCell(g, cells[i][j]);
            }
          }
        }
    }

