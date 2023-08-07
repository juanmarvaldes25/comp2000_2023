import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Grid extends JPanel{
ArrayList<Cell> cells = new ArrayList<Cell>();
int width; int height; int cellSize;

    public Grid(){
        width = 720;
        height = 720;
        cellSize = 35;
        setPreferredSize(new Dimension(width,height));

    }

    public void setUp(){
        int cellx = 0;
        int celly = 0;
       Cell c = new Cell(cellx, celly, cellSize, cellSize);
       Cell temp = c;

       while(temp.x < 720){

        if

        
       }
    }

    public void myPaint(Graphics g){
        
    }
}