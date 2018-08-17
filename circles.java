
import java.awt.Graphics;
	import java.applet.Applet;
	/*<applet code="circle" width="500" height="400">
	</applet>*/

	
	public class circles extends Applet
	{
	  public void paint (Graphics g)
	  {			                 // using drawRoundRect()
	    g.drawRoundRect(40, 50, 90, 90, 200, 200);
	   // g.fillRoundRect(40, 160, 90, 90, 200, 200);
	//g.drawArc(90,150,30,30, 0, 180);
	//g.drawArc(140,150,30,30,180,180);
	g.fillArc(230,200,30,30, 0, 180);
g.fillArc(170,200,30,30, 180, 180);
	  }
	
	public static void main(String ar[])
	{
		
	}
	}
