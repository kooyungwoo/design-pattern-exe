package structure.flyweight;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;

import javax.swing.JPanel;

public class PrintAnswerPanel extends JPanel {
	
	private TextStyleFlywieightFactory textStyleFlywieightFactory = TextStyleFlywieightFactory.getInstance();
	
	private int firstNumber;
	private int secondNumber;

	public PrintAnswerPanel() {
		super();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;		

		int[] answer = new int[FlyweightConstants.OPERATORS.length];

		answer[0] = firstNumber + secondNumber;
		answer[1] = firstNumber - secondNumber;
		answer[2] = firstNumber * secondNumber;
		answer[3] = firstNumber / secondNumber;

		FontRenderContext frc = g2.getFontRenderContext();

		for (int i = 0; i < answer.length; i++) {			
			String[] textArray = new String[5];
			textArray[0] = "" + firstNumber;
			textArray[1] = FlyweightConstants.OPERATORS[i];
			textArray[2] = "" + secondNumber;
			textArray[3] = FlyweightConstants.EQUAL_CHAR;
			textArray[4] = "" + answer[i];

			for (int j = 0; j < textArray.length; j++) {
				drawText(g2, frc, j, i, textArray[j]);
			}
		}
	}

	private void drawText(Graphics2D g2, FontRenderContext frc, int column, int row, String text) {

		TextStyleFlywieight textStyle = null;
		if (column == 0 || column == 2) {
			textStyle = textStyleFlywieightFactory.getTextStyleFlywieight(FlyweightConstants.NUMBER_STYLE_NAME);
		} 
		else if (column == 1) {
			textStyle = textStyleFlywieightFactory.getTextStyleFlywieight(FlyweightConstants.OPERATOR_STYLE_NAME);
		} 
		else if (column == 3) {
			textStyle = textStyleFlywieightFactory.getTextStyleFlywieight(FlyweightConstants.EQUAL_STYLE_NAME);
		} 
		else if (column == 4) {
			textStyle = textStyleFlywieightFactory.getTextStyleFlywieight(FlyweightConstants.ANSWER_STYLE_NAME);
		}

		if (textStyle == null) {
			return;
		}

		g2.setColor(textStyle.getColor());

		TextLayout textLayout = new TextLayout(text, textStyle.getFont(), frc);

		float textWidth = textLayout.getAdvance();
		float textHeight = textLayout.getAscent() + textLayout.getDescent();

		float x = FlyweightConstants.COLUMN_WIDTH * column + (FlyweightConstants.COLUMN_WIDTH - textWidth) / 2;
		float y = FlyweightConstants.ROW_HEIGHT * row + (FlyweightConstants.ROW_HEIGHT - textHeight) / 2 + textHeight - textLayout.getDescent();
		textLayout.draw(g2, x, y);

	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}
