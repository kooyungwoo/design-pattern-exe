package structure.flyweight;

import java.awt.Color;
import java.awt.Font;

public class TextStyleFlywieight {

	private Font font;

	private Color color;

	public TextStyleFlywieight() {
		super();
	}

	public TextStyleFlywieight(Font font, Color color) {
		this.font = font;
		this.color = color;
	}

	public TextStyleFlywieight(String fontName, int fontStyle, int fontSize, Color color) {
		this.font = new Font(fontName, fontStyle, fontSize);
		this.color = color;
	}

	public Font getFont() {
		return font;
	}

	public Color getColor() {
		return color;
	}

}
