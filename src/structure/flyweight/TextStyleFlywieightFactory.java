package structure.flyweight;

import java.util.HashMap;

public class TextStyleFlywieightFactory {

	private HashMap<String, TextStyleFlywieight> pool = new HashMap<String, TextStyleFlywieight>();

	private static TextStyleFlywieightFactory singleton = new TextStyleFlywieightFactory();

	private TextStyleFlywieightFactory() {
		super();
	}

	public static TextStyleFlywieightFactory getInstance() {
		return singleton;
	}

	public TextStyleFlywieight getTextStyleFlywieight(String name) {
		TextStyleFlywieight textStyle = (TextStyleFlywieight) pool.get(name);
		return textStyle;
	}

	public void putTextStyleFlywieight(String name, TextStyleFlywieight textStyle) {
		pool.put(name, textStyle);
	}

}
