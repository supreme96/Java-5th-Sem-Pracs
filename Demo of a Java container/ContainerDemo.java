import java.awt.*;

public class ContainerDemo{
	public static void main(String[] args){
		Container c = new Container();
		Button b = new Button("Button 1");
		b.setBounds(50,50,70,30);
		c.add(b);
		c.setSize(500,500);
		c.setLayout(null);
		c.setVisible(true);
	}
}