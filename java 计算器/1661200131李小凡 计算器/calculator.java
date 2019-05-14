package calculator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculator extends JFrame implements ActionListener {
	private final String[] str = { "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", ".", "0", "=", "+" };
	JButton[] buttons = new JButton[str.length];
	JTextField display = new JTextField("0"); // 文本框
	JButton AC = new JButton("AC");
	JPanel pnlhead = new JPanel(); // 面板1 显示面板
	JPanel pnlBody = new JPanel(); // 面板2 按钮

	public calculator() {

		super("计算器");
		Font font = new Font("Consolas", Font.BOLD, 20);// 字体设置

		// 面板1
		JPanel pnlhead = new JPanel(new BorderLayout());
		pnlhead.add(display, BorderLayout.CENTER);// 文本框放中间
		pnlhead.add(AC, BorderLayout.EAST); // 重置键放在东边
		display.setFont(font);
		AC.setFont(font);

		// 面板2
		JPanel pnlBody = new JPanel(new GridLayout(4, 4));// 4x4网格布局
		for (int i = 0; i < str.length; i++) {
			buttons[i] = new JButton(str[i]);
			buttons[i].setFont(font);
			pnlBody.add(buttons[i]);
		}

		// 事件添加
		for (int i = 0; i < str.length; i++) {
			buttons[i].addActionListener(this);
		}
		AC.addActionListener(this);
		display.addActionListener(this);

		// 总布局组件添加
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add("North", pnlhead);
		getContentPane().add("Center", pnlBody);
		setSize(300, 300);
		setVisible(true); // 界面可视化
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args) {
		calculator c = new calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object target = e.getSource();
		String cmd = e.getActionCommand();
		if (target == AC)
			handleReset();
		else if ("0123456789".indexOf(cmd) > 0)
			handleNumber(cmd);
		else
			handleOperator(cmd);
	}

	boolean isFirstDigit = true;
	double number = 0.0;
	String operator = "=";

	private void handleReset() {
		display.setText("0");
		isFirstDigit = true;
		operator = "=";

	}

	private void handleOperator(String cmd) {
		double dDisplay = Double.valueOf(display.getText());
		switch (operator) {
		case "+":
			number += dDisplay;
			break;
		case "-":
			number -= dDisplay;
			break;
		case "*":
			number *= dDisplay;
			break;
		case "/":
			number /= dDisplay;
			break;
		case "=":
			number = dDisplay;
			break;
		}
		display.setText(String.valueOf(number));
		operator = cmd;
		isFirstDigit = true;
	}

	private void handleNumber(String key) {
		if (isFirstDigit)
			display.setText(key);
		else if (!key.equals("."))
			display.setText(display.getText() + key);
		else if (display.getText().indexOf(".") < 0)
			display.setText(display.getText() + ".");
		isFirstDigit = false;
	}
}
