import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;

public class Grid {
  Cell[][] cells = new Cell[20][20];
  
  public Grid() {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j] = new Cell(colToLabel(i), j, 10+Cell.size*i, 10+Cell.size*j);
      }
    }
  }

  private char colToLabel(int col) {
    return (char) (col + Character.valueOf('A'));
  }

  private int labelToCol(char col) {
    return (int) (col - Character.valueOf('A'));
  }

  public void paint(Graphics g, Point mousePos) {
    for(int i=0; i<cells.length; i++) {
      for(int j=0; j<cells[i].length; j++) {
        cells[i][j].paint(g, mousePos);
      }
    }
  }

  public Cell cellAtColRow(int c, int r) {
    return cells[c][r];
  }

  public Cell cellAtColRow(char c, int r) {
    return cellAtColRow(labelToCol(c), r);
  }

  public Optional<Cell> cellAtPoint(Point p){

    int a, b;
Optional<Cell> optional;

    try{
      a = (int) p.getX(); b = (int) p.getY();
       optional = Optional.ofNullable(cells[a][b]); 
      return optional;
    }
     
    catch(Exception e){
      System.out.println("Invalid point");
return optional;
    }
  
  finally{

  }

}
}
