import java.applet.Applet;
import java.awt.*;
public class slide extends Applet
{

public void init() {
    images = new Image[3];
    text = new String[3];
    captions = new Label();
    setLayout(new BorderLayout());
    add(BorderLayout.SOUTH, captions);

    Label name = new Label("by Claude Monet");
    name.setAlignment(Label.CENTER);
    add(BorderLayout.EAST, name);

    URL fig = null;
    try {
      fig = new URL(
    "http://developer.java.sun.com:8080/" +
    "developer/technicalArticles/Threads/applet/");
    } catch (java.net.MalformedURLException ex) {
      System.out.println("Bad URL");
      return;
    }

    images[0] = getImage(fig, "bordighera.jpg");
    images[1] = getImage(fig, "etretat.jpg");
    images[2] = getImage(fig, "leyden.jpg");
    text[0] = "Garden in Bordighera";
    text[1] = "Rock Arch West of Etretat";
    text[2] = "Bulbfield and Windmill near Leyden";
    printThreadName("init is ");

    startThread();
  }
 private void startThread() {
     paused = true;
     noStopRequested = true;

     // Use this inner class to hide
     // the public run method
     Runnable r = new Runnable() {
       public void run() {
         runWork();
       }
     };
     timerThread = new Thread(r, "Timer");
     timerThread.start();
  }
 private void runWork() { 
    printThreadName("run is ");
    curFrame = 0;

    try {
      while ( noStopRequested ) {
        waitWhilePaused();

        curFrame = ( curFrame + 1 ) % 
		images.length;
        repaint();

        Thread.sleep(3000);
      }
    } catch ( InterruptedException x ) {
     // reassert interrupt
     Thread.currentThread().interrupt();
     System.out.println(
	"interrupt and return from run");
    }
  }
 private void setPaused(boolean newPauseState) {
    synchronized ( pauseLock ) {
      if ( paused != newPauseState ) {
        paused = newPauseState;
        pauseLock.notifyAll();
      }
    }
  }

  private void waitWhilePaused() 
		throws InterruptedException {
    synchronized ( pauseLock ) {
      while ( paused ) {
        pauseLock.wait();
      }
    }
  }
public static void main(String ar[])
{
}
}