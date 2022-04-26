package behavioral.state;

//모든 상태에서 공통으로 사용되는 인터페이스
//각 상태에 맞게 행동(action)을 구현
public interface IState {

	public void action(IContext context, String actionCommand);

}
