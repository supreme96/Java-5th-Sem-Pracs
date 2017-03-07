import java.awt.*;
import java.awt.event.*;
public class MouseAdapterClassDemo extends Frame
{
  public MouseAdapterClassDemo()
  {
    MouseHandle mh = new MouseHandle();
    addMouseListener(mh);
    setSize(300, 300);
    setVisible(true);
  } 


  public static void main(String args[])
  {
    new MouseAdapterClassDemo();
  }
}
class MouseHandle extends MouseAdapter  // second class             
{
  public void mouseClicked(MouseEvent e)
  {
    System.out.println("You clicked mouse at coordinates " + e.getX() + ", " + e.getY());
  }
} 
