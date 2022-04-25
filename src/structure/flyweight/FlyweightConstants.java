package structure.flyweight;

import java.awt.Font;

public class FlyweightConstants {

	public static final String NUMBER_STYLE_NAME = "number";
	public static final String OPERATOR_STYLE_NAME = "operator";
	public static final String ANSWER_STYLE_NAME = "answer";
	public static final String EQUAL_STYLE_NAME = "equal";
	
	public static final int COLUMN_WIDTH = 50;
	public static final int ROW_HEIGHT = 50;
	
	public static final String[] OPERATORS = { "+", "-", "*", "/" };
	public static final String EQUAL_CHAR = "=";
	
	public static final Font DEFAULT_NUMBER_FONT = new Font(Font.DIALOG, Font.PLAIN, 18);
	public static final Font DEFAULT_OPERATOR_FONT = new Font(Font.DIALOG, Font.PLAIN, 18);
	public static final Font DEFAULT_EQUAL_FONT = new Font(Font.DIALOG, Font.PLAIN, 18);
	public static final Font DEFAULT_ANSWER_FONT = new Font(Font.DIALOG, Font.PLAIN, 26);
	
}
