import java.awt.Graphics;
import java.awt.Point;
import java.util.Optional;
import java.util.function.Consumer;

public class Grid {
  Cell[][] cells = new Cell[20][20];

  public Grid() {
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
        cells[i][j] = new Cell(colToLabel(i), j, 10 + Cell.size * i, 10 + Cell.size * j);
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
    for (int i = 0; i < cells.length; i++) {
      for (int j = 0; j < cells[i].length; j++) {
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

  //task 12
  public Optional<Cell> cellAtPoint(Point p) {


    for(int i = 0; i < cells.length; i++){
      for(int j = 0; j <cells[i].length; j++){
        if(cells[i][j].contains(p)){
          return Optional.of(cells[i][j]);
        }
      }
    }
    return Optional.empty();

  }

  //task 15
  /**
     * Takes a cell consumer (i.e. a function that has a single `Cell` argument and
     * returns `void`) and applies that consumer to each cell in the grid.
     * @param func The `Cell` to `void` function to apply at each spot.
     */
    public void doToEachCell(Consumer<Cell> func) {
      // Your job to add the body
    }
}
