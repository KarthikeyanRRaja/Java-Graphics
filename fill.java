import java.applet.*;
import java.awt.*;

public class fill extends Applet {
   public void paint(Graphics g) {
      //g.drawRect(200,200,200,200);
      //g.drawString("Square",500,150);
	g.fillRect(300,150,200,200);
	g.setColor(Color.red);
	g.fillRect(300,150,150,200);
	g.setColor(Color.yellow);
	
	g.fillRect(50,150,200,200);
	g.setColor(Color.pink);
   }
public static void main(String ar[])
{
}
}