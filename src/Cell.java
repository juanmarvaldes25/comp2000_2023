import javax.swing.JFrame;
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

public static void drawCell(Graphics g, Cell C){

g.drawRect(C.x,C.y,C.size,C.size);
}
}