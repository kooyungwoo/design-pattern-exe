package behavioral.state;

//내부 상태를 나타내는 인스턴스 변수(state)를 가지고 있는다
public interface IContext {

	public abstract void changeState(IState state);

	public abstract void updateDisplay(String text);

	public abstract void appendInputToDisplay(String input);

	public abstract boolean isOperator(String actionCommand);

	public abstract void calculate();

	public abstract void setLastOperator(String lastCommand);

}
