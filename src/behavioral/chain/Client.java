package behavioral.chain;

//책임연쇄 패턴(chain of responsibillity)
//다양한 처리 방식을 서로 연결하여 사슬로 만들고 요청이 들어오면 사슬을 통해 요청을 처리하는 패턴
public class Client {

	public static void main(String[] args) throws Exception {

		AbstractOperationHandler addOperationHandler = new AddOperationHandler("+");
		AbstractOperationHandler substractOperationHandler = new SubstractOperationHandler("-");
		AbstractOperationHandler multiplyOperationHandler = new MultiplyOperationHandler("*");
		AbstractOperationHandler divideOperationHandler = new DivideOperationHandler("/");

		//addOperationHandler->substractOperationHandler->multiplyOperationHandler->divideOperationHandler
		//순으로 체인 연결
		addOperationHandler.setNext(substractOperationHandler)
				.setNext(multiplyOperationHandler)
				.setNext(divideOperationHandler);

		Request[] requests = { new Request("100+20"), new Request("100-20"),
				new Request("100*20"), new Request("100/20") };

		for (int i = 0; i < requests.length; i++) {
			int answer = addOperationHandler.handleRequest(requests[i]);
			String expression = requests[i].getExpression();

			System.out.println(expression + " = " + answer);
		}

	}

}
