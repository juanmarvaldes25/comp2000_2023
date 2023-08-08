/**import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Main extends JFrame {


    public static void main(String[] args) throws Exception {
        //System.out.println("Red vs. Blue");
        Main window = new Main();

    }

    private Main(){
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
       this.setContentPane(canvas);
       this.pack();
this.setVisible(true);

    }

    class Canvas extends JPanel{
     Grid grid = new Grid()
;

        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
           
        }

         @Override
        public void paint(Graphics g){
           // g.drawRect(10, 10, 700, 700);

            grid.paint(g);

    }
}
}
       **/

       import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
    }

    class Canvas extends JPanel {
      Grid grid = new Grid();
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
        grid.paint(g);
      }
    }
}

      

     



  
   

 
    
  
   



