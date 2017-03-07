import java.awt.*;
import java.awt.event.*;

class grid implements FocusListener{

	static Frame f;	

	public static void main(String[] args){
		f = new Frame();
		f.setLayout(new GridLayout());
		Button b1 = new Button("Button1") ;
		Button b2 = new Button("Button2");
		b2.addFocusListener(new grid());
		f.add(b1);
		f.add(b2);
		f.setSize(300,300);
		f.setVisible(true);
	}

	public void focusGained(FocusEvent e){
		f.setTitle("Focus Gained");
	}

	public void focusLost(FocusEvent e){
		f.setTitle("Focus Lost");
	}

}