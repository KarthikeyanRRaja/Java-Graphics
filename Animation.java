import java.awt.*;

import java.applet.*;

public class Animation extends Applet 

  {

    Image pic;
	Image pic1;

    public void init()

      {

        pic=getImage(getDocumentBase(),"meals.jpeg");
	//pic.start();
	pic1=getImage(getDocumentBase(),"noodles.jpeg");
	//pic1.start();

      }

    public void paint(Graphics grp)

      {
        for(int i=50;i<600;i++)

          {
	    grp.drawImage(pic1, 10,30,this);
	                grp.drawImage(pic,i,80,this);
            try

              {
		

                Thread.sleep(100);

              }

            catch(Exception e){}

          }

      
}
public static void main(String ar[])
{
}

  }