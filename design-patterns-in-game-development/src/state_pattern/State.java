package state_pattern;

/**
 * 制定状态接口，负责规范Context（状态拥有者）在特定状态下要表现的行为
 * 
 * @author JM
 */
public abstract class State {
	protected Context m_context = null;

	/**
	 * 在产生State类对象时，可以传入Context类对象，并将其指定给类成员m_state.
	 * State类可以获取Context对象的信息或操作Context对象
	 * .handle抽象方法，可以让继承的子类重新定义该方法,来呈现各自不同的状态行为.
	 */
	public State(Context context) {
		this.m_context = context;
	}

	public abstract void handle(int value);
}

// 以下三个类中的handle方法都是：先让它们各自显示不同信息（代表当前状态行为），
// 再按照本身状态的行为定义判断是否要通知Context对象转换到另一状态

class ConcreteStateA extends State {
	public ConcreteStateA(Context context) {
		super(context);
	}

	public void handle(int value) {
		System.out.println("ConcreteStateA.handle");
		if (value > 10)
			m_context.setState(new ConcreteStateB(m_context));
	}
}

class ConcreteStateB extends State {
	public ConcreteStateB(Context context) {
		super(context);
	}

	public void handle(int value) {
		System.out.println("ConcreteStateB.handle");
		if (value > 20)
			m_context.setState(new ConcreteStateC(m_context));
	}
}

class ConcreteStateC extends State {
	public ConcreteStateC(Context context) {
		super(context);
	}

	public void handle(int value) {
		System.out.println("ConcreteStateC.handle");
		if (value > 30)
			m_context.setState(new ConcreteStateA(m_context));
	}
}
