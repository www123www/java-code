import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CalculatorWindos extends JFrame{
    JMenuBar bar;
	JMenu look,edit,help; 
    JPanel p;
    JTextArea t;
    String str[]={"7","8","9","/","%",
    		      "4","5","6","*","1/x",
    		      "1","2","3","-","=",
    		      "0",".","=","+"};


	/*按钮*/
    JButton btn[];
	public CalculatorWindos(String s,int x,int y,int width,int height) {
    /*布局*/
	/*居中布局*/
	setLayout(new BorderLayout());
    init(s);
    /*设置位置，大小*/
      setLocation(x,y);
   	  setSize(width,height);
   	  setVisible(true);
   	setLocationRelativeTo(null);
   	  setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   	  	 
    	 
     }
     void init(String s) {
    	 /********************************/
    	 setTitle(s);
    	 bar=new JMenuBar();
    	 look=new JMenu("查看(V)");
    	 edit=new JMenu("编辑(E)");
    	 help=new JMenu("帮助(H)");
    	 bar.add(look);
    	 bar.add(edit);
    	 bar.add(help);
    	 setJMenuBar(bar);
    	 /********************************/
    	 	//显示计算结果
    	    t=new JTextArea(5,10);
     
    	    //按钮
	    	p=new JPanel(new GridLayout(4,5,3,3));
	    	btn=new JButton[str.length];
	    	//循环定义按钮，并添加到面板中
				for(int i=0;i<str.length;i++){
				 btn[i]=new JButton(str[i]);
				 p.add(btn[i]);
				}
		/**********************************/     
     
     getContentPane().add(t,BorderLayout.NORTH); 
     getContentPane().add(p,BorderLayout.CENTER);
     }
}
