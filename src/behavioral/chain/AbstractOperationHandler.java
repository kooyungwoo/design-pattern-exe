package behavioral.chain;

//체인을 걸기 위한 추상 클래스
//setNext 다음 class를 셋팅할때 return next을 넘겨주고 연결을 추가해 체인을 생성
public abstract class AbstractOperationHandler {

	private String operator;
	private AbstractOperationHandler next;

	public AbstractOperationHandler(String operator) {
		this.operator = operator;
	}

	public AbstractOperationHandler setNext(AbstractOperationHandler next) {
		this.next = next;
		return next;
	}

	//4칙 연산을 수행하기 위한 메소드
	//Client에서 체인으로 연결한 4개의 class를 차례로 순회(next.handleRequest) 하며 operate 부호가 동일한 class의 operate 메소드를 실행
	//동일한 operate 부호를 찾지 못하는 경우 handleFail 호출
	public final int handleRequest(Request request) {
		System.out.println("call handleRequest");
		if (resolve(request)) {
			int result = operate(request);
			return result;
		} 
		else if (next != null) {
			return next.handleRequest(request);
		} 
		else {
			handleFail(request);
			return 0;
		}
	}

	private void handleFail(Request request) {
		System.out.println("fail");
	}

	protected final String getOperator() {
		return operator;
	}

	protected abstract int operate(Request request);

	private boolean resolve(Request request) {
		if (request.getExpression().indexOf(getOperator()) >= 0) {
			return true;
		}

		return false;
	}

}
