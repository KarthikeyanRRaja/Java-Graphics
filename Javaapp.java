
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Javaapp extends Applet implements Runnable{
   
    private String msg = "123456789";
    private Thread t;
   
    public void start()
    {
        t = new Thread(this,"Animation");
        t.start();
    }
    
    public void run()
    {
        for(;;)
        {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ex){}
            
            msg +=msg.charAt(0);
            msg = msg.substring(1,msg.length());
            repaint();
        }
    }
    
    public void stop()
    {
        t.stop();
    }
    
    public void paint(Graphics g)
    {
        setBackground(Color.CYAN);
        Font currentFont = new Font("Impact", Font.BOLD, 22);
        g.setFont(currentFont);
        g.drawString(msg, 100, 100);
    }
public static void main(String ar[])
{
}
}
