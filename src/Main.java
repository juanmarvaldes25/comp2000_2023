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
this.setVisible(true);

    }

    class Canvas extends JPanel{

    }

}

