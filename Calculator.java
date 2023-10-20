package oop.sectiong;

import javax.swing.*;
import java.awt.*;


class Calculator{

	public static void main(String args[]){

		JFrame frame = new JFrame();
		JTextField textField = new JTextField("");
		textField.setBounds(50, 30, 230, 80);
		frame.add(textField);

		frame.setSize(400,500);
		frame.setLayout(null);
		frame.setVisible(true);

		



		JButton star = new JButton("*");
		star.setBounds(50, 300, 50, 50);
		frame.add(star);

		JButton numZero = new JButton("0");
		numZero.setBounds(110, 300, 50, 50);
		frame.add(numZero);

		JButton dot = new JButton(".");
		dot.setBounds(170, 300, 50, 50);
		frame.add(dot);

		JButton equalSign = new JButton("=");
		equalSign.setBounds(230, 300, 50, 50);
		frame.add(equalSign);

		JButton numOne = new JButton("1");
		numOne.setBounds(50, 240, 50, 50);
		frame.add(numOne);

		JButton numTwo = new JButton("2");
		numTwo.setBounds(110, 240, 50, 50);
		frame.add(numTwo);

		JButton numThree = new JButton("3");
		numThree.setBounds(170, 240, 50, 50);
		frame.add(numThree);

		JButton divideSign = new JButton("/");
		divideSign.setBounds(230, 240, 50, 50);
		frame.add(divideSign);

		JButton numFour = new JButton("4");
		numFour.setBounds(50, 180, 50, 50);
		frame.add(numFour);

		JButton numFive = new JButton("5");
		numFive.setBounds(110, 180, 50, 50);
		frame.add(numFive);

		JButton numSix = new JButton("6");
		numSix.setBounds(170, 180, 50, 50);
		frame.add(numSix);

		JButton minusSign = new JButton("-");
		minusSign.setBounds(230, 180, 50, 50);
		frame.add(minusSign);

		JButton numSeven = new JButton("7");
		numSeven.setBounds(50, 120, 50, 50);
		frame.add(numSeven);

		JButton numEight = new JButton("8");
		numEight.setBounds(110, 120, 50, 50);
		frame.add(numEight);

		JButton numNine = new JButton("9");
		numNine.setBounds(170, 120, 50, 50);
		frame.add(numNine);

		JButton addSign = new JButton("+");
		addSign.setBounds(230, 120, 50, 50);
		frame.add(addSign);












	}
}
