package structure.bridge;

/*
 * OperationAbstraction에 제곱근, 제곱값을 구하는 메소드를 확장한다
 * 여기 기술되는 내용은 변동이 많을거 같은 내용이다. 수정, 추가, 삭제 등이 빈번이 발생될거 같은 경우 여기에 기술 한다
 * */
public class RefinedOperationAbstraction extends OperationAbstraction {

	public RefinedOperationAbstraction(IBaseOperationImplementor impl) {
		super(impl);
	}

	public int sqrt(int a) {
		return (int) Math.sqrt(a);
	}

	public int pow(int a, int b) {
		return (int) Math.pow(a, b);
	}

}
