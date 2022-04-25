package behavioral.mediator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class MultiplyColleaguePanel extends JPanel implements ActionListener, IColleague {

	private IMediator mediator;

	private JTextField tfFirstNumber = new JTextField("100", 5);
	private JTextField tfSecondNumber = new JTextField("20", 5);

	private JLabel lbOperlator = new JLabel("*", SwingConstants.CENTER);
	private JLabel lbEqual = new JLabel("=", SwingConstants.CENTER);
	private JTextField tfAnswer = new JTextField(5);

	public MultiplyColleaguePanel() {
		tfAnswer.setEnabled(false);

		setLayout(new GridLayout(1, 5));

		setBorder(new EtchedBorder());

		add(tfFirstNumber);
		add(lbOperlator);
		add(tfSecondNumber);
		add(lbEqual);
		add(tfAnswer);

		tfFirstNumber.addActionListener(this);
		tfSecondNumber.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source == tfFirstNumber) {
			mediator.colleagueChanged(this);
		} 
		else if (source == tfSecondNumber) {
			mediator.colleagueChanged(this);
		}
	}

	public void setFirstNumber(int firstNumber) {
		tfFirstNumber.setText("" + firstNumber);
	}

	public void setSecondNumber(int secondNumber) {
		tfSecondNumber.setText("" + secondNumber);
	}

	public void setAnswer(int answer) {
		tfAnswer.setText("" + answer);
	}

	@Override
	public void setMediator(IMediator mediator) {
		this.mediator = mediator;
	}

	public int getFirstNumber() {
		return Integer.parseInt(tfFirstNumber.getText());
	}

	public int getSecondeNumber() {
		return Integer.parseInt(tfSecondNumber.getText());
	}

	@Override
	public void printAnswer(int answer) {
		tfAnswer.setText("" + answer);
	}

}
