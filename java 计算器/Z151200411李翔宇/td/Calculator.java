package 计算器;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    JFrame jf;
    JTextField disPlay;
    String result;
    String oldResult;
    String history;

    public Calculator(String theTitle,int theWidth,int theHeight)
    {
        result = "0";
        oldResult = "0";
        history = "0";

        jf = new JFrame(theTitle);
        jf.setSize(theWidth,theHeight);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

        //显示框
        disPlay = new JTextField(30);
        disPlay.setText(result);
        disPlay.setHorizontalAlignment(JTextField.RIGHT);
        disPlay.setEditable(false);

        JPanel jPanel01 = new JPanel(new BorderLayout());
        jPanel01.add(disPlay);

        //按钮框
        String[] butName = new String[]{"CE","÷", "*","-", "7", "8", 
                "9", "+", "4", "5", "6", "=", "1", "2",  "3", "0"};

        JPanel jPanel02 = new JPanel(new GridLayout(4, 4));
        for (int i = 0; i < butName.length; i++) {
            JButton button = new JButton(butName[i]);
            button.setContentAreaFilled(false);
            button.addActionListener(this);
            jPanel02.add(button);
        }

        //布局
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.add(jPanel01,BorderLayout.NORTH);
        jPanel.add(jPanel02,BorderLayout.CENTER);

        jf.setContentPane(jPanel);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actButton = e.getActionCommand();
        double numBer = 0;
        if (actButton.equals("+") || actButton.equals("-") || actButton.equals("×") || actButton.equals("÷")){
            oldResult = result;
            result = "0";
            history = actButton;
        }else if (actButton.equals("±")){
            if (history.equals("+")){
                history = "-";
            }else{
                history = "+";
            }
        }else if (actButton.equals("CE")){
            result = "0";
        }else if (actButton.equals("C")){
            result = "0";
            history = "0";
        }else if (actButton.equals("=")){
            if (!history.equals("0")){
                result = Count();
                history = "0";
            }
        }else if(actButton.equals(".")){
            if(result.equals("0")){
                result = "0"+actButton;
            }else if(result.lastIndexOf(".") != -1){

            }else{
                result = result + actButton;
            }
        }else {
            if (result.equals("0")){
                result = actButton;
            }else if(result.length() > 15){

            }
            else {
                result = result + actButton;
            }
        }

        disPlay.setText(result);
    }

    public String Count(){
        double a = Double.parseDouble(oldResult);
        double b = Double.parseDouble(result);
        String result = "0";
        if (history.equals("+")){
            result = String.valueOf(a+b);
        }else if (history.equals("-")){
            result = String.valueOf(a-b);
        }else if (history.equals("×")){
            result = String.valueOf(a*b);
        }else if (history.equals("÷")){
            result = String.valueOf(a/b);
        }
        return result;
    }
}