
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIterator implements Iterator{
    Cell[][] cells;
    List<Cell> cellList;
    int pos = 0;

    public ArrayIterator (Cell[][] c){
        cells = c;
        List<Cell> temp = new ArrayList<Cell>();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) { 
        temp.add(cells[i][j]);
    }
}
cellList = temp;
}

    public Object next(){
Cell cell = cellList.get(pos);
pos = pos+1;
return cell;
    }


    public boolean hasNext(){
        if (pos >= cellList.size()|| cellList.get(pos) == null) {
            return false;
            } else {
            return true;
            }
            }
    }

