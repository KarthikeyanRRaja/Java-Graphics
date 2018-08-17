
import java.awt.Graphics;
	import java.applet.Applet;
	/*<applet code="circle" width="500" height="400">
	</applet>*/

	
	public class circle extends Applet
	{
	  public void paint (Graphics g)
	  {			                 // using drawRoundRect()
	    g.drawRoundRect(40, 50, 90, 90, 200, 200);
	   // g.fillRoundRect(40, 160, 90, 90, 200, 200);

				                // using drawArc()
	    g.drawArc(200, 400, 100, 80, 0, 180);
	g.drawLine(200,60,300,60);
	    //g.fillArc(, 160, 90, 90, 0, 360);
	  }
	
	public static void main(String ar[])
	{
		
	}
	}
