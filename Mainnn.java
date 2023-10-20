import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Mainnn{

	public static void main(String args[]){

		JFrame frame = new JFrame();
		JTextField textField;

		textField = new JTextField("");
		textField.setBounds(65, 150,275,100);
		frame.add(textField);

		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);

		JButton startBtn = new JButton("START");
		startBtn.setBounds(30, 300, 100 , 50);
		startBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setText("WELCOME TO MY LIFE");
			}

		});
		frame.add(startBtn);

		JButton stopBtn = new JButton("STOP");
		stopBtn.setBounds(150, 300, 100, 50);
		frame.add(stopBtn);

		JButton resetBtn = new JButton("RESET");
		resetBtn.setBounds( 270, 300 , 100 , 50);
		resetBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				textField.setText("");
			} 

		});
		frame.add(resetBtn);
	}
}