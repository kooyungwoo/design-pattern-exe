package behavioral.mediator;

import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JFrame;

public class ClientMediatorFrame extends JFrame implements IMediator {

	private AddColleaguePanel addColleaguePanel = new AddColleaguePanel();
	private SubstractColleaguePanel substractColleaguePanel = new SubstractColleaguePanel();
	private MultiplyColleaguePanel multiplyColleaguePanel = new MultiplyColleaguePanel();
	private DivideColleaguePanel divideColleaguePanel = new DivideColleaguePanel();

	public ClientMediatorFrame() {

		setTitle("Calculator");

		setLayout(new GridLayout(4, 1));

		add(addColleaguePanel);
		add(substractColleaguePanel);
		add(multiplyColleaguePanel);
		add(divideColleaguePanel);

		createColleagues();
		
		colleagueChanged(addColleaguePanel);
		colleagueChanged(substractColleaguePanel);
		colleagueChanged(multiplyColleaguePanel);
		colleagueChanged(divideColleaguePanel);

		setLocation(new Point(100, 100));

		pack();
	}

	public static void main(String[] args) {
		ClientMediatorFrame frame = new ClientMediatorFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	@Override
	public void createColleagues() {
		addColleaguePanel.setMediator(this);
		substractColleaguePanel.setMediator(this);
		multiplyColleaguePanel.setMediator(this);
		divideColleaguePanel.setMediator(this);
	}

	@Override
	public void colleagueChanged(IColleague colleague) {		
		int firstNumber = colleague.getFirstNumber();
		int secondNumber = colleague.getSecondeNumber();
		
		addColleaguePanel.setFirstNumber(firstNumber);
		addColleaguePanel.setSecondNumber(secondNumber);
		
		addColleaguePanel.printAnswer(firstNumber + secondNumber);
		
		substractColleaguePanel.setFirstNumber(firstNumber);
		substractColleaguePanel.setSecondNumber(secondNumber);
		
		substractColleaguePanel.printAnswer(firstNumber - secondNumber);
		
		multiplyColleaguePanel.setFirstNumber(firstNumber);
		multiplyColleaguePanel.setSecondNumber(secondNumber);
		
		multiplyColleaguePanel.printAnswer(firstNumber * secondNumber);
		
		divideColleaguePanel.setFirstNumber(firstNumber);
		divideColleaguePanel.setSecondNumber(secondNumber);
		
		divideColleaguePanel.printAnswer(firstNumber / secondNumber);			
	}
}
