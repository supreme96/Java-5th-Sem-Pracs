import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Calc implements ActionListener{

	

	public static void main(String[] args){
		f = new Frame();
		f2 = new Panel();
		tf1 = new TextField(20);
		tf2 = new TextField(20);
		b1 = new Button("+");
		b2 = new Button("-");
		b1.addActionListener(new Calc());
		b2.addActionListener(new Calc());
		tf1.setBounds(10,50,100,30);
		tf2.setBounds(10,110,100,30);
		b1.setBounds(30,160,20,20);
		b2.setBounds(80,160,20,20);
		//GridLayout g = new GridLayout(1, 2);
		f.add(b1);
		f.add(b2);
		f.setLayout(null);
		//f2.setLayout(null);
		f.add(tf1);
		f.add(tf2);
		f.setSize(300,500);
		//f2.setSize(250, 200);
		//f.add(f2);
		f.setVisible(true);
	}

	static Frame f;
	static Panel f2;
	static TextField tf1, tf2;
	static Button b1, b2;

	public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == b1){
			int i1 = Integer.parseInt(tf1.getText().toString());
			int i2 = Integer.parseInt(tf2.getText().toString());
			int result = i1 +i2;
			tf1.setText(Integer.toString(result));
		}
		else if(ae.getSource() == b2){
			int i1 = Integer.parseInt(tf1.getText().toString());
			int i2 = Integer.parseInt(tf2.getText().toString());
			int result = i1 - i2;
			tf1.setText(Integer.toString(result));
		}
	}

}