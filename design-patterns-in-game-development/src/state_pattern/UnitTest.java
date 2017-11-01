package state_pattern;

public class UnitTest {
	public static void main(String[] args) {
		Context context = new Context();
		context.setState(new ConcreteStateA(context));
		context.request(5);
		context.request(15);
		context.request(25);
		context.request(35);
	}
}
