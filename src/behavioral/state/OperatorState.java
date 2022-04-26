package behavioral.state;

public class OperatorState implements IState {

	private static OperatorState singleton = new OperatorState();

	private OperatorState() {
		super();
	}

	public static IState getInstance() {
		return singleton;
	}

	@Override
	public void action(IContext context, String actionCommand) {		
		if (context.isOperator(actionCommand)) {
			context.setLastOperator(actionCommand);			
		} 
		else {
			context.updateDisplay("");
			context.appendInputToDisplay(actionCommand);

			context.changeState(InputState.getInstance());
		}		
	}

	@Override
	public String toString() {
		return "OperatorState";
	}

}
