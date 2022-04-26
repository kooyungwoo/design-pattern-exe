package behavioral.observer;

/*
 * 상태 정보를 가지고 있다.
 * observer를 등록하는 registerObserver 메소드, 삭제하는 removeObserver 메소드를 가지고 있습니다.
 * 현재 상태를 알 수 있는 getState메서드를 가지고 있습니다.(현재 소스에는 작성되어 있지 않음)
 * 상태 변경을 전파하는 notifyObservers 메서드를 가지고 있습니다.
 * */
public interface ISubject {

	//상태변경 전파 메서드
	public void notifyObservers();

	//observer 등록
	public void registerObserver(AbstractOperationObserver oberver);

	//observer 삭제
	public void removeObserver(AbstractOperationObserver oberver);

}
