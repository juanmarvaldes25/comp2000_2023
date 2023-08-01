import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;


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
        public Canvas(){
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        public void paint(Graphics g){
            g.drawRect(10, 10, 700, 700);

            for(int i = 10; i < 710; i+= 35){
                for(int j = 10; j < 710; j+= 35){
                    g.drawRect(i, j , 35, 35);
                }
            }
        }
 
    }

   

}

