package state_pattern;

/**
 * 状态拥有者<br>
 * 是一个具有 “状态” 属性的类，可以定制相关接口，让外界能够得知状态的改变或通过操作让状态改变。
 * 
 */
public class Context {
	State m_state = null;

	/**
	 * 让Context类呈现当前状态下的行为。
	 */
	public void request(int value) {
		m_state.handle(value);
	}

	public void setState(State theState) {
		System.out.println("Context.setState: " + theState);
		this.m_state = theState;
	}
}
