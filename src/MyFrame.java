import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class MyFrame extends JFrame{
    public String outputString = "";
    public boolean solutionDisplay = false;
    MyFrame() {
		Border border = BorderFactory.createLineBorder(Color.black, 3);
		
		JLabel title = new JLabel();
        Font currentFont = title.getFont();
        Font newFont = currentFont.deriveFont(Font.PLAIN, 50);

		title.setText("Calculator");
		title.setFont(newFont);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(250,0,300,100);
		
        //Buttons 0-9
		JButton one = new JButton();
        one.setBounds(200, 200, 100, 100);
		one.setText("1");

        JButton two = new JButton();
        two.setBounds(300, 200, 100, 100);
        two.setText("2");
		
        JButton three = new JButton();
        three.setBounds(400, 200, 100, 100);
        three.setText("3");
        
        JButton four = new JButton();
        four.setBounds(200, 300, 100, 100);
        four.setText("4");
        
        JButton five = new JButton();
        five.setBounds(300, 300, 100, 100);
        five.setText("5");

        JButton six = new JButton();
        six.setBounds(400, 300, 100, 100);
        six.setText("6");

        JButton seven = new JButton();
        seven.setBounds(200, 400, 100, 100);
        seven.setText("7");
        
        JButton eight = new JButton();
        eight.setBounds(300, 400, 100, 100);
        eight.setText("8");

        JButton nine = new JButton();
        nine.setBounds(400, 400, 100, 100);
        nine.setText("9");

        JButton zero = new JButton();
        zero.setBounds(200, 500, 100, 100);
        zero.setText("0"); 

        JButton comma = new JButton();
        comma.setBounds(300, 500, 100, 100);
        comma.setText(".");

        JButton delete = new JButton();
        delete.setBounds(500, 200, 100, 100);
        delete.setText("Delete");

        JButton addition = new JButton();
        addition.setBounds(500, 300, 100, 100);
        addition.setText("Add");

        JButton substraction = new JButton();
        substraction.setBounds(500, 400, 100, 100);
        substraction.setText("Sub");

        JButton multiplication = new JButton();
        multiplication.setBounds(500, 500, 100, 100);
        multiplication.setText("Mult");

        JButton division = new JButton();
        division.setBounds(400, 500, 100, 100);
        division.setText("Div");
        
        JButton calculate = new JButton();
        calculate.setBounds(200, 600, 400, 100);
        calculate.setText("Calculate");

        //Output Label
		JLabel output = new JLabel();
		output.setText(outputString);
		output.setBorder(border);
		output.setVerticalAlignment(JLabel.CENTER);
		output.setHorizontalAlignment(JLabel.CENTER);
		output.setBounds(200,100,400,100);
		
        //Button Functions
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "1";
                output.setText(outputString);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "2";
                output.setText(outputString);
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "3";
                output.setText(outputString);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "4";
                output.setText(outputString);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "5";
                output.setText(outputString);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "6";
                output.setText(outputString);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "7";
                output.setText(outputString);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "8";
                output.setText(outputString);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "9";
                output.setText(outputString);
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "0";
                output.setText(outputString);
            }
        });
        comma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + ".";
                output.setText(outputString);
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!solutionDisplay) {
                    if(!outputString.isEmpty()) {
                        outputString = outputString.substring(0, outputString.length() - 1);
                    }
                    output.setText(outputString);
                } else {
                    outputString = "";
                    output.setText(outputString);
                    solutionDisplay = false;
                }
            }
        });
        addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "+";
                output.setText(outputString);
            }
        });
        substraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "-";
                output.setText(outputString);
            }
        });
        multiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "*";
                output.setText(outputString);
            }
        });
        division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputString = outputString + "/";
                output.setText(outputString);
            }
        });
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CalculationMachine calculation = new CalculationMachine(outputString);
                output.setText(calculation.calculateFloat());
                solutionDisplay = true;
            }
        });

		this.setTitle("Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 800);
		this.setResizable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.add(title);
		this.add(output);
		this.add(one);
        this.add(two);
        this.add(three);
        this.add(four);
        this.add(five);
        this.add(six);
        this.add(seven);
        this.add(eight);
        this.add(nine);
        this.add(zero);
        this.add(comma);
        this.add(delete);
        this.add(addition);
        this.add(substraction);
        this.add(multiplication);
        this.add(division);
        this.add(calculate);
	}
}
