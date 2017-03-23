import javax.swing.*;
import java.awt.*;

/**
 * Created by The Dark Avenger on 3/11/2017.
 */
public class Moving implements Runnable{

    final static int fwidth = 500;
    final static int fheight = 500;
    final static int radius = 50;
    int x = radius/2 + 10;
    int y = radius/2 + 10;



    public static void main(String[] args) {
        Moving move = new Moving();
        move.start();
    }

    public void start() {
        JFrame frame = new JFrame("This is my homework.");
        Artwork myArt = new Artwork();
        frame.add(myArt);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(fwidth,fheight);
        frame.setVisible(true);

        while(true) {
            (new Thread(new Moving())).start();

        }
    }

    public class Artwork extends JPanel implements Runnable{
        public void paintComponent (Graphics g) {
            Color background = Color.cyan;
            Color circle = Color.black;
            g.setColor(background);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(circle);
            g.fillOval(x,y,radius,radius);
        }

        public void run(){

        }
    }

    public void run(){
        long sleepTime = 1000;
        //move the shape in some way
        //cycle through an array of shape options?
        try{
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            return;
        }
    }
}
