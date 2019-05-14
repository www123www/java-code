package chap;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


 class Window extends JFrame implements ActionListener{
	JTextField textShow;
	JButton button_1;
	JButton button_2;
	JButton button_3;

	JButton button_add;
	JButton button_del;
	JButton button_result;
	JButton button_c;
	
	int number1=0;
    int number2=0;
    int num=0;

	public Window() {
		      init();
		      setVisible(true);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   }
    void init() {
		      setLayout(null);
		     
		      button_1 = new JButton("1"); 
		      button_2 = new JButton("2"); 
		      button_3 = new JButton("3"); 
		  
		      button_add = new JButton("+");
		      button_del = new JButton("-");
		      button_result = new JButton("=");
		      button_c = new JButton("CE");
		      textShow = new JTextField();
		      textShow.setHorizontalAlignment(JTextField.RIGHT);
		      textShow.setBounds(0, 0, 180, 30);
		      button_1.setBounds(0,30, 60, 28);
		      button_2.setBounds(60,30, 60, 28);
		      button_3.setBounds(120,30, 60, 28);
		      
		      button_add.setBounds(0,60, 60, 28);
		      button_del.setBounds(60,60, 60, 28);
		      button_result.setBounds(120,60, 60, 28);
		      button_c.setBounds(180,60, 60, 28);
		      add(textShow);
		      add(button_1);
		      add(button_2);
		      add(button_3);
		      add(button_add);
		      add(button_del);
		      add(button_result);
		      add(button_c);
		      button_1.addActionListener(this);
		      button_2.addActionListener(this);
		      button_3.addActionListener(this);
		      button_add.addActionListener(this);
		      button_del.addActionListener(this);
		      button_result.addActionListener(this);
		      button_c.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
    
    	
    	if(e.getSource()==button_c){
    		textShow.setText("");
    		num=0;
    	}
    	if(num==3){
    		textShow.setText("");
    		num=0;
    	}
    	if(e.getSource()==button_1){
    		String s= textShow.getText();
    		textShow.setText(s+"1");
    	}
    	else if(e.getSource()==button_2){
    		String s= textShow.getText();
    		textShow.setText(s+"2");
    	} 
    	else if(e.getSource()==button_3){
    		String s= textShow.getText();
    		textShow.setText(s+"3");
    	}
    	else if(e.getSource()==button_add){
    		number1=Integer.parseInt(textShow.getText());
    		num=1;
    		textShow.setText("");
    	}   
    	else if(e.getSource()==button_del){
    		number1=Integer.parseInt(textShow.getText());
    		num=2;
    		textShow.setText("");
    	}
    	else if(e.getSource()==button_result){
    		if(num==1){		
    		number2=Integer.parseInt(textShow.getText());
    		String s=String.valueOf(number1+number2);
    		textShow.setText(s);
    		num=3;
    	}
    		else if(num==2)
    		{
    			number2=Integer.parseInt(textShow.getText());
        		String s=String.valueOf(number1-number2);
        		textShow.setText(s);	
        	}
    	}
    }
   
}

public class computer {
   public static void main(String args[]) {
      Window win=new Window();
      win.setBounds(100,100,240,120);
      win.setTitle("简单计算器");
      win.setResizable(false);//窗口不可调整大小
      win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   }
}


